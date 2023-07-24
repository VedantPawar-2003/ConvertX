package com.vedantpawar.convertx;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void btnclick(View view) {
        EditText dollaramount = findViewById(R.id.dollaramount);
        String dollars = dollaramount.getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleInr = 81.91 * doubleDollars;
        String toastText = "= ₹ " + doubleInr.toString() ;
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}