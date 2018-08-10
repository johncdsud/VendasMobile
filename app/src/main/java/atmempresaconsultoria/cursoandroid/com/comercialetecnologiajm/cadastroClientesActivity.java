package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class cadastroClientesActivity extends AppCompatActivity {

    //DECLARAÇÃO DE IMAGE VIEW
    private ImageView botaosaircadcli;
    private Button botaoclipf;
    private Button botaoclipj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_user);

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTAO PARA CHAMAR A TELA DE CADASTRO DE PESSOA FISICA
        botaoclipf = (Button) findViewById(R.id.pessoafisicaid);
        botaoclipf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientesActivity.this,cadastroClientePFActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTAO PARA CHAMAR A TELA DE CADASTRO DE PESSOA JURIDICA
        botaoclipj = (Button) findViewById(R.id.pessoajuridicaid);
        botaoclipj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientesActivity.this,cadastroClientePJActivity.class));
            }
        });

        //USO DE ID IMAGEVIEW COM CLIQUE DO BOTAO PARA SAIR DESSE MENU E VOLTAR A TELA DE LOGIN
        botaosaircadcli = (ImageView) findViewById(R.id.saircadcli);
        botaosaircadcli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientesActivity.this,loginActivity.class));
            }
        });
    }
}
