package com.example.practicacalificada3robles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class secundario_menu extends AppCompatActivity implements ComunicaMenu  {

    Fragment [] misFragmentos ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundario_menu);

        //
        misFragmentos=new Fragment[5];
        misFragmentos[0] = new fragmento_1();
        misFragmentos[1] = new fragmento_2();
        misFragmentos[2] = new Fragmento_3();
        misFragmentos[3] = new fragmento_4();
        //
        //agregar . captura el boton pulsado
        Bundle extras = getIntent().getExtras();
        menu(extras.getInt("BOTONPULSADO"));

    }

    @Override
    public void menu(int queboton) {

        FragmentManager miManejador=getSupportFragmentManager();

        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        miTransaccion.replace(R.id.contenedor_2 , misFragmentos[queboton]);

        miTransaccion.commit();
    }

}
