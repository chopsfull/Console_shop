package actions;

import domain.Manufacturer;

public class ManufacturerDetails implements Action
{
    Manufacturer manufacturer;
    public ManufacturerDetails(Manufacturer m) {
        manufacturer = m;
    }

    @Override
    public void showPrompt() {
        manufacturer.getDetails();
        System.out.println("*\n*\n*\n*\n*\n");
        System.out.println("1.Return to the list of manufacturers\n" +
                "0.Return to the main menu");
    }

    @Override
    public Action perform(int i) {
        switch(i)
        {
            case 1: return new ManufacturerList();
            case 0: return new MainMenu();
            default: return this;
        }
    }
}
