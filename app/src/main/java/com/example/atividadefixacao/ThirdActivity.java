package com.example.atividadefixacao;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;




public class ThirdActivity extends AppCompatActivity {
    private EditText editTextOpcao, editTextQTD;
    private TextView textViewPreco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        editTextQTD = findViewById(R.id.editTextQTD);
        editTextOpcao = findViewById(R.id.editTextOpcao);
        textViewPreco = findViewById(R.id.textViewPreco);

    }

    @SuppressLint("SetTextI18n")
    public void Preco (View view) {
        int QTD = Integer.parseInt(editTextQTD.getText().toString());
        double Valor;
        int Preco;
        String Opcao = editTextOpcao.getText().toString();

        switch (Opcao) {
            case "C":
                Valor = 2;
                Preco = (int) (Valor * QTD);

                textViewPreco.setText("O valor é de " + Preco +" Reais");
                break;
            case "R":
                Valor = 2.50;
                Preco = (int) (Valor * QTD);

                textViewPreco.setText("O valor é de " + Preco + " Reais");
                break;
            case "S":
                Valor = 1.50;
                Preco = (int) (Valor * QTD);

                textViewPreco.setText("O valor é de" + Preco + " Reais");
                break;
            default:
                textViewPreco.setText("Há algo errado, verifique as informações inseridas");
                break;
        }
    }


}