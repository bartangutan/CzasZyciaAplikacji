package com.example.czaszyciaaplikacji;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int licznik = 0;
    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.i("CYKL ŻYCIA", "uruchomiona metoda onCreate");

        button = findViewById(R.id.button1);
        textview = findViewById(R.id.textView1);
        if(savedInstanceState != null){
            licznik = savedInstanceState.getInt("LICZNIK");
            textview.setText(""+licznik);
        }

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        licznik++;
                        textview.setText(""+licznik);
                    }
                }
        );
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onSaveInstantState");
        outState.putInt("LICZNIK", licznik);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL ŻYCIA", "uruchomiona metoda onRestart");
    }
}