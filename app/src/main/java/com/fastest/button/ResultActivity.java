package com.fastest.button;

import android.os.Bundle;
import android.widget.Toast;

public class ResultActivity extends ButtonActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toast.makeText(getApplicationContext(), "Results", Toast.LENGTH_SHORT).show();
    }
}