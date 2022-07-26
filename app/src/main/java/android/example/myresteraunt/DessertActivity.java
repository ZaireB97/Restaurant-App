package android.example.myresteraunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    RecyclerView dessertList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        dessertList = findViewById(R.id.recycler_view_dessert);

        DessertDish[] dessertDishes = getDessertDishes();

        DesertDishAdapter dessertArrayAdapter = new DesertDishAdapter(dessertDishes);

        dessertList.setAdapter(dessertArrayAdapter);
    }

    @NonNull
    private DessertDish[] getDessertDishes() {
        DessertDish[] dessertDishes = {new DessertDish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", "4.99", R.drawable.dessert_cocoa_cake),
                new DessertDish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", "6.99",R.drawable.dessert_mulberry_crumble),
                new DessertDish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", "5.99",R.drawable.dessert_scone),
                new DessertDish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", "5.99",R.drawable.dessert_crepes),
                new DessertDish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", "4.99",R.drawable.dessert_cinnamon_bun)};
        return dessertDishes;
    }
}