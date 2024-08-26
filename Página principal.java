package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNome, etIdade, etCPF, etEmail;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.etNome);
        etIdade = findViewById(R.id.etIdade);
        etCPF = findViewById(R.id.etCPF);
        etEmail = findViewById(R.id.etEmail);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = etNome.getText().toString();
                String idade = etIdade.getText().toString();
                String cpf = etCPF.getText().toString();
                String email = etEmail.getText().toString();

                Intent intent = new Intent(MainActivity.this, ValidacaoActivity.class);
                intent.putExtra("nome", nome);
                intent.putExtra("idade", idade);
                intent.putExtra("cpf", cpf);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
    }
}
