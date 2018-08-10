package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dadosEmpresaActivity extends AppCompatActivity {
    //DECLARAÇÃO DA VARIAVEL PARA USO DO BUTTON
    private Button btnsairemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_empresa);

        //USO DA IDE DO BUTTON PARA SAIR DA TELA DE DADOS DA EMPRESA E VOLTAR PARA O LOGIN
        btnsairemp = (Button)findViewById(R.id.btnsairemp);
        btnsairemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dadosEmpresaActivity.this,loginActivity.class));
            }
        });
    }
}
