package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int initialNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialNum = 50;
        String initialNumber = ""+initialNum+"";
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText(initialNumber);
    }
    public void onClickIncrimentButton(View v) {
        initialNum = initialNum + 1;
        String initialNumber = ""+initialNum+"";
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText(initialNumber);
    }
    public void onClickDecrimentButton(View v) {
        initialNum = initialNum - 1;
        String initialNumber = ""+initialNum+"";
        TextView t = (TextView) findViewById(R.id.outputField);
        t.setText(initialNumber);
    }

}