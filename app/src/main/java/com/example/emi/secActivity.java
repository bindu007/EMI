package com.example.emi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class secActivity  extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seclay);
        b1=(Button) findViewById(R.id.bt1);
        t1=(EditText) findViewById(R.id.tv1);
        t2=(EditText) findViewById(R.id.tv2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=t1.getText().toString();
                double d=Double.parseDouble(s1);
                String s=t2.getText().toString();
                if(s1.isEmpty()||s.isEmpty())
                {
                    Toast.makeText(secActivity.this,"Please fill the details",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent (secActivity.this,thirdlay.class);
                    intent.putExtra("amount",d);
                    intent.putExtra("details",s);
                    startActivity(intent);
                }
            }
        });

    }

}
