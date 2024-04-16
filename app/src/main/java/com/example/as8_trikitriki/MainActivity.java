package com.example.as8_trikitriki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Referenciamos los objetos de la vista
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Asiganmos valores
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnSalir = findViewById(R.id.btnSalir);

    }
    public String jugador ="x";
    public void click (View v){
        //Primero obtener la referencia de que boton es el que se clickeo;
        Button btn = (Button)v;
        //Bariable del jugador;
        if(btn.getText().toString().equals("")){
            btn.setText(jugador);

           cambiarJugador();
        }

    }

    private void cambiarJugador() {
        if(jugador.equals("x")){
            jugador = "o";
        }else{
            jugador = "x";
        }
    }
}

