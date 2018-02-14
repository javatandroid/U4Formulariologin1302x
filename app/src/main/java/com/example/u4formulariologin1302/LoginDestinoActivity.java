package com.example.u4formulariologin1302;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginDestinoActivity extends AppCompatActivity {

    TextView tvLogDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_destino);
        tvLogDes=(TextView)findViewById(R.id.tvLogDest);

        Bundle b = getIntent().getExtras();

        if(b!=null){
            String usuario =b.getString(FormularioActivity.EXTRA_MAILFORM);
            String contraseña=b.getString(LoginActivity.EXTRA_LOGCONT);

            tvLogDes.setText("Mail: "+usuario+"\nContraseña: "+contraseña);
        }
    }
    public void pantallaPrincipal (View view){
        Intent i =new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
