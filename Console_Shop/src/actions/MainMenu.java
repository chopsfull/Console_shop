package actions;

public class MainMenu implements Action {

    public MainMenu() {}

    @Override
    public void showPrompt() {
        System.out.println
                ("***************MAIN MENU*****************\n" +
                        "*1.Product list\t\t\t\t\t\t\t*\n" +
                        "*2.Manufacturer list\t\t\t\t\t*\n" +
                        "*3.Account details\t\t\t\t\t\t*\n" +
                        "*4.Add product\t\t\t\t\t\t\t*\n" +
                        "*0.Exit\t\t\t\t\t\t\t\t\t*\n" +
                        "*****************************************");

    }

    @Override
    public Action perform(int i) {
        switch (i){
            case 1:
                return new ProductList();
            case 2:
                return new ManufacturerList();
            case 3:
                return new AccountDetails();
            case 4:
                return new add_product();
            case 0:
                System.exit(0);
            default: return this;
        }

    }
}
