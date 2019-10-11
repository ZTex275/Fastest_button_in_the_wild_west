package com.fastest.button;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.Switch;

import java.util.Timer;
import java.util.TimerTask;


public class ButtonActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_button);

        final Button button = findViewById(R.id.custom_button);
        //Switch switchEnableButton = findViewById(R.id.switch_enable_button);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    button.setEnabled(false);
                   // Toast.makeText(getApplicationContext(),"Save results...", Toast.LENGTH_SHORT).show();
                    results();
                }
                return false;
            }
        });

        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Click", Toast.LENGTH_SHORT).show();
            }
        });*/

       /* switchEnableButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }
            }
        });*/
    }

    private void results() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(ButtonActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        }, 1000);

    }
}
