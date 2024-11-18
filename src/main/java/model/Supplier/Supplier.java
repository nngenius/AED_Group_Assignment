package model.Supplier;

import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductsReport;

public class Supplier {
    String name;
    ProductCatalog productcatalog;

    public Supplier(String n) {
        name = n;
        productcatalog = new ProductCatalog(n);
    }

    public ProductCatalog getProductCatalog() {
        return productcatalog;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Add this method
    public ProductsReport prepareProductsReport() {
        return productcatalog.generatProductPerformanceReport();
    }
}