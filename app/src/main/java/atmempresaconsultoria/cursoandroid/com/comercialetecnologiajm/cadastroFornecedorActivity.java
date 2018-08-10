package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cadastroFornecedorActivity extends AppCompatActivity {

    //DECLARAÇÃO DE IMAGE VIEW
    private ImageView salvarcadforn;
    private ImageView saircadforn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_fornecedor);

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTAO PARA CHAMAR A TELA DE CADASTRO DE FORNECEDOR 2 CONTINUAÇÃO
        salvarcadforn = (ImageView)findViewById(R.id.contforn2id);
        salvarcadforn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroFornecedorActivity.this,cadastroFornecedor2Activity.class));
            }
        });

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTAO PARA SAIR A TELA DE CADASTRO DE FORNECEDOR E VOLTAR AO LOGIN
        saircadforn = (ImageView)findViewById(R.id.saircadfornid);
        saircadforn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroFornecedorActivity.this,loginActivity.class));
            }
        });
    }
}
