package com.example.tim.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.tim.calc.Calculator;

public class MainActivity extends AppCompatActivity {
    EditText uitkomst;

    int aantalCijfer; //aantal cijfers in iput
    boolean usedDecimal; // max een decimal in input
    private Calculator calculator;
    boolean eersteGetal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uitkomst = (EditText) findViewById(R.id.editText); //! R staat voor resources, Verwijst naar
        usedDecimal = false;
        eersteGetal = true;
    }

    public void getallen(View v) {

        switch (v.getId()) {
            case (R.id.btnZero):
                aantalCijfer++;
                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "0");
                    calculator.addValue("0");
                    uitkomst.setText(calculator.getValeu());

                }
                break;

            case (R.id.btnOne):
                aantalCijfer++;
                if (aantalCijfer < 15) {
                    calculator.addValue("0");
                    uitkomst.setText(calculator.getValeu());

                }
                break;
            case (R.id.btnTwo):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "2");
                }
                break;
            case (R.id.btnThree):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "3");
                }
                break;
            case (R.id.btnFour):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "4");
                }
                break;
            case (R.id.btnFive):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "5");
                }
                break;
            case (R.id.btnSix):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "6");
                }
                break;
            case (R.id.btnSeven):
                aantalCijfer++;
                if (aantalCijfer < 15) {

                    uitkomst.setText(uitkomst.getText() + "7");
                }
                break;
            case (R.id.btnEight):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "8");
                }
                break;
            case (R.id.btnNine):
                aantalCijfer++;

                if (aantalCijfer < 15) {
                    uitkomst.setText(uitkomst.getText() + "9");
                }
                break;

            case (R.id.btnDecimal):
                aantalCijfer++;

                if (aantalCijfer < 15 && usedDecimal==false) {

                    uitkomst.setText(uitkomst.getText() + ",");
                    usedDecimal = true;
                }
                break;
            case (R.id.btnClear):
                uitkomst.setText("");
                //waardes op nul zetten
                aantalCijfer = 0;
                break;
            case (R.id.btnAdd):
                //waardes op nul zetten



                break;



        }
    }

}








