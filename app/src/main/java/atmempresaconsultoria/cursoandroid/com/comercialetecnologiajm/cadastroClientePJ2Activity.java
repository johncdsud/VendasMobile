package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class cadastroClientePJ2Activity extends AppCompatActivity {
    Spinner Estados;

    private ImageView salvarclipj;
    private ImageView sairclipj;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente_pj2);

        Estados = (Spinner) findViewById(R.id.spinnerUF2);

        ArrayAdapter adapter= ArrayAdapter.createFromResource(     this,R.array.Estados, android.R.layout.simple_spinner_item);
        Estados.setAdapter(adapter);



        sairclipj = (ImageView) findViewById(R.id.voltarclipjid);
        sairclipj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cadastroClientePJ2Activity.this,loginActivity.class));
            }
        });

    }
}
