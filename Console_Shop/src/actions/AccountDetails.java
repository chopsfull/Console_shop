package actions;

import db.Model;

public class AccountDetails implements Action {

    @Override
    public void showPrompt() {
        System.out.println("CURRENT BALANCE:$"+ Model.getInstance().getBalance()+"\n"+
                           "PURCHASED PRODUCTS:\t");
        if(Model.getInstance().getProductsPurchased().size()>0) {
        System.out.println("1."+Model.getInstance().getProductsPurchased().get(0)+"\n");
        for (int i = 1; i < Model.getInstance().getProductsPurchased().size(); i++) {
                System.out.println("\t\t\t" + i + 1 + "." + Model.getInstance().getProductsPurchased().get(i) + "\n");
            }
        }
        System.out.println("0 <--- Go back to Main Menu");

    }

    @Override
    public Action perform(int i) {
        if(i==0)
            return new MainMenu();
        else {
            System.out.println("DEAD END");
            return this;
        }
    }
}
