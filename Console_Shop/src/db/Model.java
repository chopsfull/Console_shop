package db;

import domain.Manufacturer;
import domain.Product;
import domain.Profile;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static Model instance;
    private List<Manufacturer> manufacturers;
    private List<Profile> profiles = new ArrayList<>();
    private List<Product> products;
    private Profile currentProfile;




    public static Model getInstance()
    {
       if(instance==null)
           instance = new Model();
       return instance;
    }


    public static void setInstance(Model instance) {
        Model.instance = instance;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public void setBalance(double balance) {
        currentProfile.setBalance(balance);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBalance() {

        return currentProfile.getBalance();
    }


    public List<Manufacturer> getManufacturers() {

        return manufacturers;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setCurrentProfile(Profile currentProfile) {
        this.currentProfile = currentProfile;
    }

    public Profile getCurrentProfile() {
        return currentProfile;
    }

    public List<Profile> getProfiles() {

        return profiles;
    }

    public List<String> getProductsPurchased() {
        return currentProfile.getProductsPurchased();
    }

   {
        manufacturers = new ArrayList<>();
        Manufacturer apple = new Manufacturer("Apple", "Apple Inc. is an American multinational technology company headquartered in Cupertino, California, that designs, develops, and sells consumer electronics, computer software, and online services. Its hardware products include the iPhone smartphone, the iPad tablet computer, the Mac personal computer, the iPod portable media player, the Apple Watch smartwatch, and the Apple TV digital media player. Apple's consumer software includes the macOS and iOS operating systems, the iTunes media player, the Safari web browser, and the iLife and iWork creativity and productivity suites. Its online services include the iTunes Store, the iOS App Store and Mac App Store, and iCloud.", "USA", "http://apple.com");
        manufacturers.add(apple);
        Manufacturer microsoft = new Manufacturer("Microsoft", "Microsoft Corporation is an American multinational technology company headquartered in Redmond, Washington, that develops, manufactures, licenses, supports and sells computer software, consumer electronics and personal computers and services. Its best known software products are the Microsoft Windows line of operating systems, Microsoft Office office suite, and Internet Explorer and Edge web browsers. Its flagship hardware products are the Xbox video game consoles and the Microsoft Surface tablet lineup. As of 2011, it was the world's largest software maker by revenue, and one of the world's most valuable companies.", "USA", "https://princeton.edu");
        manufacturers.add(microsoft);
        Manufacturer lenovo = new Manufacturer("Lenovo", "Lenovo Group Ltd. is a Chinese multinational technology company with headquarters in Beijing, China, and Morrisville, North Carolina, United States. It designs, develops, manufactures and sells personal computers, tablet computers, smartphones, workstations, servers, electronic storage devices, IT management software, and smart televisions. In 2015, Lenovo was the world's largest personal computer vendor by unit sales. It markets the ThinkPad line of notebook computers, IdeaPad line of notebook laptops, IdeaCentre line of desktops, Yoga line of notebook laptops, and the ThinkCentre line of desktops.", "China", "http://www.lenovo.com/");
        manufacturers.add(lenovo);
        Manufacturer samsung = new Manufacturer("Samsung", "Samsung is a South Korean multinational conglomerate company headquartered in Samsung Town, Seoul. It comprises numerous subsidiaries and affiliated businesses, most of them united under the Samsung brand, and is the largest South Korean chaebol (business conglomerate).", "South Korea", "http://samsung.com");
        manufacturers.add(samsung);
        Manufacturer sony = new Manufacturer("Sony", "Sony Corporation is a Japanese multinational conglomerate corporation headquartered in Kōnan, Minato, Tokyo, Japan. Its diversified business includes consumer and professional electronics, gaming, entertainment and financial services. The company is one of the leading manufacturers of electronic products for the consumer and professional markets. Sony is ranked 116th on the 2015 list of Fortune Global 500.", "Japan", "http://sony.net");
        manufacturers.add(sony);

        profiles = new ArrayList<>();
        Profile p =new Profile("pasha","322");
        p.setBalance(3700);
        profiles.add(p);

        products = new ArrayList<>();
        Product iphone = new Product("iPhone", "iPhone is a line of smartphones designed and marketed by Apple Inc. They run Apple's iOS mobile operating system.[14] The first generation iPhone was released on June 29, 2007; the most recent iPhone model is the iPhone 7, which was unveiled at a special event on September 7, 2016.", apple, 1000, 25);
        Product ipad = new Product("iPad", "iPad is an iOS-based line of tablet computers designed and marketed by Apple Inc. The first iPad was released on April 3, 2010; the most recent iPad models are the 9.7-inch iPad Pro released on March 31, 2016 and the iPad Mini 4, released on September 9, 2015. The user interface is built around the device's multi-touch screen, including a virtual keyboard. The iPad includes built-in Wi-Fi and cellular connectivity on select models. As of January 2015, there have been over 250 million iPads sold.[7] IPad tablets are second most popular, by sales, against Android-based ones, since 2013, when Android tablet sales increased by 127%.[18]", apple, 2500, 5);
        apple.getProducts().add(ipad);
        apple.getProducts().add(iphone);
        Product surface = new Product("Microsoft Surface", "Microsoft Surface is a series of Windows-based personal computing devices designed and manufactured by Microsoft under its hardware division, a part of the Windows and Devices group. It comprises hybrid tablets, 2-in-1 detachables, and interactive whiteboards.", microsoft, 2200, 45);
        Product xbox = new Product("Xbox", "Xbox is a video gaming brand created and owned by Microsoft. It represents a series of video game consoles developed by Microsoft, with three consoles released in the sixth, seventh, and eighth generations respectively. The brand also represents applications (games), streaming services, and an online service by the name of Xbox Live. The brand was first introduced on November 15, 2001 in the United States, with the launch of the original Xbox console.", microsoft, 800, 125);
        Product lumia = new Product("Microsoft Lumia", "Microsoft Lumia (previously the Nokia Lumia Series) is a range of mobile devices designed and marketed by Microsoft Mobile and previously by Nokia. Introduced in November 2011, the line was the result of a long-term partnership between Nokia and Microsoft—as such, all Lumia smartphones run the Windows Phone operating system. The Lumia name is derived from the partitive plural form of the Finnish word lumi, meaning \"snow\".[1][2]", microsoft, 600, 56);
        microsoft.getProducts().add(surface);
        microsoft.getProducts().add(xbox);
        microsoft.getProducts().add(lumia);
        Product yoga = new Product("Lenovo Yoga", "Lenovo Yoga is a range of laptop and tablet computer products from Lenovo, named for their ability to assume multiple form factors due to a hinged screen.", lenovo, 450, 220);
        lenovo.getProducts().add(yoga);
        Product galaxy = new Product("Samsung Galaxy", "Samsung Galaxy (stylized as SAMSUNG Galaxy, previously Samsung GALAXY) is a series of mobile computing devices designed, manufactured and marketed by Samsung Electronics. The product line includes the Galaxy S series of high-end smartphones, the Galaxy Tab series of tablets, the Galaxy Note series of tablets and phablets with the added functionality of a stylus, and the first version of the Galaxy Gear smartwatch, with later versions dropping the Galaxy branding.", samsung, 300, 15);
        samsung.getProducts().add(galaxy);
        Product cyberShot = new Product("Cyber-shot", "Cyber-shot is Sony's line of point-and-shoot digital cameras introduced in 1996. Cyber-shot model names use a DSC prefix, which is an initialism for \"Digital Still Camera\". Many Cyber-shot models feature Carl Zeiss trademarked lenses, while others use Sony, or Sony G lenses.", sony, 200, 32);
        Product playstation = new Product("PlayStation", "PlayStation is a series of video game consoles created and owned by Sony Interactive Entertainment. The brand was first introduced on December 3, 1994 in Japan with the launch of the original PlayStation console.[1] It now consists of four home consoles, as well as a media center, an online service, a line of controllers, two handhelds and a phone, as well as multiple magazines.", sony, 950, 251);
        Product xperia = new Product("Xperia", "Xperia is the brand name of smartphones and tablets from Sony Mobile. The name Xperia is derived from the word \"experience\"[citation needed], and was first used in the Xperia X1 tagline, \"I Xperia the best\".", sony, 550, 29);
        sony.getProducts().add(cyberShot);
        sony.getProducts().add(playstation);
        sony.getProducts().add(xperia);

        products.add(iphone);
        products.add(ipad);
        products.add(surface);
        products.add(xbox);
        products.add(lumia);
        products.add(yoga);
        products.add(galaxy);
        products.add(cyberShot);
        products.add(playstation);
        products.add(xperia);
    }
}
