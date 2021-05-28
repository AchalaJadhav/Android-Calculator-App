package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bClear, bEqual;
    EditText input;
    double value1 = 0, value2 = 0;
    boolean mAdd, mSubtract, mMultiply, mDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fetching Values

        b1 = (Button) findViewById(R.id.buttonOne);
        b2 = (Button) findViewById(R.id.buttonTwo);
        b3 = (Button) findViewById(R.id.buttonThree);
        b4 = (Button) findViewById(R.id.buttonFour);
        b5 = (Button) findViewById(R.id.buttonFive);
        b6 = (Button) findViewById(R.id.buttonSix);
        b7 = (Button) findViewById(R.id.buttonSeven);
        b8 = (Button) findViewById(R.id.buttonEight);
        b9 = (Button) findViewById(R.id.buttonNine);
        b0 = (Button) findViewById(R.id.buttonZero);
        bAdd = (Button) findViewById(R.id.buttonAdd);
        bSub = (Button) findViewById(R.id.buttonSubtract);
        bMul = (Button) findViewById(R.id.buttonMultiply);
        bDiv = (Button) findViewById(R.id.buttonDivide);
        bClear = (Button) findViewById(R.id.buttonDecimal);
        bEqual = (Button) findViewById(R.id.buttonEqual);
        input = (EditText) findViewById(R.id.editTextInput);
    }

    public void setOne(View view) {
        input.setText(input.getText() + "1");
    }

    public void setTwo(View view) {
        input.setText(input.getText() + "2");
    }

    public void setThree(View view) {
        input.setText(input.getText() + "3");
    }

    public void setFour(View view) {
        input.setText(input.getText() + "4");
    }

    public void setFive(View view) {
        input.setText(input.getText() + "5");
    }

    public void setSix(View view) {
        input.setText(input.getText() + "6");
    }

    public void setSeven(View view) {
        input.setText(input.getText() + "7");
    }

    public void setEight(View view) {
        input.setText(input.getText() + "8");
    }

    public void setNine(View view) {
        input.setText(input.getText() + "9");
    }

    public void setZero(View view) {
        input.setText(input.getText() + "0");
    }

    public void add(View view) {
        if (input.getText().length() != 0) {
            value1 = Double.parseDouble(input.getText() + "");
            mAdd = true;
            input.setText(null);
        }
    }

    public void subtract(View view) {
        if (input.getText().length() != 0) {
            value1 = Double.parseDouble(input.getText() + "");
            mSubtract = true;
            input.setText(null);
        }
    }

    public void multiply(View view) {
        if (input.getText().length() != 0) {
            value1 = Double.parseDouble(input.getText() + "");
            mMultiply = true;
            input.setText(null);
        }
    }

    public void divide(View view) {
        if (input.getText().length() != 0) {
            value1 = Double.parseDouble(input.getText() + "");
            mDivide = true;
            input.setText(null);
        }
    }

    public void percentage(View view)
    {
        if (input.getText().length() !=0){
            value1 = Double.parseDouble(input.getText() + "");
            value1 = value1/100;
            input.setText(value1 + " ");
        }
    }
    public void clear(View view)
    {
        input.setText("");
        value1 = value2 = 0;
    }
    public void setDecimal(View view) {input.setText(input.getText() + "."); }

    public void equal(View view) {
        if (mAdd || mSubtract || mMultiply || mDivide) {
            value2 = Double.parseDouble(input.getText() + "");
        }

        if (mAdd) {

            input.setText(value1 + value2 + "");
            mAdd = false;
        }
        if (mSubtract) {

            input.setText(value1 - value2 + "");
            mSubtract = false;
        }

        if (mMultiply) {
            input.setText(value1 * value2 + "");
            mMultiply = false;
        }

        if (mDivide) {
            input.setText(value1 / value2 + "");
            mDivide = false;
        }
    }
}
