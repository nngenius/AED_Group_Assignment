package model.ProductManagement;

import java.util.ArrayList;
import model.OrderManagement.OrderItem;

public class Product {
    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private int revenue;
    private ArrayList<OrderItem> orderitems;

    public Product(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList<>();
    }

    public Product(String n, int fp, int cp, int tp) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList<>();
    }

    public Product updateProduct(int fp, int cp, int tp) {
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        return this;
    }

    public int getTargetPrice() {
        return targetPrice;
    }


    public int getNumberOfProductSalesAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget()) sum++;
        }
        return sum;
    }

    public int getNumberOfProductSalesBelowTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualBelowTarget()) sum++;
        }
        return sum;
    }

    public boolean isProductAlwaysAboveTarget() {
        for (OrderItem oi : orderitems) {
            if (!oi.isActualAboveTarget()) return false;
        }
        return true;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum += oi.calculatePricePerformance();
        }
        return sum;
    }

    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum += oi.getOrderItemTotal();
        }
        return sum;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public void adjustTargetPrice(int newTargetPrice) {
        if (newTargetPrice >= floorPrice && newTargetPrice <= ceilingPrice) {
            this.targetPrice = newTargetPrice;
        } else {
            throw new IllegalArgumentException("New target price must be between floor and ceiling prices.");
        }
    }
    
    public void addOrderItem(OrderItem oi) {
        if (orderitems == null) {
            orderitems = new ArrayList<>();
        }
        orderitems.add(oi);
    }

        public int getRevenue() {
        return getSalesVolume();
    }

    public int getProfitMargin() {
        return getOrderPricePerformance();
    }

}