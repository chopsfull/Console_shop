import actions.Action;
import actions.Welcome_Balance;
import actions.login;
import db.Model;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Model M = Model.getInstance();
        Action DO = new login();

        while (true) {
            try {
                DO.showPrompt();
                Scanner scan = new Scanner(System.in);
                Integer input = scan.nextInt();
                DO = DO.perform(input);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Something went wrong, sorry");
                DO = new Welcome_Balance();
            }
        }
    }

    static void inputCheck(int input) {
        if (input < 0 && input > 9) {

        }
    }


}
