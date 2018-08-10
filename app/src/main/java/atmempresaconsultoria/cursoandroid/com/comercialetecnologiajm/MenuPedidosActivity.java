package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuPedidosActivity extends AppCompatActivity {

    //DECLARAÇÃO DAS VARIAVEIS PARA USO DOS BUTTONS E IMAGEVIEW
    private Button menupedidoglobal;
    private Button menupedidocalcadista;
    private Button menupedidolaticinios;
    private ImageView sairmenupedidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pedidos);

        //USO DA ID DO BUTTON PARA QUE AO CLICAR LEVE A TELA DE PEDIDOS GLOBAIS OU SEJA QUE PODE SER USADO PRA QUALQUER PRODUTO
        menupedidoglobal = (Button) findViewById(R.id.pedidovendas);
        menupedidoglobal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPedidosActivity.this,Pedidos1Activity.class));
            }
        });

        //USO DA ID DO BUTTON PARA QUE AO CLICAR LEVE A TELA DE PEDIDOS DE CALÇADOS
        menupedidocalcadista = (Button) findViewById(R.id.pedidocalcadista);
        menupedidocalcadista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPedidosActivity.this,Pedidos2Activity.class));
            }
        });

        //USO DA ID DO BUTTON PARA QUE AO CLICAR LEVE A TELA DE PEDIDOS DE LATICINIOS
        menupedidolaticinios = (Button) findViewById(R.id.pedidolaticinios);
        menupedidolaticinios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPedidosActivity.this,Pedidos3Activity.class));
            }
        });

        //USO DA ID DO IMAGEVIEW PARA QUE AO CLICAR LEVE DE VOLTA A TELA DE LOGIN
        sairmenupedidos = (ImageView) findViewById(R.id.sairmenuped);
        sairmenupedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPedidosActivity.this,loginActivity.class));
            }
        });
    }
}

