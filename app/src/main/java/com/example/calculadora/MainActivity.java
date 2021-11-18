package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bttnSuma, bttnResta, bttnMult, bttnDiv, bttnIgual,
            bttnLimpiar, bttnRaiz, bttnPosNev, bttnBorrar,
            bttnUno, bttnDos, bttnTres, bttnCuatro, bttnCinco,
            bttnSeis, bttnSiete, bttnOcho, bttnNueve, bttnCero;
    TextView tvRpta;
    double num = 0;
    double num1 = 0;
    double num2 = 0;
    double resultado;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnSuma = findViewById(R.id.bttnMas);
        bttnResta = findViewById(R.id.bttnMenos);
        bttnMult = findViewById(R.id.bttnMult);
        bttnDiv = findViewById(R.id.bttnDiv);
        bttnUno = findViewById(R.id.bttnUno);
        bttnDos = findViewById(R.id.bttnDos);
        bttnTres = findViewById(R.id.bttnTres);
        bttnCuatro = findViewById(R.id.bttnCuatro);
        bttnCinco = findViewById(R.id.bttnCinco);
        bttnSeis = findViewById(R.id.bttnSeis);
        bttnSiete = findViewById(R.id.bttnSiete);
        bttnOcho = findViewById(R.id.bttnOcho);
        bttnNueve = findViewById(R.id.bttnNueve);
        bttnCero = findViewById(R.id.bttnCero);
        bttnIgual = findViewById(R.id.bttnIgual);
        bttnLimpiar = findViewById(R.id.bttnLimpiar);
        tvRpta = findViewById(R.id.tvRpta);

        bttnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("1");
                } else {
                    tvRpta.setText(tvRpta.getText() + "1");
                }
            }
        });
        bttnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("2");
                } else {
                    tvRpta.setText(tvRpta.getText() + "2");
                }
            }
        });
        bttnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("3");
                } else {
                    tvRpta.setText(tvRpta.getText() + "3");
                }
            }
        });
        bttnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("4");
                } else {
                    tvRpta.setText(tvRpta.getText() + "4");
                }
            }
        });
        bttnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("5");
                } else {
                    tvRpta.setText(tvRpta.getText() + "5");
                }
            }
        });
        bttnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("6");
                } else {
                    tvRpta.setText(tvRpta.getText() + "6");
                }
            }
        });
        bttnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("7");
                } else {
                    tvRpta.setText(tvRpta.getText() + "7");
                }
            }
        });
        bttnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("8");
                } else {
                    tvRpta.setText(tvRpta.getText() + "8");
                }
            }
        });
        bttnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("9");
                } else {
                    tvRpta.setText(tvRpta.getText() + "9");
                }
            }
        });
        bttnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(tvRpta.getText().toString());
                if (num == 0) {
                    tvRpta.setText("0");
                } else {
                    tvRpta.setText(tvRpta.getText() + "0");
                }
            }
        });
        bttnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvRpta.setText("0");
                num1 = 0;
                num2 = 0;
                operacion = "";
            }
        });
        bttnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(tvRpta.getText().toString());
                operacion = "+";
                tvRpta.setText("0");
            }
        });
        bttnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(tvRpta.getText().toString());
                operacion = "-";
                tvRpta.setText("0");
            }
        });
        bttnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(tvRpta.getText().toString());
                operacion = "*";
                tvRpta.setText("0");
            }
        });
        bttnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(tvRpta.getText().toString());
                operacion = "/";
                tvRpta.setText("0");
            }
        });
        bttnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(tvRpta.getText().toString());
                if (operacion.equals("+")) {
                    resultado = num1 + num2;
                    tvRpta.setText(resultado + "");
                } else if (operacion.equals("-")) {
                    resultado = num1 - num2;
                    tvRpta.setText(resultado + "");
                } else if (operacion.equals("*")) {
                    resultado = num1 * num2;
                    tvRpta.setText(resultado + "");
                } else if (operacion.equals("/")) {
                    if (num2 == 0) {
                        tvRpta.setText("0");
                    } else {
                        resultado = num1 / num2;
                        tvRpta.setText(resultado + "");
                    }
                }
                num1 = 0;
                num2 = 0;
                operacion = "";
            }
        });
        /*bttnPosNev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(tvRpta.getText().toString());
                resultado = num1 * (-1);
                tvRpta.setText(resultado + "");
            }
        });
        bttnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(tvRpta.getText().toString());
                resultado = Math.sqrt(num);
                tvRpta.setText(resultado + "");
            }
        });
        bttnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvRpta.getText().toString().equals(" ")) {
                    tvRpta.setText(tvRpta.getText().subSequence(0, tvRpta.getText().length()-1) + "");
                }
            }
        });*/
    }
}