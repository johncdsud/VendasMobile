package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class movimentoEstoqueActivity extends AppCompatActivity {

    //DECLARAÇÃO DAS VARIAVEIS PARA USO DO ARRAY LIST SPINNER
    Spinner Datas;
    Spinner movimento;
    Spinner produtoslista;

    //DECLARAÇÃO DAS VARIAVEIS PARA USO DO IMAGEVIEW
    private ImageView salvamov;
    private ImageView sairmov;
    private ImageView cadprodmov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimento_estoque);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        Datas = (Spinner) findViewById(R.id.spinnerdata);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(movimentoEstoqueActivity.this,R.array.Data, android.R.layout.simple_spinner_item);
        Datas.setAdapter(adapter);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        movimento =(Spinner)findViewById(R.id.spinnermov);
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(movimentoEstoqueActivity.this,R.array.TIPOMOV,android.R.layout.simple_spinner_item);
        movimento.setAdapter(adapter1);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        produtoslista = (Spinner)findViewById(R.id.produtosspiner);
        ArrayAdapter adapter2=ArrayAdapter.createFromResource(movimentoEstoqueActivity.this,R.array.PRODUTOS,android.R.layout.simple_spinner_item);
        produtoslista.setAdapter(adapter2);

        //USO DE ID DO IMAGEVIEW PARA SALVAR O MOVIMENTO DE ESTOQUE E TAMBEM VOLTANDO A TELA DE LOGIN
        salvamov =(ImageView)findViewById(R.id.salvarmovestoqueid);
        salvamov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(movimentoEstoqueActivity.this,loginActivity.class));
            }
        });

        //USO DE ID DO IMAGE VIEW PARA SAIR DA TELA DE MOVIMENTO DE ESTOQUE E IR A TELA DE LOGIN
        sairmov =(ImageView)findViewById(R.id.sairmovestoqueid);
        sairmov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(movimentoEstoqueActivity.this,loginActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW  PARA QUE AO CLICAR EM ADD PRODUTOS O SISTEMA CHAME A TELA DE CAD DE PRODUTOS
        cadprodmov = (ImageView) findViewById(R.id.cadprodmov);
        cadprodmov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(movimentoEstoqueActivity.this,cadastroProdutosActivity.class));
            }
        });



    }
}
