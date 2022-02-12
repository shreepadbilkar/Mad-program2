package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    Switch aSwitch;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton=findViewById(R.id.imageButton);
        aSwitch=findViewById(R.id.switch1);
        constraintLayout=findViewById(R.id.layout);

        CalendarView calendarView = new CalendarView(this);
        constraintLayout.addView(calendarView);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(isChecked) {
                    constraintLayout.removeView(calendarView);
                    imageButton.setEnabled(true);
                }
                else{
                    constraintLayout.addView(calendarView);
                    imageButton.setEnabled(false);
                    Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}