package actions;

import db.Model;
import domain.Product;

import java.text.MessageFormat;
import java.util.Scanner;

public class BuyConfirmation implements Action {
    private Product product;

    public BuyConfirmation(Product p)
    {
        this.product = p;
    }
    @Override
    public void showPrompt() {
        System.out.println(MessageFormat.format("Are you sure you want to buy {0}?(Y/N)",product.getName()));
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().trim().charAt(0);
        if(input=='Y'||input=='y') {
            if(Model.getInstance().getBalance()>=product.getPrice()) {
                Model.getInstance().getProductsPurchased().add(product.getName());
                Model.getInstance().setBalance(Model.getInstance().getBalance()-product.getPrice());
                product.setQuantity(product.getQuantity()-1);
                System.out.println("-"+product.getPrice()+"\n"+product.getName()+" purchased!");
            }else
                System.out.println("Not enough money!");
        }else
            System.out.println("You declined the operation!");
        System.out.println("Push 0-9 <--- Go back to Main Menu");


    }

    @Override
    public Action perform(int i) {
            return new MainMenu();
        }
}
