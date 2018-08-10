package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class cadastroProdutosActivity extends AppCompatActivity {
    //DECLARAÇÃO DA VARIAVEL PARA USO DO SPINNER LIST
    Spinner TIPOITEM;
    Spinner NCM;

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private ImageView botaocontcadprod;
    private ImageView botaosaircadprod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produtos);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        TIPOITEM = (Spinner) findViewById(R.id.spinnerti);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(cadastroProdutosActivity.this,R.array.TIPOITEM, android.R.layout.simple_spinner_item);
        TIPOITEM.setAdapter(adapter);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        NCM= (Spinner) findViewById(R.id.spinerncm);
        ArrayAdapter adapter2= ArrayAdapter.createFromResource(cadastroProdutosActivity.this,R.array.NCM, android.R.layout.simple_spinner_item);
        NCM.setAdapter(adapter2);

      ///USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SALVAR O CADASTRO E IR PARA A TELA 2
      botaocontcadprod = (ImageView) findViewById(R.id.contcadprod);
      botaocontcadprod.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(cadastroProdutosActivity.this,cadastroProdutos2Activity.class));
          }
      });

      ///USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SAIR DO CADASTRO E VOLTAR A TELA DE LOGIN
      botaosaircadprod = (ImageView) findViewById(R.id.saircadprod);
      botaosaircadprod.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(cadastroProdutosActivity.this,loginActivity.class));
          }
      });




    }
}
