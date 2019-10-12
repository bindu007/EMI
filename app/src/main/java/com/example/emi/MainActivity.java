package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   public  Button b1;
   public  EditText t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.bt1);
        t1=(EditText) findViewById(R.id.tv1);
        t2=(EditText) findViewById(R.id.tv2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String g=t1.getText().toString();
                Intent intent = new Intent(MainActivity.this, secActivity.class);
                startActivity(intent);
            }

        });
    }
}
