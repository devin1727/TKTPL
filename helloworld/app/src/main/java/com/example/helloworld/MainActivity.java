package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private TextView txt;

    public void proc(){

        btn1 =(Button)findViewById(R.id.btn1);
        txt = (TextView)findViewById(R.id.txt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                txt.setText("Punten!");
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proc();
    }
}