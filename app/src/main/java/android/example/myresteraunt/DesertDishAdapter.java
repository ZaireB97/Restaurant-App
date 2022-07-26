package android.example.myresteraunt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DesertDishAdapter extends RecyclerView.Adapter<DesertDishAdapter.DesertViewHolder> {

    DessertDish[] dishes;


    DesertDishAdapter (DessertDish[] dishes) {
        this.dishes = dishes;
    }

    @Override
    public int getItemCount() {
        return dishes.length;
    }

    @NonNull
    @Override
    public DesertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_dessert_item,parent,false);
        return new DesertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DesertViewHolder holder, int position) {
        holder.bind(dishes[position]);
    }


    static class DesertViewHolder extends RecyclerView.ViewHolder{

        private TextView foodTitle;
        private TextView foodDescription;
        private TextView foodPrice;
        private ImageView foodImage;

        public DesertViewHolder(@NonNull View itemView) {
            super(itemView);

            foodTitle = itemView.findViewById(R.id.text_view_food_title_dessert);
            foodDescription = itemView.findViewById(R.id.text_view_food_description_dessert);
            foodPrice = itemView.findViewById(R.id.text_view_price_dessert);
            foodImage = itemView.findViewById(R.id.image_view_food_dessert);
        }

        public void bind(DessertDish dish){

            foodTitle.setText(dish.title);
            foodDescription.setText(dish.description);
            foodPrice.setText(dish.price);
            foodImage.setImageResource(dish.image);

        }
    }
}
