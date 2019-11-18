package com.example.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {



    private ConstraintLayout tela;
    private TextView tvSwipe;
    private TextView tvNumero;
    private Button btnReinicia;
    private TextView tvRespondida;
    private TextView tvResp;
    int respostas = 3;  // VERIFICA SE A RESPOSTA
    int num = 0;        // ACESSA AS PERGUNTAS CONFORME SWIPE INSERIDO
    int RespostasCertas = 0;  // FAÇO UM SOMATÓRIO DAS RESPOSTAS CERTAS
    boolean valida = false;  // VALIDA SE O USUARIO JA PASSOU POR TODAS AS PERGUNTAS E INFORMA O SOMATÓRIO DE ACERTOS
    int respondidas = 0;    // VERIFICA SE A QUESTÃO FOI RESPONDIDA OU SÓ PASSADA
    boolean pergunta1 = false;
    boolean pergunta2 = false;
    boolean pergunta3 = false;  // VERIFICAR SE A PERGUNTA FOI RESPONDIDA
    boolean pergunta4 = false;
    boolean pergunta5 = false;
    boolean pergunta6 = false;
    int respondido1 = 0;
    int respondido2 = 0;
    int respondido3 = 0;
    int respondido4 = 0;    // VERIFICA SE A RESPOSTA ESTÁ CERTA OU ERRADA, CONFORME USUARIO INFORMOU E MUDANDO A COR DA RESPOSTA!
    int respondido5 = 0;
    int respondido6 = 0;


    public void reinicia(View view){
        tvRespondida.setText("");
        tvSwipe.setText("\n\nDeslize para baixo: SIM\nDeslize para Cima = NÃO");
        tvNumero.setText("");
        tvResp.setText("");
        respostas = 3;
        num = 0;
        RespostasCertas = 0;
        valida = false;
        respondidas = 0;
        pergunta1 = false;
        pergunta2 = false;
        pergunta3 = false;
        pergunta4 = false;
        pergunta5 = false;
        pergunta6 = false;
        btnReinicia.setVisibility(View.INVISIBLE);
    }


    private int perguntas(int pergunta){
        btnReinicia.setVisibility(View.INVISIBLE);
        int numero = pergunta;

        if (num == 1){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta 1 - Soma");
            tvSwipe.setText("1+1 = 2?");
            if (pergunta1 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
                if (respondido1 == 1){
                    tvResp.setTextColor(Color.GREEN);
                    tvResp.setText("SIM");
                }else if (respondido1 == 2){
                    tvResp.setTextColor(Color.RED);
                    tvResp.setText("NÃO");
                }
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta1 = true;
                respondido1 = 1;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta1 = true;
                respondido1 = 2;
            }
        }

        if (num == 2){
            tvRespondida.setText("");
            tvResp.setText("");
            tvNumero.setText("Pergunta 2 - Multiplicação");
            tvSwipe.setText("5x5 = 20?");
            if (pergunta2 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
                if (respondido2 == 1){
                    tvResp.setTextColor(Color.RED);
                    tvResp.setText("SIM");
                }else if (respondido2 == 2){
                    tvResp.setTextColor(Color.GREEN);
                    tvResp.setText("NÃO");
                }
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                pergunta2 = true;
                respondido2 = 1;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                if (respostas == 0 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta2 = true;
                respondido2 = 2;
            }

        }
        if (num == 3){
            tvRespondida.setText("");
            tvResp.setText("");
            tvNumero.setText("Pergunta 3 - Divisão");
            tvSwipe.setText("10/5 = 2?");
            if (pergunta3 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
                if (respondido3 == 1){
                    tvResp.setTextColor(Color.GREEN);
                    tvResp.setText("SIM");
                }else if (respondido3 == 2){
                    tvResp.setTextColor(Color.RED);
                    tvResp.setText("NÃO");
                }
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta3 = true;
                respondido3 = 1;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta3 = true;
                respondido3 = 2;
            }

        }
        if (num == 4){
            tvRespondida.setText("");
            tvResp.setText("");
            tvNumero.setText("Pergunta 4 - Porcentagem");
            tvSwipe.setText("15% de 224 é: 33,4?");
            if (pergunta4 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
                if (respondido4 == 1){
                    tvResp.setTextColor(Color.RED);
                    tvResp.setText("SIM");
                }else if (respondido4 == 2){
                    tvResp.setTextColor(Color.GREEN);
                    tvResp.setText("NÃO");
                }
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                pergunta4 = true;
                respondido4 = 1;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                if (respostas == 0 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta4 = true;
                respondido4 = 2;
            }
        }
        if (num == 5){
            tvRespondida.setText("");
            tvResp.setText("");
            tvNumero.setText("Pergunta 5 - Resto da divisão");
            tvSwipe.setText("O resto da divisão de 20/5 é 0?");
            if (pergunta5 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
                if (respondido5 == 1){
                    tvResp.setTextColor(Color.GREEN);
                    tvResp.setText("SIM");
                }else if (respondido5 == 2){
                    tvResp.setTextColor(Color.RED);
                    tvResp.setText("NÃO");
                }
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta5 = true;
                respondido5 = 1;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta5 = true;
                respondido5 = 2;
            }
        }
        if (num == 6){
            tvRespondida.setText("");
            tvResp.setText("");
            tvNumero.setText("Pergunta 6 - Subtração");
            tvSwipe.setText("10 - 20 = -10?");
            if (pergunta6 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
                if (respondido6 == 1){
                    tvResp.setTextColor(Color.GREEN);
                    tvResp.setText("SIM");
                }else if (respondido6 == 2){
                    tvResp.setTextColor(Color.RED);
                    tvResp.setText("NÃO");
                }
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta6 = true;
                respondido6 = 1;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta6 = true;
                respondido6 = 2;
            }

        }
        if (num == 7){
            tvRespondida.setText("");
            tvResp.setText("");
            tvNumero.setText("RESPOSTAS");
            if (RespostasCertas <=2 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Você pode melhorar!");
            }
            if (RespostasCertas == 3 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Foi Razoavelmente BEM!");
            }
            if (RespostasCertas == 4 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Esta BOM!");
            }
            if (RespostasCertas == 5 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Excelente Quase Gabaritou!");
            }
            if (RespostasCertas > 5 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Excelente *PARABÉNS*");
            }
            btnReinicia.setVisibility(View.VISIBLE);

            valida = true;
        }


        if (num >= 7){

            num = 0;
        }
        if (num == -1){
            num = 6;
        }

        respostas = 3;
        return numero;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSwipe = findViewById(R.id.tvSwipe);
        tela = findViewById(R.id.tela);
        tvNumero = findViewById(R.id.tvNumero);
        btnReinicia = findViewById(R.id.btnReinicia);
        tvRespondida = findViewById(R.id.tvRespondida);
        tvResp = findViewById(R.id.tvResp);


        tela.setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
              //  tvSwipe.setText("Para Baixo!");
                respostas = 1;
                perguntas( respostas );
                num = num + 1;
                perguntas( num );
            }


            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
               // tvSwipe.setText("Para Cima!");
                respostas = 0;
                perguntas( respostas );
                num = num + 1;
                perguntas( num );
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
               // tvSwipe.setText("Para Esquerda!");
                num = num + 1;
                perguntas( num );
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
               // tvSwipe.setText("Para Direita!");
                num = num - 1;
                perguntas( num );
            }

        });
    }
}
