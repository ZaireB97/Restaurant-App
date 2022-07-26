package android.example.myresteraunt;

public class MainDish {
    String title;
    String description;
    int image;
    String price;

    MainDish(String title, String description, String price, int image){

        this.title = title;
        this.image = image;
        this.description = description;
        this.price = price;

    }

    /*
    This will give us a string a value instead of displaying
    the package name followed by random code when the app
    is running
     */
    @Override
    public String toString() {
        return title + description + price + image;

    }

}
