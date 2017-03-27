package actions;

import db.Model;
import domain.Manufacturer;
import domain.Product;

import java.util.List;
import java.util.Scanner;

public class add_product implements Action {
    private String name,description;
    private int quantity,price;
    private Manufacturer manufacturer;
    private Product product;
    @Override
    public void showPrompt() {
        System.out.println("Welcome to Create wizzard for new products!");
        System.out.println("Enter the name of the product:");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine().trim();
        System.out.println("Enter price:");
        price= scan.nextInt();
        System.out.println("Enter quantity:");
        quantity = scan.nextInt();
        System.out.println("Choose manufacturer from list by number:");
        List<Manufacturer> manufacturersList = Model.getInstance().getManufacturers();
        for(int i = 0; i<manufacturersList.size();i++)
        {
            Manufacturer manufacturer =manufacturersList.get(i);
            System.out.println(i+1+"."+manufacturer.getName()+"\t\t\t"+manufacturer.getOriginCountry()+"\n");

        }
        int n = scan.nextInt();
        if(n>0&&n<=manufacturersList.size())
        {
            manufacturer = manufacturersList.get(n-1);
        }else
            manufacturer=null;
        System.out.println("Add some description:");
        StringBuilder sb = new StringBuilder();
        scan = scan.reset();
        sb.append(scan.nextLine());
        description = sb.toString();

        product = new Product(name,description, manufacturer, price, quantity);
        Model.getInstance().getProducts().add(product);
        System.out.println("Success!");
        System.out.println("NAME:"+product.getName());
        System.out.println("MANUFACTURER:"+product.getManufacturer().getName());
        System.out.println("PRICE:"+product.getPrice());
        System.out.println("Description:"+product.getDescription());
        System.out.println("*\n*\n*\n*\n*\n");
        System.out.println("0-9 <- go to Main Menu");

    }

    @Override
    public Action perform(int i) {
        if(i>=0&&i<=9)
          return new MainMenu();
        return this;
    }
}
