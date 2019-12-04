package screens.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*import com.google.firebase.database.FirebaseDatabase;*/



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add logic here....

        Button getStarted =  findViewById(R.id.getStarted);
        getStarted.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v){
                //System.out.println("Button Clicked");

              // Intent intent = new Intent(getApplicationContext(), FoodActivity.class);
             //  startActivity(intent);

            Intent activityLocationIntent = new Intent(getApplicationContext(),LocationActivity.class);
                    startActivity(activityLocationIntent);
            }
        });
    }
}



/*

    Button btnInsert = (Button) findViewById(R.id.getStarted);
            btnInsert.setOnClickListener(new View.OnClickListener() {
//@Override
public void  onClick(View v) {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
*/
