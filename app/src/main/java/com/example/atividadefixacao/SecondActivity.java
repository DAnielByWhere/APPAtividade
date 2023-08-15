package com.example.atividadefixacao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextA, editTextB;
    private TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    @SuppressLint("SetTextI18n")
    public void verificarMultiplos(View view) {
        int valorA = Integer.parseInt(editTextA.getText().toString());
        int valorB = Integer.parseInt(editTextB.getText().toString());

        if (valorA % valorB == 0 || valorB % valorA == 0) {
            textViewResultado.setText("São múltiplos");
        } else {
            textViewResultado.setText("Não são múltiplos");
        }
    }
}

