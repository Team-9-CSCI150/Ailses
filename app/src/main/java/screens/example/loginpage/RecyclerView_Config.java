package screens.example.loginpage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Context;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerView_Config {
    private Context mContext;
    private FoodAdapter mFoodsAdapter;
    public void setConfig(RecyclerView recyclerView,Context context,List<Food> foods, List<String> keys) {
        mContext = context;
        mFoodsAdapter = new FoodAdapter(foods, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mFoodsAdapter);
    }

    class FoodItemView extends RecyclerView.ViewHolder {

        private TextView mName;
        private TextView mPrice;
        private TextView mQuantity;
        private TextView mStore;

        private String key;


        public FoodItemView(ViewGroup parent) {
            super(LayoutInflater.from(mContext).
            inflate(R.layout.food_list_item, parent, false));

            mName = (TextView) itemView.findViewById(R.id.name_text);
            mPrice = (TextView) itemView.findViewById(R.id.price_text);
            mQuantity = (TextView) itemView.findViewById(R.id.quantity_text);
            mStore = (TextView) itemView.findViewById(R.id.store_text);
        }

        public void bind(Food food, String key) {
            mName.setText(food.getName());
            mPrice.setText(food.getPrice());
            mQuantity.setText(food.getAmount());
            mStore.setText(food.getStore());
            this.key = key;
        }
    }

    class FoodAdapter extends RecyclerView.Adapter<FoodItemView> {
        private List<Food> mFoodList;
        private List<String> mKeys;

        public FoodAdapter(List<Food> mFoodList, List<String> mKeys) {
            this.mFoodList = mFoodList;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public FoodItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new FoodItemView(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull FoodItemView holder, int position) {
            holder.bind(mFoodList.get(position),mKeys.get(position));

        }

        @Override
        public int getItemCount() {
            return mFoodList.size();
        }
    }
}
