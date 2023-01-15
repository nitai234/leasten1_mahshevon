package com.example.leasten1_mahshevon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button equals, del, plus, minus, mult, div;
    TextView tvanswer;
    Button [] buttons;
    String tv;
    double answer;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Button[]
                {findViewById(R.id.bt0),
                findViewById(R.id.bt1),
                findViewById(R.id.bt2),
                findViewById(R.id.bt3),
                findViewById(R.id.bt4),
                findViewById(R.id.bt5),
                findViewById(R.id.bt6),
                findViewById(R.id.bt7),
                findViewById(R.id.bt8),
                findViewById(R.id.bt9)};
        equals = findViewById(R.id.btS);
        del = findViewById(R.id.btAC);
        plus = findViewById(R.id.btP);
        minus = findViewById(R.id.btM);
        mult = findViewById(R.id.btK);
        div = findViewById(R.id.btH);

        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i].setOnClickListener(this);
        }

        equals.setOnClickListener(this);
        del.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);


    }

    public void onClick(View view)
    {




    }
}