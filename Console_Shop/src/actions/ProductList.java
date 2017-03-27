package actions;

import db.Model;
import domain.Product;

import java.util.List;

public class ProductList implements Action {
    @Override
    public void showPrompt() {
        System.out.println("#\ttName\t\t\t\t\tCountry\t\t\t\t\tPrice($$$)\n");
        List<Product> productList = Model.getInstance().getProducts();
        if(productList.size()>0) {
            for (int i = 0; i < productList.size(); i++) {
                Product product = productList.get(i);
                System.out.println(i + 1 + "." + product.getName() + "\t\t\t\t\t" + product.getCountry() + "\t\t\t\t\t" + product.getPrice() + "\n");

            }
        }
        else{
            System.out.println("<no products>");
        }

        System.out.println("0 <--- Go back to Main Menu\n");

    }

    @Override
    public Action perform(int i) {
        if(i>0&&i<=Model.getInstance().getProducts().size())
        {
            return new ProductDetails(Model.getInstance().getProducts().get(i-1));
        }
        if(i==0)
        {
            return new MainMenu();
        }

        return this;
    }
}
