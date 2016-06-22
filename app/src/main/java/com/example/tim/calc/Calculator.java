package com.example.tim.calc;

import android.text.Editable;
import android.widget.EditText;

/**
 * Created by Tim on 9-6-2016.
 */
public class Calculator {

String valeu;

    public void addValue(String valeu){
        this.valeu = this.valeu+valeu;
    }

    public String getValeu() {
        return valeu+valeu;
    }
}
