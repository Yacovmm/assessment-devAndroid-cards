package com.app.testassesmentcartas;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton card;
    TextView msg;
    int[] imagem = {
            R.drawable.carta,
            R.drawable.coringa
    };
    Button btnAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card = (ImageButton) findViewById(R.id.card);
        msg = (TextView) findViewById(R.id.message);
        btnAgain = (Button) findViewById(R.id.btnAgain);







    }

    public void cardClick(View card){

        Random random = new Random();
        int ran =  random.nextInt(imagem.length);
        this.card = (ImageButton) card;
        this.card.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), imagem[ran]));

        if (imagem[ran] == R.drawable.carta){
            msg.setText("Você venceu");
            msg.setVisibility(View.VISIBLE);
            btnAgain.setVisibility(View.VISIBLE);

        }else{
            msg.setText("Você perdeu");
            msg.setVisibility(View.VISIBLE);
            btnAgain.setVisibility(View.VISIBLE);
        }


    }

    public void againClick(View view){
        card.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.choice));
        msg.setVisibility(View.INVISIBLE);
        btnAgain.setVisibility(View.INVISIBLE);
    }
}


