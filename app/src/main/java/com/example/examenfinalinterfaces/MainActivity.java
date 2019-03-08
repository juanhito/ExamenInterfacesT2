package com.example.examenfinalinterfaces;

import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SwipeRefreshLayout swipeLayout;
    LinearLayout vista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vista = (LinearLayout) findViewById(R.id.info);


        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_texto);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Snackbar snackbar = Snackbar.make(vista, "Estas recargando", Snackbar.LENGTH_SHORT);
                snackbar.setAction("pulsa", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Hola!", Toast.LENGTH_LONG).show();
                    }
                });
                snackbar.show();
                swipeLayout.setRefreshing(false);


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.barra_menu, menu);
        return true;
    }

}

