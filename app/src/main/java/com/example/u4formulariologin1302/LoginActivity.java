package com.example.u4formulariologin1302;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    static final String EXTRA_LOGUSUARIO="USUARIO";
    static final String EXTRA_LOGCONT="CONTRASEÑA";
    EditText etLogin, etCont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = (EditText)findViewById(R.id.etLogUsuario);
        etCont = (EditText)findViewById(R.id.etLogCont);

    }

    public void botonLogin (View view){
        String usuario = etLogin.getText().toString();
        String contraseña = etCont.getText().toString();

        if(usuario.equals("")||contraseña.equals("")){
            Toast.makeText(getApplicationContext(), "Debes de introducir tus datos", Toast.LENGTH_SHORT).show();
        }else{
            Intent i=new Intent(getApplicationContext(), LoginDestinoActivity.class);
            i.putExtra(EXTRA_LOGUSUARIO, usuario);
            i.putExtra(EXTRA_LOGCONT, contraseña);
            startActivity(i);
        }
    }
}
