package com.example.exercicio_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2, valor3, valor4;
    TextView tvOrdemLida, tvOrdemCrescente, tvOrdemDecrescente;
    Button btn01, btn02;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicialização dos EditTexts
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        valor3 = findViewById(R.id.valor3);
        valor4 = findViewById(R.id.valor4);

        //Inicialização dos textViews
        tvOrdemLida = findViewById(R.id.tvOrdemLida);
        tvOrdemCrescente = findViewById(R.id.tvOrdemCrescente);
        tvOrdemDecrescente = findViewById(R.id.tvOrdemDecrescente);

        //Inicialização dos botão
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Obter os valores digitados
                String strValor1 = valor1.getText().toString().trim();
                String strValor2 = valor2.getText().toString().trim();
                String strValor3 = valor3.getText().toString().trim();
                String strValor4 = valor4.getText().toString().trim();

                //Criar uma lista para armazenar os valores
                ArrayList<Integer> valores = new ArrayList<>();

                // Converter e adicionar os valores à lista
                try{
                    valores.add(Integer.parseInt(strValor1));
                    valores.add(Integer.parseInt(strValor2));
                    valores.add(Integer.parseInt(strValor3));
                    valores.add(Integer.parseInt(strValor4));

                } catch (NumberFormatException e){
                    //Tratamento de erro
                    e.printStackTrace();
                }

                // exibir valores na ordem original
                tvOrdemLida.setText(valores.toString());

                // Ordenar em ordem crescente
                Collections.sort(valores);
                // Exibir os valores em ordem crescente
                tvOrdemCrescente.setText(valores.toString());

                // Ordem decrescente
                Collections.reverse(valores);
                // Exibir os valores em ordem decrescente
                tvOrdemDecrescente.setText(valores.toString());
            }
        });

        btn02.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View View){
                //Limpar os valores dos editTexts
                valor1.setText("");
                valor2.setText("");
                valor3.setText("");
                valor4.setText("");

                //Limpar os valores dos editTexts
                tvOrdemLida.setText("");
                tvOrdemCrescente.setText("");
                tvOrdemDecrescente.setText("");
            }
        });
    }
}