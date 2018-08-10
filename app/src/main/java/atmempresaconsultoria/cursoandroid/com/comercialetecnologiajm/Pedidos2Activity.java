package atmempresaconsultoria.cursoandroid.com.comercialetecnologiajm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Pedidos2Activity extends AppCompatActivity {

    //DECLARAÇÃO DA VARIAVEL PARA USO DO IMAGEVIEW PARA ESTA TELA
    private Button contpedcal;
    private ImageView cadcliped2;
    private ImageView cadgradeped2;

    //DECLARAÇÃO DA VARIAVEL SPINNER PARA USO DO ARRAYLIST
    Spinner CLIENTESCALC;
    Spinner PRODUTOSCAL;
    Spinner GRADE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos2);

        //USO DA ID DO BUTTON COM CLIQUE PARA QUE LEVE A CONTINUAÇÃO DO PEDIDO CALÇADISTA TRABALHANDO A PARTE DA GRADE
        contpedcal= (Button)findViewById(R.id.btnAvancarID);
        contpedcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos2Activity.this,Pedidos22Activity.class));
            }
        });

        //USO DA ID DO IMAGE VIEW PARA CHAMAR A TELA DE CAD DE GRADE AO CLICAR EM ADD
        cadcliped2= (ImageView) findViewById(R.id.cadcliped2);
        cadcliped2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos2Activity.this,cadastroClientesActivity.class));
            }
        });

        //USO DA ID DO IMAGE VIEW PARA CHAMAR A TELA DE CAD DE CLIENTE AO CLICAR EM ADD
        cadgradeped2= (ImageView) findViewById(R.id.cadgradeped2);
        cadgradeped2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pedidos2Activity.this,cadastroGradeActivity.class));
            }
        });

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        CLIENTESCALC = (Spinner) findViewById(R.id.spinnerclientecalc);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(Pedidos2Activity.this,R.array.CLIENTECALC, android.R.layout.simple_spinner_item);
        CLIENTESCALC.setAdapter(adapter);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        PRODUTOSCAL = (Spinner) findViewById(R.id.spinnerprodcalid);
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(Pedidos2Activity.this,R.array.PRODUTOSCALC, android.R.layout.simple_spinner_item);
        PRODUTOSCAL.setAdapter(adapter1);

        //USANDO A VARIAVEL SPINNER COM A SPINNER QUE FOI FEITA NO ARQUIVO STRINGS.XML DO "STYLES"
        GRADE = (Spinner) findViewById(R.id.gradeID);
        ArrayAdapter adapter2= ArrayAdapter.createFromResource(Pedidos2Activity.this,R.array.GRADE, android.R.layout.simple_spinner_item);
       GRADE.setAdapter(adapter2);


    }
}
