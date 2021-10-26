package com.example.primeraapp;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.primeraapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button btn_gracias;
    private Button btn_estornudar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_gracias = (Button)findViewById(R.id.btn_gracias);
        btn_estornudar = (Button)findViewById(R.id.btn_estornudar);
        btn_gracias.setOnClickListener(graciasListener);
        btn_estornudar.setOnClickListener(estornudarListener);


    }
    private View.OnClickListener graciasListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Muestro el mensaje "De nada"
            Toast.makeText(MainActivity.this, "De nada!",
                    Toast.LENGTH_LONG).show();
        }};

    private View.OnClickListener estornudarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
// Muestro el mensaje "Salud!“
            Toast.makeText(MainActivity.this, "Salud!",
                    Toast.LENGTH_LONG).show();

        }};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}