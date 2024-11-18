package model.ProductManagement;

import java.util.ArrayList;

public class ProductsReport {
    private ArrayList<ProductSummary> productsummarylist;

    public ProductsReport() {
        productsummarylist = new ArrayList<>();
    }

    public void addProductSummary(ProductSummary ps) {
        productsummarylist.add(ps);
    }
    
        public int getTotalRevenue() {
        int totalRevenue = 0;
        for (ProductSummary ps : productsummarylist) {
            totalRevenue += ps.getRevenue();
        }
        return totalRevenue;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder("Product Performance Report:\n\n");
        for (ProductSummary ps : productsummarylist) {
            report.append(ps.toString()).append("\n");
        }
        report.append("Total Revenue: $").append(getTotalRevenue());
        return report.toString();
    }


    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget() {
        ArrayList<ProductSummary> aboveTargetProducts = new ArrayList<>();
        for (ProductSummary ps : productsummarylist) {
            if (ps.getSalesBelowTarget() == 0) {
                aboveTargetProducts.add(ps);
            }
        }
        return aboveTargetProducts;
    }

    public int getTotalProducts() {
        return productsummarylist.size();
    }
}