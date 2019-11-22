package screens.example.loginpage;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
//import screens.example.loginpage.Food;

public class FirebaseDatabaseHelper {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceFood;
    private List<Food> products = new ArrayList<>();

    public interface DataStatus {
        void DataIsLoaded(List<Food> products, List<String> keys);
        void DataIsInserted();
        void DataIsDeleted();
        void DataIsUpdated();

    }

    public FirebaseDatabaseHelper() {
        mDatabase = FirebaseDatabase.getInstance();
        mReferenceFood = mDatabase.getReference("products");
    }

    public void readFoods(final DataStatus dataStatus) {
        mReferenceFood.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                products.clear();
                List<String> keys =  new ArrayList<>();

                for(DataSnapshot keyNode : dataSnapshot.getChildren() ) {
                    keys.add(keyNode.getKey());
                    Food product = keyNode.getValue(Food.class);
                    products.add(product);
                }
                dataStatus.DataIsLoaded(products,keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        })

    }


}

