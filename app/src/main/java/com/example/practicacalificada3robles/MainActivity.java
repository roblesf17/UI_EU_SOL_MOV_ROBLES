package com.example.practicacalificada3robles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements  ComunicaMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //video
        VideoView videoView = (VideoView) findViewById(R.id.video);
        Uri path = Uri.parse("android.resource://com.example.practicacalificada3robles/"+R.raw.yo);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(path);
        videoView.requestFocus();
        videoView.start();
        //


    }

    @Override
    public void menu(int queboton) {

        Intent in = new Intent(this , secundario_menu.class);

        in.putExtra("BOTONPULSADO" , queboton);

        startActivity(in);

    }

    public void  img_onclic (View view)
    {

        Uri uri = Uri.parse("https://rpp.pe/politica/gobierno/martin-vizcarra-en-la-onu-confio-en-que-lograremos-el-adelanto-de-elecciones-por-el-bien-del-peru-noticia-1221312");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



}
