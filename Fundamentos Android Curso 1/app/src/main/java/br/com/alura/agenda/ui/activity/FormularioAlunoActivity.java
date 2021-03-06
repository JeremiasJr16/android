package br.com.alura.agenda.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.com.alura.agenda.R;
import br.com.alura.agenda.dao.AlunoDAO;
import br.com.alura.agenda.ui.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);
        setTitle("Novo Aluno");
        final AlunoDAO dao=new AlunoDAO();
        final EditText campoNome = findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail = findViewById(R.id.activity_formulario_aluno_email);
         Button botaoSalvar =findViewById(R.id.activity_formulario_aluno_botao_salvar);
         botaoSalvar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
              String nome = campoNome.getText().toString();
              String telefone = campoTelefone.getText().toString();
              String email = campoEmail.getText().toString();
              new Aluno(nome, telefone ,email);
              Aluno alunoCriado = new Aluno (nome, telefone, email);
              dao.salva(alunoCriado);
              finish();
             }
         });
    }
}                                       
