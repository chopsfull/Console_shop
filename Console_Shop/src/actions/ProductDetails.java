package actions;

import domain.Product;

public class ProductDetails implements Action{
    Product product;
    public ProductDetails(Product p) {
        product = p;
    }

    @Override
    public void showPrompt() {
        System.out.println("NAME:"+product.getName());
        System.out.println("MANUFACTURER:"+product.getManufacturer().getName());
        System.out.println("PRICE:"+product.getPrice());
        System.out.println("Description:"+product.getDescription());
        System.out.println("*\n*\n*\n*\n*\n");
        System.out.println("1.Buy product\n" +
                "2.Manufacturer details\n" +
                "3.Return to the list of products\n" +
                "0.Return to the main menu");
    }

    @Override
    public Action perform(int i) {
        switch (i){
            case 1: return new BuyConfirmation(product);
            case 2: return new ManufacturerDetails(product.getManufacturer());
            case 3: return new ProductList();
            case 0: return new MainMenu();
            default: return this;
        }
    }
}
