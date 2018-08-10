package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class alterarUserActivity extends AppCompatActivity {

    //VARIAVEL PARA HABILITAR O USO DA IMAGEVIEW
    private ImageView botaosavealtuser;
    private ImageView botaosairaltuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_user);

        //USANDO A ID IMAGE VIEW PRA SALVAR AS ALTERAÇÕES
        botaosavealtuser = (ImageView) findViewById(R.id.salvaraltuserid);

        //EFETIVANDO O SAVE ASSIM QUE O USUÁRIO CLICA NO IMAGE VIEW - AQUI CHAMANDO A TELA DE LOGIN

        //USANDO A ID IMAGE VIEW PRA SAIR DA TELA
        botaosairaltuser = (ImageView) findViewById(R.id.sairaltuser);

        //SAINDO DA TELA AO CLICAR - AQUI CHAMANDO A TELA DE LOGIN
        botaosairaltuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(alterarUserActivity.this,loginActivity.class));
            }
        });


    }
}
