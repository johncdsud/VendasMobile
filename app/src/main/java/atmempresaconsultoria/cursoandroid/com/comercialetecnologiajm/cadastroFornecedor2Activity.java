package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class cadastroFornecedor2Activity extends AppCompatActivity {

    //DECLARAÇÃO DA VARIAVEL PARA USO DO SPINNER LIST
    Spinner Estados;

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW
    private ImageView salvafornecedor;
    private ImageView sairfornecedor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_fornecedor2);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        Estados = (Spinner) findViewById(R.id.spinnerUF3);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(cadastroFornecedor2Activity.this,R.array.Estados, android.R.layout.simple_spinner_item);
        Estados.setAdapter(adapter);

        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SALVAR O CADASTRO E VOLTAR A TELA DE LOGIN


        //USO DE ID DO IMAGEVIEW COM CLIQUE DO BOTÃO PARA SAIR DA TELA DE CAD FORN E VOLTAR AO LOGIN
        sairfornecedor = (ImageView) findViewById(R.id.voltarfornid);
        sairfornecedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroFornecedor2Activity.this,loginActivity.class));
            }
        });
    }
}
