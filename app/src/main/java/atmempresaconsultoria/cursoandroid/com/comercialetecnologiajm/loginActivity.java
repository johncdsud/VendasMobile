package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private ImageView botaoMenu;
    private TextView  textocadastrese;
    private TextView  textoesqueceuuser;
    private TextView textoesqueceusenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //USO DE ID DO IMAGE VIEW COM CLIQUE PARA IR AO MENU PRINCIPAL DO PROGRAMA
        botaoMenu = (ImageView) findViewById(R.id.entrarlogin);
        botaoMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                startActivity(new Intent(loginActivity.this,MenuJMActivity.class)); }

    });


        //USO DO ID DO IMAGEVIEW PARA IR AO FORMULARIO DE CADASTRO DE USUARIO
        textocadastrese = (TextView) findViewById(R.id.cadastrese);
        textocadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,cadastroUsuarioActivity.class));
            }
        });

        //USO DO ID DO IMAGEVIEW PARA IR AO FORMULARIO DE MUDAR O USUARIO
        textoesqueceuuser= (TextView) findViewById(R.id.esqueceuusuario);
        textoesqueceuuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,alterarUserActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW PARA IR AO FORMULARIO DE ALTERAÇÃO DE SENHA
        textoesqueceusenha= (TextView) findViewById(R.id.esqueceusenha);
        textoesqueceusenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,alterarSenhaActivity.class));
            }
        });
    }
}

