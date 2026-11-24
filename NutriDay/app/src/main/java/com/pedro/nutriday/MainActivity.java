package com.pedro.nutriday;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {

    EditText email, senha;
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.inputEmail);
        senha = findViewById(R.id.inputSenha);
        entrar = findViewById(R.id.btnEntrar);

        entrar.setOnClickListener(v -> {
            String usuario = email.getText().toString();
            String password = senha.getText().toString();

            if (usuario.isEmpty() || password.isEmpty()) {
                Toast.makeText(this,
                        "Preencha todos os campos!",
                        Toast.LENGTH_SHORT).show();
            } else {
                Intent tela = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(tela);
            }
        });
    }
}