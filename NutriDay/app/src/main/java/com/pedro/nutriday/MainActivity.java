// Define o pacote ao qual esta classe pertence.
package com.pedro.nutriday;

// Importa as classes necessárias do Android.
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

// Classe principal responsável pela tela inicial do aplicativo.
public class MainActivity extends Activity {

    // Declara os campos de e-mail e senha e o botão de entrada.
    EditText email, senha;
    Button entrar;

    // Método executado quando a tela é criada.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Conecta esta classe ao arquivo de layout XML.
        setContentView(R.layout.activity_main);

        // Relaciona as variáveis aos componentes da interface.
        email = findViewById(R.id.inputEmail);
        senha = findViewById(R.id.inputSenha);
        entrar = findViewById(R.id.btnEntrar);

        // Define o que acontece quando o botão Entrar é pressionado.
        entrar.setOnClickListener(v -> {

            // Obtém os textos digitados nos campos.
            String usuario = email.getText().toString();
            String password = senha.getText().toString();

            // Verifica se algum dos campos está vazio.
            if (usuario.isEmpty() || password.isEmpty()) {

                // Exibe uma mensagem solicitando o preenchimento.
                Toast.makeText(this,
                        "Preencha todos os campos!",
                        Toast.LENGTH_SHORT).show();

            } else {

                // Exibe uma mensagem quando os campos estão preenchidos.
                // Esta etapa ainda não realiza uma autenticação real.
                Toast.makeText(this,
                        "Login recebido!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}