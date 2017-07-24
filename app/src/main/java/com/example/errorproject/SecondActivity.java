package com.example.errorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView quote;
    Button clk;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       /* quote = (TextView) findViewById(R.id.textview);
        clk = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.editText); */
    }

    /*Button button = (Button) findViewById(R.id.Edit);
    button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            public void changeTrackerName1(View v){
                String st = et.getText().toString();
                quote.setText(st);
            }
            // Do something in response to button click
        }
    }; */

}
