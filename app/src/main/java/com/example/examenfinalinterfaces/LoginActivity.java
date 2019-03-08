package com.example.examenfinalinterfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        boton = (Button)findViewById(R.id.botonLogin);
        final Intent I = new Intent(this,MainActivity.class);
        View.OnClickListener cambio = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(I);

            }
        };

        boton.setOnClickListener(cambio);
    }
}
