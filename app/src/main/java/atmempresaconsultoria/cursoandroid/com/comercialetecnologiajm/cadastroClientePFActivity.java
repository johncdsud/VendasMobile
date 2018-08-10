package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class cadastroClientePFActivity extends AppCompatActivity {

    //DECLARAÇÃO DE SPINNER(LISTA DE ITENS PARA ESCOLHER)
    Spinner Estados;
    Spinner Sexo;

    //DECLARAÇÃO DE IMAGE VIEW
    private ImageView voltar;
    private ImageView abrircli2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_pf);



        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        Sexo = (Spinner) findViewById(R.id.spinnersexo);

        //CRIANDO ADAPTER PARA O USO DO ARRAYLIST DO SPINNER COM USO DA ID----PODE USER OUTROS ALEM DO SIMPLE_SPINNER_ITEM
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(this,R.array.SEXO, android.R.layout.simple_spinner_item);
        Sexo.setAdapter(adapter1);

        //USANDO A ID IMAGE VIEW PARA VOLTAR A TELA DE LOGIN--COM O USO DO CLIQUE
        voltar = (ImageView) findViewById(R.id.vlipfsairid);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientePFActivity.this,loginActivity.class));
            }
        });

        //USANDO A ID IMAGE VIEW PARA CONTINUAR O CADASTRO DE CLIENTE PF-COM O USO DO CLIQUE
        abrircli2 = (ImageView) findViewById(R.id.abrircli2id);
        abrircli2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientePFActivity.this,cadastroClientePF2Activity.class));
            }
        });

    }
}
