package screens.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Button enterr =  findViewById(R.id.button3);
        enterr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("Button Clicked");

                Intent activitySearchIntent = new Intent(getApplicationContext(),SearchActivity.class);
                startActivity(activitySearchIntent);
            }
        });

    }
}
