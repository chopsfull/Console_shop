package actions;

import db.Model;
import domain.Profile;

import java.util.Scanner;

public class login implements Action
{
    @Override
    public void showPrompt() {
        System.out.println("Hi! You are not logged in! Please authorize.");
        System.out.println("1.Authorize\n2.Register\n3.Quit");
    }

    @Override
    public Action perform(int i) {
        switch (i)
        {
            case 1: return authorize();
            case 2: return register();
            case 3: System.exit(0);
            default: return this;

        }
    }

    private Action authorize()
    {
        System.out.println("Login:");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine().trim();
        System.out.println("Your password:");
        String pass = in.nextLine().trim();
        Model M = Model.getInstance();
        for(Profile p:M.getProfiles()) {
            if (p.getLogin().equals(login) && p.getPassword().equals(pass)) {
                M.setCurrentProfile(p);
                System.out.println("Success!");
                return new Welcome_Balance();
            }
        }
        System.out.println("No such user found! Try again");
        return this;
    }

    private Action register()
    {
        System.out.println("Login:");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine().trim();
        System.out.println("Your password:");
        String pass = in.nextLine().trim();
        Model M = Model.getInstance();
        Profile profile = new Profile(login,pass);
        M.getProfiles().add(profile);
        M.setCurrentProfile(profile);
        System.out.println("Success! Profile created!");
        return new Welcome_Balance();

    }


}
