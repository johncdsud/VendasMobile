package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cadastroClientePJActivity extends AppCompatActivity {

    //DECLARAÇÃO DE IMAGE VIEW
    private ImageView contclipj;
    private ImageView saircadclipj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_pj);

        //USO DE ID DO IMAGEVIEW COM CLIQUE PARA CHAMADA DA TELA DE CADASTRO DE CLIENTE2
        contclipj =(ImageView) findViewById(R.id.contcliid);
        contclipj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientePJActivity.this,cadastroClientePJ2Activity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW COM CLIQUE PARA SAIR E VOLTAR A TELA DE LOGIN
        saircadclipj = (ImageView) findViewById(R.id.saircadclipjid);
        saircadclipj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientePJActivity.this,loginActivity.class));
            }
        });


    }
}


