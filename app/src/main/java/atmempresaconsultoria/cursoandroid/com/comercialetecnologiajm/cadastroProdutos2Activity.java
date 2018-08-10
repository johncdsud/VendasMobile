package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class cadastroProdutos2Activity extends AppCompatActivity {
    //DECLARAÇÃO DA VARIAVEL PARA USO DO SPINNER LIST
    Spinner TIPO;
    Spinner UNIDADE;

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private ImageView  botaosalvarcadpro2;
    private ImageView botaosaircadprod2;
    private Button addmarca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produtos2);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        UNIDADE = (Spinner) findViewById(R.id.spinerunidade);
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(cadastroProdutos2Activity.this,R.array.UNIDADE, android.R.layout.simple_spinner_item);
        UNIDADE.setAdapter(adapter1);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        TIPO= (Spinner) findViewById(R.id.spinertipo);
        ArrayAdapter adapter3= ArrayAdapter.createFromResource(cadastroProdutos2Activity.this,R.array.TIPO, android.R.layout.simple_spinner_item);
        TIPO.setAdapter(adapter3);

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SALVAR O CAD PRODUTO

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SAIR DA TELA DE CAD PRODUTO E VOLTAR AO LOGIN
        botaosaircadprod2= (ImageView)findViewById(R.id.saircadprod2);
        botaosaircadprod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroProdutos2Activity.this,loginActivity.class));
            }
        });

        //BOTAO ADDMARCA PARA CADASTRAR MARCA
        addmarca= (Button)findViewById(R.id.addmarca);
        addmarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroProdutos2Activity.this,cadastroMarcasActivity.class));
            }
        });

    }
}
