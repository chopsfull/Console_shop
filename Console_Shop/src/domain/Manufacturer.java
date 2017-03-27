package domain;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
    private String name,description,originCountry,url;
    private List<Product> products = new ArrayList<>();

    public Manufacturer(String name,String description,String originCountry,String url)
    {
        this.name = name;
        this.description = description;
        this.originCountry = originCountry;
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getUrl() {
        return url;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void getDetails()
    {
        System.out.println("MANUFACTURER:"+name);
        System.out.println("COUNTRY:"+originCountry);
        System.out.println("Description:"+description);
        System.out.println("Number of products:"+products.size());
        if(products.size()>0)
            for(Product p:products)
                System.out.println("NAME:"+p.getName()+"\tCOUNTRY:"+p.getCountry()+"\tPRICE:"+p.getPrice()+"$");
    }
}
