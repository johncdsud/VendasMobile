package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuJMActivity extends AppCompatActivity {

    //DECLARAÇÃO DAS VARIAVEIS PARA USO DO IMAGEVIEW DAS TELAS
    private ImageView menucadastros;
    private ImageView menuempresa;
    private ImageView botaosairmenuprin;
    private ImageView menuestoque;
    private ImageView menupedidos;
    private ImageView menurelatorios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_jm);

        //USO DE ID DO IMAGEVIEW  PARA QUE AO CLICAR LEVA A TELA DO MENU DE CADASTROS
        menucadastros = (ImageView) findViewById(R.id.cadastrosid);
        menucadastros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuJMActivity.this,cadastroActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW PARA QUE AO CLICAR LEVE A TELA QUE APRESENTA DADOS DA EMPRESA
        menuempresa = (ImageView) findViewById(R.id.dadosemp);
        menuempresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuJMActivity.this,dadosEmpresaActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW PARA QUE AO CLICAR LEVE A TELA DE MOVIMENTO DE ESTOQUE
        menuestoque = (ImageView)findViewById(R.id.menuestoqueid);
        menuestoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuJMActivity.this,movimentoEstoqueActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW PARA QUE AO CLICAR LEVE DE VOLTA A TELA DE LOGIN
        botaosairmenuprin =(ImageView) findViewById(R.id.sairmenu);
        botaosairmenuprin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuJMActivity.this,loginActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW PARA QUE AO CLICAR LEVE A TELA DE MENU DE PEDIDOS
        menupedidos =(ImageView) findViewById(R.id.menupedidos);
        menupedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuJMActivity.this,MenuPedidosActivity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW PARA QUE AO CLICAR LEVE A TELA DE RELATORIO
        menurelatorios =(ImageView) findViewById(R.id.menurelatorioid);
        menurelatorios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuJMActivity.this,RelatorioVendasActivity.class));
            }
        });









    }
}

