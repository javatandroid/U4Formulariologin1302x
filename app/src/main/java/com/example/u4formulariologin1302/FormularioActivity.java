package com.example.u4formulariologin1302;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {
    static final String EXTRA_USUARIOFORM = "USUARIO";
    static final String EXTRA_MAILFORM = "MAIL";
    static final String EXTRA_CONTRASEÑAFORM = "CONTRASEÑA";

    EditText etFormUsuario, etFormMail, etFormCont, etFormCont2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etFormUsuario=(EditText)findViewById(R.id.etFormUsuario);
        etFormMail=(EditText)findViewById(R.id.etFormMail);
        etFormCont=(EditText)findViewById(R.id.etFormCont);
        etFormCont2=(EditText)findViewById(R.id.etFormCont2);
    }

    public void botonRegistrate (View view){
        String usuario = etFormUsuario.getText().toString();
        String mail = etFormMail.getText().toString();
        String contraseña = etFormCont.getText().toString();
        String contraseña2 = etFormCont2.getText().toString();

        if(usuario.equals("")||mail.equals("")||contraseña.equals("")||contraseña2.equals("")) {
            Toast.makeText(getApplicationContext(), "Debes de rellenar todos los campos", Toast.LENGTH_SHORT).show();
            if (contraseña != contraseña2) {
                Toast.makeText(getApplicationContext(), "Las contraseñas introducidas son diferentes", Toast.LENGTH_SHORT).show();
            }
        }else{
            Intent i = new Intent(getApplicationContext(), FormularioDestinoActivity.class);
            i.putExtra(EXTRA_USUARIOFORM, usuario);
            i.putExtra(EXTRA_MAILFORM, mail);
            i.putExtra(EXTRA_CONTRASEÑAFORM, contraseña);
            startActivity(i);

        }

    }

    public class EXTRA_USUARIO {
    }
}
