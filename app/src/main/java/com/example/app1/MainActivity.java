package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_off;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_off = (Button)findViewById(R.id.btn_off);
        button_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSecondActivity();
            }
        });
    }
    private void OpenSecondActivity()
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}