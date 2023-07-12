package com.example.leasten1_mahshevon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button equals, del, plus, minus, mult, div;
    TextView tvDisplay, tvEquation;
    Button [] buttons;
    String equation = "", display = "", mathOper = "";
    int num1, num2, answer;

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
        tvDisplay = findViewById(R.id.tvDisplay);
        tvEquation = findViewById(R.id.tvEquation);

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

        for(int i = 0; i < buttons.length; i++)
        {
            if(view  == buttons[i]) {
                display += buttons[i].getText();
                tvDisplay.setText(display);
                num1 = Integer.parseInt(display);
            }
        }
        if(view == del)
        {
            display = "";
            tvDisplay.setText(display);
        }

        else if(view == plus)
        {
            display += " "+plus.getText()+ " ";
            tvDisplay.setText(display);
            mathOper = "+";
            equation += display;
            tvEquation.setText(equation);
            display = "";
            tvDisplay.setText(display);
            num2 = num1;
        }

        else if(view == minus)
        {
            display += " " +minus.getText()+ " ";
            tvDisplay.setText(display);
            mathOper = "-";
            equation += display;
            tvEquation.setText(equation);
            display = "";
            tvDisplay.setText(display);
            num2 = num1;
        }

        else if(view == div)
        {
            display += " "+div.getText()+ " ";
            tvDisplay.setText(display);
            mathOper = "/";
            equation += display;
            tvEquation.setText(equation);
            display = "";
            tvDisplay.setText(display);
            num2 = num1;
        }

        else if(view == mult)
        {
            display += " " +mult.getText() + " ";
            tvDisplay.setText(display);
            mathOper = "*";
            equation += display;
            tvEquation.setText(equation);
            display = "";
            tvDisplay.setText(display);
            num2 = num1;
        }

        else if(view == equals)
        {
            if(mathOper == "+")
            {
                answer = num2 + num1;
            }
            else if(mathOper == "-")
            {
                answer = num2 - num1;
            }
            else if(mathOper == "*")
            {
                answer = num2 * num1;
            }
            else if(mathOper == "/")
            {
                answer = num2 / num1;
            }

            equation += display;
            tvEquation.setText(equation);
            tvDisplay.setText(Integer.toString(answer));
            equation = "";
            display = "";

        }

//        if (display.charAt(display.length() - 1) == ' ')
//        {
//            equation += display;
//            tvEquation.setText(equation);
//            display = "";
//            tvDisplay.setText(display);
//            num2 = num1;
//        }
    }
}