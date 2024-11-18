package model.ProductManagement;

import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import java.util.List;

public class PricingSimulator {
    private SupplierDirectory supplierDirectory;

    public PricingSimulator(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public void adjustTargetPrices() {
        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            for (Product product : supplier.getProductCatalog().getProductList()) {
                if (product.getNumberOfProductSalesBelowTarget() > product.getNumberOfProductSalesAboveTarget()) {
                    // Lower target price
                    int newTargetPrice = (int) (product.getTargetPrice() * 0.95); // 5% reduction
                    product.adjustTargetPrice(newTargetPrice);
                } else if (product.getNumberOfProductSalesAboveTarget() > product.getNumberOfProductSalesBelowTarget()) {
                    // Increase target price
                    int newTargetPrice = (int) (product.getTargetPrice() * 1.05); // 5% increase
                    product.adjustTargetPrice(newTargetPrice);
                }
            }
        }
    }

    public int calculateTotalRevenue() {
        int totalRevenue = 0;
        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            for (Product product : supplier.getProductCatalog().getProductList()) {
                totalRevenue += product.getSalesVolume();
            }
        }
        return totalRevenue;
    }

    public int calculateTotalProfitMargin() {
        int totalProfitMargin = 0;
        for (Supplier supplier : supplierDirectory.getSupplierlist()) {
            for (Product product : supplier.getProductCatalog().getProductList()) {
                totalProfitMargin += product.getOrderPricePerformance();
            }
        }
        return totalProfitMargin;
    }

    public void runSimulation() {
        int initialRevenue = calculateTotalRevenue();
        int initialProfitMargin = calculateTotalProfitMargin();

        adjustTargetPrices();

        int newRevenue = calculateTotalRevenue();
        int newProfitMargin = calculateTotalProfitMargin();

        System.out.println("Simulation Results:");
        System.out.println("Initial Revenue: $" + initialRevenue);
        System.out.println("New Revenue: $" + newRevenue);
        System.out.println("Initial Profit Margin: $" + initialProfitMargin);
        System.out.println("New Profit Margin: $" + newProfitMargin);
    }
}