package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class cadastroMarcasActivity extends AppCompatActivity {

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private android.widget.ImageView botaosalvamarca;
    private android.widget.ImageView botaosairmarca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_marcas);

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SALVAR O CADASTRO



        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SAIR DA TELA DE CAD FORN E VOLTAR AO LOGIN
        botaosairmarca= (android.widget.ImageView) findViewById(R.id.saircadmarca);
        botaosairmarca.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new android.content.Intent(cadastroMarcasActivity .this,loginActivity.class));
            }
        });
    }
}
