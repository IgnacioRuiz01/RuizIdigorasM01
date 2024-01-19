package com.vedruna.ruizidigorase01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;

    private TextView loginFallo;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        loginFallo=findViewById(R.id.loginFallo);

    }


    public void login(View view) {


             String textoName = name.getText().toString();
             String textoPassword = password.getText().toString();


            if (textoName.equals("admin") && textoPassword.equals("admin")) {
                loginFallo.setVisibility(View.VISIBLE);
                loginFallo.setText("Usuario y Contreseña correctos");
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
            } else {
                loginFallo.setVisibility(View.VISIBLE);
                loginFallo.setText("Usuario o Contreseña erroneos");
            }



    }
}