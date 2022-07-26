package android.example.myresteraunt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {

    Dish[] dishes;

    public DishAdapter (Dish[] dishes){
        this.dishes = dishes;

    }

    @Override
    public int getItemCount() {
        return dishes.length;
    }


    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_food_item,parent,false);

        return new DishViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {

        holder.bind(dishes[position]);


    }


    static class DishViewHolder extends RecyclerView.ViewHolder{

        private TextView foodTitle;
        private TextView foodDescription;
        private TextView foodPrice;
        private ImageView foodImage;



        public DishViewHolder(@NonNull View itemView) {
            super(itemView);

            foodTitle = itemView.findViewById(R.id.text_view_food_title);
            foodDescription = itemView.findViewById(R.id.text_view_food_description);
            foodPrice = itemView.findViewById(R.id.text_view_price);
            foodImage = itemView.findViewById(R.id.image_view_food);


        }

        public void bind(Dish dish){

            foodTitle.setText(dish.title);
            foodDescription.setText(dish.description);
            foodPrice.setText(dish.price);
            foodImage.setImageResource(dish.image);


        }

    }
}
