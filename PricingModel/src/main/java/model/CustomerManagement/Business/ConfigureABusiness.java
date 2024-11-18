/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");

    //return business;
    // create Persons
    PersonDirectory persondirectory = business.getPersonDirectory();
    
    //person representing sales organization   
    Person xeroxsalesperson01 = persondirectory.newPerson("Xerox Sales");
    Person xeroxmarketingperson01 = persondirectory.newPerson("Xerox Marketing");
    Person xeroxadminperson01 = persondirectory.newPerson("Xerox Admin");
    
    //Create person objects to represent customer organizations    
    Person person05 = persondirectory.newPerson("Dell");
    Person person06 = persondirectory.newPerson("Microsoft");
    Person person07 = persondirectory.newPerson("Google");
    Person person08 = persondirectory.newPerson("JP Morgan");
    Person person09 = persondirectory.newPerson("State Street");//use this as customer
    
    // Create Customer    
    CustomerDirectory customerdirectory = business.getCustomerDirectory();
    CustomerProfile customerprofile1 = customerdirectory.newCustomerProfile(person05);
    CustomerProfile customerprofile2 = customerdirectory.newCustomerProfile(person06);
    CustomerProfile customerprofile3 = customerdirectory.newCustomerProfile(person07);
    CustomerProfile customerprofile4 = customerdirectory.newCustomerProfile(person08);
    CustomerProfile customerprofile5 = customerdirectory.newCustomerProfile(person09);
    
    // Create Sales People
    SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
    SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson01);
    
    // Create Marketing People
    MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
    MarketingPersonProfile marketingpersonprofile = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson01);
    
    //Create Admins to manage business
    EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
    EmployeeProfile employeeprofile = employeedirectory.newEmployeeProfile(xeroxadminperson01);
    SupplierDirectory supplierdirectory = business.getSupplierDirectory();
    
    Supplier supplier1 = supplierdirectory.newSupplier("Lenovo");
    ProductCatalog productcatalog = supplier1.getProductCatalog();
    Product products1p1 = productcatalog.newProduct("Scanner 3 1",2000, 16500, 10000);
    Product products1p2 = productcatalog.newProduct("Scanner 4",10000, 25000,  16500);
    Product products1p3 = productcatalog.newProduct("Printer 2",22000, 40000,  36500);
    Product products1p4 = productcatalog.newProduct("Photocopier 2",30000, 700000,  50500);
    Product products1p5 = productcatalog.newProduct("Scanner 5",19000, 3650000,  25000);
    Product products1p6 = productcatalog.newProduct("Scanner 6",90000, 1250000,  105000);
    Product products1p7 = productcatalog.newProduct("Printer 3",22000, 60000,  36500);
    Product products1p8 = productcatalog.newProduct("Photocopier 3",30000, 70000,  50000);
    
   Supplier supplier2 = supplierdirectory.newSupplier("Epson");
   productcatalog = supplier2.getProductCatalog();
   Product products2p1 = productcatalog.newProduct("Scanner 13 1",12000, 26000, 18500);
   Product products2p2 = productcatalog.newProduct("Scanner 14",90000, 165000, 12500);
   Product products2p3 = productcatalog.newProduct("Color Printer 112",422000, 540000, 650000);
   Product products2p4 = productcatalog.newProduct("Photocopier 922",43000, 89000, 90500);
   Product products2p5 = productcatalog.newProduct("Low Tonner Scanner 102",195000, 500100, 500000);
   Product products2p6 = productcatalog.newProduct("Speedy Color Scanner 611",900000, 1250000, 1250000);
   Product products2p7 = productcatalog.newProduct("Premium Printer 300",322000, 470000, 560000);
   Product products2p8 = productcatalog.newProduct("Color Photocopier 500",112000, 126000, 118500);
   
   Supplier supplier3 = supplierdirectory.newSupplier("Epson");
   productcatalog = supplier2.getProductCatalog();
   Product products3p1 = productcatalog.newProduct("Scanner 22 1",10200, 25000, 14000);
   Product products3p2 = productcatalog.newProduct("Scanner 2",9000, 16500, 12500);
   Product products3p3 = productcatalog.newProduct("Color Printer 112",422000, 540000, 650000);
   Product products3p4 = productcatalog.newProduct("Photocopier 922",43000, 89000, 90500);
   Product products3p5 = productcatalog.newProduct("Low Tonner Scanner 102",19500, 50010, 50000);
   Product products3p6 = productcatalog.newProduct("Speedy Color Scanner 611",90000, 125000, 125000);
   Product products3p7 = productcatalog.newProduct("Premium Printer 300",32000, 4700, 5600);
   Product products3p8 = productcatalog.newProduct("Color Photocopier 500",112000, 126000, 118500);
   
   Supplier supplier4 = supplierdirectory.newSupplier("Epson");
   productcatalog = supplier2.getProductCatalog();
   Product products4p1 = productcatalog.newProduct("Scanner 41",12000, 26000, 18500);
   Product products4p2 = productcatalog.newProduct("Scanner 14",90000, 165000, 12500);
   Product products4p3 = productcatalog.newProduct("Color Printer 142",422000, 540000, 650000);
   Product products4p4 = productcatalog.newProduct("Photocopier 942",43000, 89000, 90500);
   Product products4p5 = productcatalog.newProduct("Low Tonner Scanner 402",195000, 500100, 500000);
   Product products4p6 = productcatalog.newProduct("Speedy Color Scanner 411",900000, 1250000, 1250000);
   Product products4p7 = productcatalog.newProduct("Premium Printer 400",322000, 470000, 560000);
   Product products4p8 = productcatalog.newProduct("Color Photocopier 400",112000, 126000, 118500);
   
   Supplier supplier5 = supplierdirectory.newSupplier("Epson");
   productcatalog = supplier2.getProductCatalog();
   Product products5p1 = productcatalog.newProduct("Scanner 55",12000, 26000, 18500);
   Product products5p2 = productcatalog.newProduct("Scanner 54",90000, 165000, 12500);
   Product products5p3 = productcatalog.newProduct("Color Printer 152",422000, 540000, 650000);
   Product products5p4 = productcatalog.newProduct("Photocopier 925",43000, 89000, 90500);
   Product products5p5 = productcatalog.newProduct("Low Tonner Scanner 502",195000, 500100, 500000);
   Product products5p6 = productcatalog.newProduct("Speedy Color Scanner 511",900000, 1250000, 1250000);
   Product products5p7 = productcatalog.newProduct("Premium Printer 305",322000, 470000, 560000);
   Product products5p8 = productcatalog.newProduct("Color Photocopier 500",112000, 126000, 118500);
    
// Create User Accounts that link to specific profiles

UserAccountDirectory uadirectory = business.getUserAccountDirectory();
UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXX");
UserAccount ua2 = uadirectory.newUserAccount(marketingpersonprofile, "Marketing", "XXXX");

//Process Order on behalf of the sales person and customer

MasterOrderList masterorderlist = business.getMasterOrderList();
Order order1 = masterorderlist.newOrder(customerprofile4,salespersonprofile );
OrderItem oi1 = order1.newOrderItem(products1p1,18000,1);
OrderItem oi2 = order1.newOrderItem(products1p2,19500,4);
OrderItem oi3 = order1.newOrderItem(products1p3, 35000, 1);
OrderItem oi4 = order1.newOrderItem(products1p4, 405000, 1);
OrderItem oi5 = order1.newOrderItem(products1p5, 3050000, 1);
OrderItem oi6 = order1.newOrderItem(products1p6, 90000, 1);
OrderItem oi7 = order1.newOrderItem(products1p7, 5600, 1);
OrderItem oi8 = order1.newOrderItem(products1p8, 55000, 1);

Order order2 = masterorderlist.newOrder(customerprofile4,salespersonprofile );
OrderItem oi2_1 = order2.newOrderItem(products3p1,18000,2);
OrderItem oi2_2 = order2.newOrderItem(products3p2,195200,3);
OrderItem oi2_3 = order2.newOrderItem(products3p3, 450000, 1);
OrderItem oi2_4 = order2.newOrderItem(products3p4, 450000, 1);
OrderItem oi2_5 = order2.newOrderItem(products3p5, 450000, 1);
OrderItem oi2_6 = order2.newOrderItem(products3p6, 450000, 1);
OrderItem oi2_7 = order2.newOrderItem(products3p7, 450000, 1);
OrderItem oi2_8 = order2.newOrderItem(products3p8, 450000, 1);

 ProductSummary ps = new ProductSummary(products1p1);
/*
System.out.println("Stats==================");
System.out.println("Sales Volume: " +ps.getSalesRevenues());
System.out.println("Profit Margin: " +ps.getProductPricePerformance());
System.out.println("Frequency above target: " +ps.getNumberAboveTarget());
System.out.println("Frequency below target: " +ps.getNumberBelowTarget());*/

return business;
}}

