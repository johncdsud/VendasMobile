package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class   cadastroClientePF2Activity extends AppCompatActivity {
    Spinner Estados;

    //DECLARAÇÃO DE IMAGE VIEW
    private ImageView voltarclipf2;
    private ImageView salvarclipf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_pf2);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        Estados = (Spinner) findViewById(R.id.spinnerUF);

        //CRIANDO ADAPTER PARA O USO DO ARRAYLIST DO SPINNER COM USO DA ID----PODE USER OUTROS ALEM DO SIMPLE_SPINNER_ITEM
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.Estados, android.R.layout.simple_spinner_item);
        Estados.setAdapter(adapter);

        //USANDO A ID IMAGE VIEW PARA VOLTAR A TELA DE LOGIN--COM O USO DO CLIQUE
        voltarclipf2 = (ImageView) findViewById(R.id.voltarcli2pfid);
        voltarclipf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientePF2Activity.this,loginActivity.class));
            }
        });


    }
}
