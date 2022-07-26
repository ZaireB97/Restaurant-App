package android.example.myresteraunt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {


    RecyclerView startersList;


    CardView startersCard;
    CardView mainCard;
    CardView dessertCard;
    ExecutorService executor;
    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startersList = findViewById(R.id.recycler_view);


//        Dish[] dishArray = getDishes();

//        DishAdapter arrayAdapter = new DishAdapter(dishArray);
//        startersList.setAdapter(arrayAdapter);
        startersCard = findViewById(R.id.cardViewStarters);
        mainCard = findViewById(R.id.cardViewMainCourse);
        dessertCard = findViewById(R.id.cardViewDessert);

        executor = Executors.newSingleThreadExecutor();
        handler = new Handler(Looper.getMainLooper());


        starterListener();


        mainListenter();

        dessertListener();


        TextView emailTextView = findViewById(R.id.emailAddress);
        TextView phoneNumberTextView = findViewById(R.id.text_view_phone_number);

        /*
        using sendto will ensure that we open the email app to
        send the email and not any other app.
         */

        emailButton(emailTextView);
        phoneNumber(phoneNumberTextView);


    }

    private void starterListener() {
        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent starterIntent = new Intent(MainActivity.this, StartersActivity.class);

//                        starterIntent.putExtra("starter dishes",dishArray);

                startActivity(starterIntent);

            }


        });
    }

    private void mainListenter() {
        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent mainIntent = new Intent(MainActivity.this, MainCourseActivity.class);

                startActivity(mainIntent);
            }
        });
    }

    private void dessertListener() {
        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dessertIntent = new Intent(MainActivity.this, DessertActivity.class);

                startActivity(dessertIntent);


            }
        });
    }

    private void emailButton(TextView emailTextView) {
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmailIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailIntent.setData(Uri.parse("mailto:hungryHumans@somethingmail.com"));
                startActivity(launchEmailIntent);


            }
        });
    }

    private void phoneNumber(TextView phoneNumberTextView) {

        phoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchPhoneApp = new Intent(Intent.ACTION_DIAL);
                launchPhoneApp.setData(Uri.parse("tel:" + "5556667777"));
                startActivity(launchPhoneApp);
            }
        });
    }
}




