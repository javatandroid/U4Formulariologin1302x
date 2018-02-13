package com.example.u4formulariologin1302;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FormularioDestinoActivity extends AppCompatActivity {

    TextView tvFormDusuario, tvFormDmail, tvFormDcont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_destino);

        tvFormDusuario=(TextView)findViewById(R.id.tvFormDUsuario);
        tvFormDmail=(TextView)findViewById(R.id.tvFormDMail);
        tvFormDcont=(TextView)findViewById(R.id.tvFormDCont);

        Bundle b = getIntent().getExtras();
        if(b!=null){
            String usuario = b.getString(FormularioActivity.EXTRA_USUARIO);
            String mail = b.getString(FormularioActivity.EXTRA_MAIL);
            String contraseña = b.getString(FormularioActivity.EXTRA_CONTRASEÑA);

            tvFormDusuario.setText(usuario);
            tvFormDmail.setText(mail);
            tvFormDcont.setText(contraseña);
        }

    }
    public void pantallaPrincipal (View view){
        Intent i =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

}
