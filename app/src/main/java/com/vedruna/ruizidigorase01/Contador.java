package com.vedruna.ruizidigorase01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Contador extends AppCompatActivity {

    private EditText numero;

    int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero=findViewById(R.id.numero);
        num= Integer.parseInt(numero.getText().toString());
    }

    public void sumar(View view){
        num++;
        numero.setText(String.valueOf(num));
    }

    public void reset(View view){
        num=0;
        numero.setText(String.valueOf(num));
    }

    public void resta(View view){
        if (num>0){
            num--;
            numero.setText(String.valueOf(num));
        }

    }
}