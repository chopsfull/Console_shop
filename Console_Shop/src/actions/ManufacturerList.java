package actions;

import db.Model;
import domain.Manufacturer;

import java.util.List;

public class ManufacturerList implements Action {
    @Override
    public void showPrompt() {
        System.out.println("Name\t\t\tCountry\n");
        List<Manufacturer> manufacturersList = Model.getInstance().getManufacturers();
        for(int i = 0; i<manufacturersList.size();i++)
        {
            Manufacturer manufacturer =manufacturersList.get(i);
            System.out.println(i+1+"."+manufacturer.getName()+"\t\t\t"+manufacturer.getOriginCountry()+"\n");

        }

        System.out.println("0 <--- Go back to Main Menu");

    }

    @Override
    public Action perform(int i) {
        if(i>0&&i<=Model.getInstance().getManufacturers().size())
        {
            return new ManufacturerDetails(Model.getInstance().getManufacturers().get(i-1));
        }
        if(i==0)
        {
            return new MainMenu();
        }

        return this;
    }
}
