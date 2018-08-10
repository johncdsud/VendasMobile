package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Pedidos1Activity extends AppCompatActivity {

    //DECLARAÇÃO DA VARIAVEL PARA USO DO SPINNER LIST
    Spinner CLIENTES;
    Spinner CONDPAG;
    Spinner PRODUTOSPED;

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private ImageView salvaped1;
    private ImageView sairped1;
    private ImageView addadcliped1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos1);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        CLIENTES = (Spinner) findViewById(R.id.spinnercliente);
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(Pedidos1Activity.this,R.array.CLIENTE, android.R.layout.simple_spinner_item);
        CLIENTES.setAdapter(adapter1);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        CONDPAG = (Spinner) findViewById(R.id.spinnerpag);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(Pedidos1Activity.this,R.array.CONDPAG, android.R.layout.simple_spinner_item);
        CONDPAG.setAdapter(adapter);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        PRODUTOSPED = (Spinner) findViewById(R.id.produtosspiner3);
        ArrayAdapter adapter2= ArrayAdapter.createFromResource(Pedidos1Activity.this,R.array.PRODUTOS, android.R.layout.simple_spinner_item);
        PRODUTOSPED.setAdapter(adapter2);

        //USO DA ID DO IMAGEVIEW PARA QUE AO CLICAR ALEM DE SALVAR IR A TELA DE LOGIN
        salvaped1 =(ImageView)findViewById(R.id.salvaped1id);
        salvaped1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos1Activity.this,loginActivity.class));
            }
        });

        //USO DA ID DO IMAGEVIEW PARA QUE AO CLICAR SAIR DESTA TELA E VOLTE A TELA DE LOGIN
        sairped1 =(ImageView)findViewById(R.id.sairped1id);
        sairped1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos1Activity.this,loginActivity.class));
            }
        });

        //USO DA ID DO IMAGEVIEW PARA QUE AO CLICAR EM ADD CHAMAR A TELA DE CAD DE CLIENTE
        addadcliped1 =(ImageView)findViewById(R.id.cadcliaddped1);
        addadcliped1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos1Activity.this,cadastroClientesActivity.class));
            }
        });
    }
}
