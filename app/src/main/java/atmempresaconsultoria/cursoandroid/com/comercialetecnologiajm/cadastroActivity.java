package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cadastroActivity extends AppCompatActivity {

    //VARIAVEL PARA HABILITAR O USO DA IMAGEVIEW
    private ImageView botaoclientes;
    private ImageView botaosaircad;
    private ImageView botaousuarios;
    private ImageView botaofornecedores;
    private ImageView botaoprodutos;
    private ImageView botaomarcas;
    private ImageView botaocadgrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        //USANDO A ID IMAGE VIEW PARA CHAMAR TELAS
        botaoclientes=(ImageView) findViewById(R.id.menucadcliid);
        botaousuarios=(ImageView) findViewById(R.id.menucaduserid);
        botaofornecedores = (ImageView)findViewById(R.id.fornecedoresid) ;
        botaoprodutos = (ImageView) findViewById(R.id.cadprodutosid) ;
        botaomarcas = (ImageView) findViewById(R.id.menucadmarcas);
        botaocadgrade = (ImageView) findViewById(R.id.cadgrade);


        //INICIANDO COM USO DE ID DA IMAGE VIEW PARA CHAMAR OUTRAS ACTIVITYS
        botaoclientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,cadastroClientesActivity.class));
            }
        });

        botaousuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,cadastroUsuarioActivity.class));
            }
        });

        botaofornecedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,cadastroFornecedorActivity.class));
            }
        });

        botaoprodutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,cadastroProdutosActivity.class));
            }
        });

        botaomarcas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,cadastroMarcasActivity.class));
            }
        });

        botaocadgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,cadastroGradeActivity.class));
            }
        });
        //FIM DO USO DE ID DO IMAGE VIEW PARA CHAMAR ACTIVITYS



        //USANDO A ID IMAGE VIEW PARA SAIR DO MENU
        botaosaircad= (ImageView) findViewById(R.id.saircadid);
        botaosaircad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroActivity.this,loginActivity.class));
            }
        });
    }
}
