package sv.com.ariel.tellmeastory.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import sv.com.ariel.tellmeastory.R;

public class Biblioteca extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);

        ImageButton home = (ImageButton)findViewById(R.id.inicio);
        home.setOnClickListener(this);

        ImageButton biblio = (ImageButton)findViewById(R.id.biblioteca) ;
        biblio.setOnClickListener(this);

        ImageButton agregar = (ImageButton)findViewById(R.id.agregar) ;
        agregar.setOnClickListener(this);

        ImageButton noti = (ImageButton)findViewById(R.id.actualizaciones) ;
        noti.setOnClickListener(this);

        ImageButton usuario = (ImageButton)findViewById(R.id.usuario) ;
        usuario.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.inicio:
                Intent intent =  new Intent(Biblioteca.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.biblioteca:
                intent =  new Intent(Biblioteca.this, Biblioteca.class);
                startActivity(intent);
                break;

            case R.id.agregar:
                intent =  new Intent(Biblioteca.this, AgregarHistoria.class);
                startActivity(intent);
                break;

            case R.id.actualizaciones:
                intent =  new Intent(Biblioteca.this, Notificaciones.class);
                startActivity(intent);
                break;

            case R.id.usuario:
                intent =  new Intent(Biblioteca.this, Usuario.class);
                startActivity(intent);
                break;

            default:
                break;
        }

    }
}
