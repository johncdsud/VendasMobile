package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuPrincipalActivity extends AppCompatActivity {
    private ImageView entrarsistema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        //USO DE ID DO IMAGEVIEW  PARA QUE AO CLICAR LEVA A TELA DO MENU DE CADASTROS
        entrarsistema = (ImageView) findViewById(R.id.entrarsistemaid);
        entrarsistema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipalActivity.this,loginActivity.class));
            }
        });
    }
}
