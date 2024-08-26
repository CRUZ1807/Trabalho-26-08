package com.example.formulario;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ValidacaoActivity extends AppCompatActivity {

    private TextView tvNome, tvIdade, tvCPF, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacao);

        tvNome = findViewById(R.id.tvNome);
        tvIdade = findViewById(R.id.tvIdade);
        tvCPF = findViewById(R.id.tvCPF);
        tvEmail = findViewById(R.id.tvEmail);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvNome.setText("Nome: " + extras.getString("nome"));
            tvIdade.setText("Idade: " + extras.getString("idade"));
            tvCPF.setText("CPF: " + extras.getString("cpf"));
            tvEmail.setText("E-mail: " + extras.getString("email"));
        }
    }
}
