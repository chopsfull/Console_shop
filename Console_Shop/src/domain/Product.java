package domain;

public class Product {
    private String name,description,country;
    private int quantity,price;
    private Manufacturer manufacturer;


    public Product(String name, String description, Manufacturer manufacturer, int price, int quantity) {
        this.name = name;
        this.country = manufacturer.getOriginCountry();
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getCountry() {
        return country;
    }
}
