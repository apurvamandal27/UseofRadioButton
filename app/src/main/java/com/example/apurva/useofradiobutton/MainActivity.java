package com.example.apurva.useofradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r1,r2;
    Button submit;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        submit=findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()){
                    result=r1.getText().toString();
                }else {
                    result=r2.getText().toString();

                }
                Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
