package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class alterarSenhaActivity extends AppCompatActivity {

    //VARIAVEL PARA HABILITAR O USO DA IMAGEVIEW
    private ImageView botaoAltsenha;
    private ImageView botaoSairAltsenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha);




        //USANDO A ID IMAGE VIEW PRA SAIR DA TELA
        botaoSairAltsenha =(ImageView) findViewById(R.id.sairaltsenhaid);

        //SAINDO DA TELA AO CLICAR - AQUI CHAMANDO A TELA DE LOGIN
        botaoSairAltsenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alterarSenhaActivity.this,loginActivity.class));
            }
        });


    }
}

