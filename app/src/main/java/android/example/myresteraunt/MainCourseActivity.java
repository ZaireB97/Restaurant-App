package android.example.myresteraunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.concurrent.ExecutorService;

public class MainCourseActivity extends AppCompatActivity {

    ExecutorService executor;
    RecyclerView mainCourseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);

        RecyclerView mainCourseList;

        mainCourseList = findViewById(R.id.recycler_view_main_course);

        MainDish[] mainDishes = getMainDishes();


        MainDishAdapter mainDishAdapter = new MainDishAdapter(mainDishes);

        mainCourseList.setAdapter(mainDishAdapter);


    }


    private MainDish[] getMainDishes() {

        MainDish[] mainDishes = {new MainDish("Salmon and Potatoes", "Fresh Salmon and Baked Potatoes", "13.99", R.drawable.main_salmon_potatoes),
                new MainDish("Beef Enchiladas", "Seasoned Beef Enchiladas", "11.99", R.drawable.main_enchillada),
                new MainDish("Beer and Brown Sugar Kielbasa & Sauerkraut", "Our Signature Beer and Brown Sugar Kielbasa & Sauerkraut", "12.99", R.drawable.main_kielbasa),
                new MainDish("Coconut Shrimp with Mango Dipping Sauce", "Fried Coconut Shrimp, with Sweet Mango Dipping Sauce", "12.99", R.drawable.main_coconut_shrimp),
                new MainDish("Crab Cakes", "Freshly made Crab Cakes", "13.99", R.drawable.main_crab_cakes),
                new MainDish("Favorite Meatloaf", "Our Signature Meatloaf and Potatoes", "13.99", R.drawable.meatloaf),
                new MainDish("Double Stack Mushroom Burger", "Beefy Burger with American Cheese,Mushrooms,Mayonnaise, Lettuce, Tomatoes", "13.99", R.drawable.main_mushroom_burger),
                new MainDish("Habanero BBQ Shrimp ", "Lightly seasoned and Grilled Shrimp, with Habanero Seasoning", "12.99", R.drawable.main_bbq_shrimp),
                new MainDish("Pork Ribs", "Grilled BBQ Porked Ribs", "14.99", R.drawable.main_pork_ribs),
                new MainDish("Fish Tacos", "Tacos with Salmon", "12.99", R.drawable.main_fish_tacos),
                new MainDish("Seared Scallops", "Fresh Scallops", "11.99", R.drawable.main_scallops),
                new MainDish("Spaghetti", "Spaghetti with Meatballs", "11.99", R.drawable.main_spaghetti),
                new MainDish("Beef Stew", "Beef Stew with Onions, Carrots, and Gravy", "12.99", R.drawable.main_beef_stew),
                new MainDish("Fried Pork Chops with Peas and Potatoes", "Fried Pork Chops, a Baked Potato, and Peas ", "14.99", R.drawable.main_pork_chops),
                new MainDish("Pan-Seared Steak", "Thin Cut Steak with Potatoes", "13.99", R.drawable.main_steak),
                new MainDish("Lemon Chicken", "Baked Lemon Seasoned Chicken", "10.35", R.drawable.lemon_chicken),
                new MainDish("Baked Ziti", "Four Cheese Baked Ziti", "12.99", R.drawable.main_baked_ziti),
                new MainDish("Pasta with Shrimp and Tomato Cream Sauce", "Fresh Cooked Penne Pasta with Tomato Cream Sauce ", "13.99", R.drawable.main_shrimp_pasta),
                new MainDish("Roasted Beef Tenderloin", "Lightly Seasoned Roasted Beef", "12.99", R.drawable.main_roast_beef),
                new MainDish("Coffee Rubbed Steak", "Tender Steak rubbed with Sweet Coffee Grounds", "15.99", R.drawable.main_ground_steak)};
        return mainDishes;

    }


}

