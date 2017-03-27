package actions;

import db.Model;

public class Welcome_Balance implements Action {

    String welcomeLine = "█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
            "█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\n" +
            "█░░║║║╠─║─║─║║║║║╠─░░█\n" +
            "█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█\n" +
            "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█";
    @Override
    public void showPrompt() {
        System.out.println(welcomeLine);
        if(Model.getInstance().getCurrentProfile().getBalance()==0) {
            System.out.println("Start balance(<500000$):");
        }else {
            System.out.println("0 <- go to main menu");
        }
    }

    @Override
    public Action perform(int i) {
        if(i>0&&i<=500000) {
            Model.getInstance().setBalance(i);
            System.out.println("Your balance is:" + i + "$");
            return new MainMenu();
        }
        if( i == 0)
                return new MainMenu();

        else
        {
            System.out.println("Wrong input! try again..");
            welcomeLine="one more try";
            return this;
        }
    }
}
