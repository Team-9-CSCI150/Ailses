package screens.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestForAlex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_for_alex);

        Button getStarted =  findViewById(R.id.getStarted);
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("Button Clicked");

                Intent testIntent = new Intent(getApplicationContext(),test_for_alex2.class);
                startActivity(testIntent);
            }
        });
    }

}
