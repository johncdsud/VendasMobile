package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cadastroUsuarioActivity extends AppCompatActivity {

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private ImageView botaosalvaruser;
    private ImageView botaosairuser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SALVAR  CAD USUARIO E SALVAR NO BANCO GIN


        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SAIR DA TELA DE CAD USUARIO E VOLTAR AO LOGIN
        botaosairuser = (ImageView) findViewById(R.id.sairuserid);
        botaosairuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroUsuarioActivity.this,loginActivity.class));
            }
        });
    }
}
