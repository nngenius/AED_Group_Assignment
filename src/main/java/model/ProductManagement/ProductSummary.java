package model.ProductManagement;

public class ProductSummary {
    private Product product;
    private int initialTargetPrice;
    private int adjustedTargetPrice;
    private int salesBelowTarget;
    private int salesAboveTarget;
    private int revenue;

    public ProductSummary(Product p) {
        this.product = p;
        this.initialTargetPrice = p.getTargetPrice();
        this.adjustedTargetPrice = p.getTargetPrice();
        this.salesBelowTarget = p.getNumberOfProductSalesBelowTarget();
        this.salesAboveTarget = p.getNumberOfProductSalesAboveTarget();
        this.revenue = p.getRevenue();
    }

    public void setAdjustedTargetPrice(int adjustedPrice) {
        this.adjustedTargetPrice = adjustedPrice;
    }

    public String getProductName() {
        return product.toString();
    }

    public int getInitialTargetPrice() {
        return initialTargetPrice;
    }

    public int getAdjustedTargetPrice() {
        return adjustedTargetPrice;
    }

    public int getSalesBelowTarget() {
        return salesBelowTarget;
    }

    public int getSalesAboveTarget() {
        return salesAboveTarget;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getPricePerformance() {
        return product.getOrderPricePerformance();
    }

    @Override
    public String toString() {
        return String.format("Product: %s\n" +
                        "Initial Target Price: %d\n" +
                        "Adjusted Target Price: %d\n" +
                        "Sales Below Target: %d\n" +
                        "Sales Above Target: %d\n" +
                        "Revenue: %d\n" +
                        "Price Performance: %d\n",
                getProductName(), initialTargetPrice, adjustedTargetPrice,
                salesBelowTarget, salesAboveTarget, revenue, getPricePerformance());
    }
}