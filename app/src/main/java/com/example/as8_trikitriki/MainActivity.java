package com.example.as8_trikitriki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    public boolean yahayganador = false;
    public void click (View v){
        //Primero obtener la referencia de que boton es el que se clickeo;
        Button btn = (Button)v;

        if(yahayganador){
            // Mostrar un mensaje o tomar alguna acción adicional si ya hay un ganador
            Toast.makeText(this, "El juego ha terminado. Reinicia para jugar de nuevo.", Toast.LENGTH_SHORT).show();
            return; // Salir del método sin realizar ninguna acción adicional
        }else{
            //Bariable del jugador;
            if(btn.getText().toString().equals("")){
                btn.setText(jugador);

                cambiarJugador();
                ganar(jugador);
            }
        }


    }

    private void cambiarJugador() {
        if(jugador.equals("x")){
            jugador = "o";
          //  ganar(jugador);
        }else{
            jugador = "x";
          //  ganar(jugador);
        }
    }

    public void ganar(String resultado){
        String casilla1 = btn1.getText().toString();
        String casilla2 = btn2.getText().toString();
        String casilla3 = btn3.getText().toString();
        String casilla4 = btn4.getText().toString();
        String casilla5 = btn5.getText().toString();
        String casilla6 = btn6.getText().toString();
        String casilla7 = btn7.getText().toString();
        String casilla8 = btn8.getText().toString();
        String casilla9 = btn9.getText().toString();

        // Horizontales
        if( casilla1.equals(resultado) && casilla2.equals(resultado) && casilla3.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        if( casilla4.equals(resultado) && casilla5.equals(resultado) && casilla6.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        if( casilla7.equals(resultado) && casilla8.equals(resultado) && casilla9.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        // Verticales
        if( casilla1.equals(resultado) && casilla4.equals(resultado) && casilla7.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        if( casilla2.equals(resultado) && casilla5.equals(resultado) && casilla8.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        if( casilla3.equals(resultado) && casilla6.equals(resultado) && casilla9.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        // Diagonales
        if( casilla1.equals(resultado) && casilla5.equals(resultado) && casilla9.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
        if( casilla3.equals(resultado) && casilla5.equals(resultado) && casilla7.equals(resultado)){
            Toast.makeText(this, "El ganador es "+ resultado + ".", Toast.LENGTH_SHORT).show();
            yahayganador = true;
        }
    }

    public void salir(View v){
    finish();
    }

    public void reiniciar(View v){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        yahayganador = false;
    }
}

