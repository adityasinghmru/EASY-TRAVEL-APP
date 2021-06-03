package com.example.ie;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    public static final String[] States = {"Kerala", "Goa", "Himachal"};
    private String selectedLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //showing the states in spinner
        spinner = findViewById(R.id.spinner);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, States);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectedLang=spinner.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});

    }


    public void button(View view) {

    

        if (selectedLang.equals("Kerala")) {

            Intent intent = new Intent(MainActivity.this, Fragment.class);
            startActivity(intent);
        } else if (selectedLang.equals("Goa")) {

            Intent intent = new Intent(MainActivity.this, Fragment_goa.class);
            startActivity(intent);

        } else if (selectedLang.equals("Himachal")) {

            Intent intent = new Intent(MainActivity.this, fragment_HP.class);
            startActivity(intent);

        } else {
            Toast.makeText(MainActivity.this, "Please select a language", Toast.LENGTH_SHORT).show();
        }

    
            }
    

    public void Introvert_bt(View view) {
        Toast.makeText(this, "Introvert", Toast.LENGTH_SHORT).show();
    }

    public void Extrovert_bt(View view) {
        Toast.makeText(this, "Extrovert", Toast.LENGTH_SHORT).show();

    }
}