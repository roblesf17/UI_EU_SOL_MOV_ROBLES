package com.example.practicacalificada3robles;


import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu extends Fragment {

    //creando arrays
    private final int [] BOTONESMENU = {R.id.btn_menu_1 , R.id.btn_menu_2 , R.id.btn_menu_3 , R.id.btn_menu_4 };
    //


    public Menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu =  inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton botonmenu ;
        for (int i = 0 ; i <BOTONESMENU.length ; i ++)
        {
            botonmenu = (ImageButton) mimenu.findViewById(BOTONESMENU[i]);

            final int queboton =  i ;

            botonmenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //alamacena en esta variable en que actividad nos encontramos
                    Activity estaActividad = getActivity() ;
                    //estamos pasando el boton al metodo menu de Comunicamenu
                    ((ComunicaMenu) estaActividad).menu(queboton);

                }
            });

            ;
        }
        return mimenu ;

    }




}
