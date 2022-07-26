package android.example.myresteraunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class StartersActivity extends AppCompatActivity {

    RecyclerView startersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        startersList = findViewById(R.id.recycler_view);


        Dish[] dishArray = getDishes();


        DishAdapter arrayAdapter = new DishAdapter(dishArray);
        startersList.setAdapter(arrayAdapter);


    }

    @NonNull
    private Dish[] getDishes() {
        Dish[] dishArray = {new Dish("Fries", "Crisp plain fries", "5.99", R.drawable.starter_fries), new Dish("Salad", "Fully loaded salad with your choice of dressing", "8.99", R.drawable.starter_salad),
                new Dish("Mozzarella Sticks", "Traditional style", "7.99", R.drawable.starter_mozarella_sticks),
                new Dish("Chips", "Choose from Lays, Ruffles, Fritos, Doritios", "2.99", R.drawable.starter_chips),
                new Dish("Wings", "Comes in Hot, Mild, Hot and Honey, Buffalo, Outer Space(10,15,20)", "10.99", R.drawable.starter_wings),
                new Dish("Pickles", "Dill Pickles", "1.99", R.drawable.starter_pickles),
                new Dish("Loaded Fries", "Fries with Cheese and Bacon", "6.99", R.drawable.starter_loaded_fry),
                new Dish("Cheese", "Your choice of Cheddar, American, or Provolone", "2.99", R.drawable.starter_cheese),
                new Dish("Sweet Potato Fries", "Our Traditional Sweet Potato Fries", "6.99", R.drawable.starter_sweet_potatoe),
                new Dish("Chicken Tenders", "Lightly Breaded Chicken Tenders", "8.99", R.drawable.starter_chicken_tenders),
                new Dish("Nachos", "Traditional Nachos with Cheese", "8.99", R.drawable.starter_nachos),
                new Dish("Deluxe Nachos", "Includes Bacon", "9.99", R.drawable.starter_deluxe_nachos),
                new Dish("Mushrooms", "Seasoned Mushrooms", "12.99", R.drawable.starter_mushroom),
                new Dish("Dumplings", "Choose from Pork, Beef, Chicken, Vegetarian", "8.99", R.drawable.starter_dumplings),
                new Dish("Empanadas", "Hard Fried Empanadas", "8.99", R.drawable.starter_empanada),
                new Dish("Oysters", "Fresh Oysters", "7.99", R.drawable.starter_oyster),
                new Dish("Spring Rolls", "Choose from Pork, Beef, Chicken, Vegetarian", "8.99", R.drawable.starter_spring_roll),
                new Dish("Garlic Bread", "Fresh Garlic Bread", "3.99", R.drawable.starter_garlic_bread),
                new Dish("Brushchetta", "Topped with Tomatoes and Herbs", "9.99", R.drawable.starter_bruschetta)};
        return dishArray;
    }
}

