package screens.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;


public class FoodActivity extends AppCompatActivity {

    private RecyclerView mRecylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        mRecylerView = (RecyclerView) findViewById(R.id.recycler_view_foods);
        new FirebaseDatabaseHelper().readFoods(new FirebaseDatabaseHelper.DataStatus() {
            @Override
            public void DataIsLoaded(List<Food> products, List<String> keys) {
                new RecyclerView_Config().setConfig(mRecylerView,FoodActivity.this, products,keys );
            }

            @Override
            public void DataIsInserted() {

            }

            @Override
            public void DataIsDeleted() {

            }

            @Override
            public void DataIsUpdated() {

            }
        });
    }
}
