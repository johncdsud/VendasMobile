package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;

public class Pedidos3Activity extends AppCompatActivity {
    //DECLARAÇÃO DA VARIAVEL SPINER PARA USO DO ARRAY LIST
    Spinner CLIENTESPED3;
    Spinner CONDPAGPED3;

    //DECLARAÇÃO DA VARIAVEL DO IMAGEVIEW PARA USO NESSA TELA
    private ImageView salvaped3;
    private ImageView sairped3;
    private ImageView cadcliped3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos3);

        ///USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        CLIENTESPED3 = (Spinner) findViewById(R.id.spinnercliente3);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(Pedidos3Activity.this,R.array.CLIENTE, android.R.layout.simple_spinner_item);
        CLIENTESPED3.setAdapter(adapter);

        ///USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        CONDPAGPED3 = (Spinner) findViewById(R.id.spinnerpag3);
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(Pedidos3Activity.this,R.array.CONDPAG, android.R.layout.simple_spinner_item);
        CONDPAGPED3.setAdapter(adapter1);

        //USO DE ID IMAGEVIEW PARA QUE AO CLICAR ALEM DE SALVAR VOLTE A TELA DE LOGIN
        salvaped3 =(ImageView)findViewById(R.id.salvaped3);
        salvaped3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos3Activity.this,loginActivity.class));
            }
        });

        //USO DE ID IMAGEVIEW PARA QUE AO CLICAR SAIA DESTA TELA E VOLTE A TELA DE LOGIB
        sairped3 =(ImageView)findViewById(R.id.sairped3);
        sairped3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos3Activity.this,loginActivity.class));
            }
        });

        //USO DE ID IMAGEVIEW PARA QUE AO CLICAR EM ADD CHAMA-SE A TELA DE CLIENTE
        cadcliped3 =(ImageView)findViewById(R.id.cadcliped3);
        cadcliped3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos3Activity.this,cadastroClientesActivity.class));
            }
        });


        }
}
