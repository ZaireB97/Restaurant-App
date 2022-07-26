package android.example.myresteraunt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainDishAdapter extends RecyclerView.Adapter<MainDishAdapter.MainDishViewHolder> {

    private MainDish[] dishes;

    MainDishAdapter(MainDish[] dishes){

        this.dishes = dishes;

    }


    @Override
    public int getItemCount() {
        return dishes.length;
    }


    @NonNull
    @Override
    public MainDishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_maincourse_item,parent,false);

        return new MainDishViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainDishViewHolder holder, int position) {

        holder.bind(dishes[position]);

    }



    static class MainDishViewHolder extends RecyclerView.ViewHolder{

        private TextView foodTitle;
        private TextView foodDescription;
        private TextView foodPrice;
        private ImageView foodImage;

        public MainDishViewHolder(@NonNull View itemView) {
            super(itemView);

            foodTitle = itemView.findViewById(R.id.text_view_food_title_main);
            foodDescription = itemView.findViewById(R.id.text_view_food_description_main);
            foodPrice = itemView.findViewById(R.id.text_view_price_main);
            foodImage = itemView.findViewById(R.id.image_view_food_main);
        }

        public void bind(MainDish dish){
            foodTitle.setText(dish.title);
            foodDescription.setText(dish.description);
            foodPrice.setText(dish.price);
            foodImage.setImageResource(dish.image);

        }
    }
}
