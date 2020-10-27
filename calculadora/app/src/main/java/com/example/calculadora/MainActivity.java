package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView sumando2;
    TextView sumando1;
    Button boton1;
    Button boton2;
    Button boton3;
    Button boton4;
    Button boton5;
    Button boton6;
    Button boton7;
    Button boton8;
    Button boton9;
    Button boton0;
    Button boton00;
    Button boton_sumar;
    Button boton_igual;
    Button boton_dividir;
    Button boton_porcentaje;
    Button boton_masmenos;
    Button boton_c;
    Button boton_multiplicar;
    Button boton_menos;
    Button boton_punto;
    double numero1;
    double numero2;
    double total;
    int contador=0;
    int contador_operadores;
    int contador_numero;

    private View.OnClickListener actividad_boton1 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton1.getText());
            contador_numero++;
        }
    };
    private View.OnClickListener actividad_boton2 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton2.getText());
            contador_numero++;
        }
    };
    private View.OnClickListener actividad_boton3 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton3.getText());
            contador_numero++;
        }
    };
    private View.OnClickListener actividad_boton4 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton4.getText());
            contador_numero++;
        }
    };
    private View.OnClickListener actividad_boton5 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton5.getText());
            contador_numero++;
        }
    };    private View.OnClickListener actividad_boton6 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton6.getText());
            contador_numero++;
        }
    };    private View.OnClickListener actividad_boton7 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton7.getText());
            contador_numero++;
        }
    };    private View.OnClickListener actividad_boton8 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton8.getText());
            contador_numero++;
        }
    };
    private View.OnClickListener actividad_boton9 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton9.getText());
            contador_numero++;
        }
    };
    private View.OnClickListener actividad_boton0 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(boton0.getText());
            contador_numero++;
        }
    };

    private View.OnClickListener actividad_botonC =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.setText("");
            sumando1.setText("");
            contador=0;
            contador_operadores=0;
            contador_numero=0;
        }
    };
    private View.OnClickListener actividad_boton_dividir =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {

                if (contador_operadores != 0) {
                    numero2 = Double.valueOf(String.valueOf(sumando2.getText()));
                    total = numero1 / numero2;
                    numero1 = total;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }
                    sumando2.setText("/");

                } else if (contador == 0) {
                    numero1 = Double.valueOf(String.valueOf(sumando2.getText()));
                    sumando1.setText(sumando2.getText() + " /");
                    sumando2.setText("");
                    contador_operadores++;

                } else if (contador != 0) {
                    sumando1.append(" / ");
                }
            }else{
                Toast.makeText(getApplicationContext(), "primero el numero", Toast.LENGTH_SHORT).show();

            }
        }
    };
    private View.OnClickListener actividad_boton_sumar =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {

                if (contador_operadores != 0) {
                    numero2 = Double.valueOf(String.valueOf(sumando2.getText()));
                    total = numero1 + numero2;
                    numero1 = total;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }
                    sumando2.setText("+");

                } else if (contador == 0) {
                    numero1 = Double.valueOf(String.valueOf(sumando2.getText()));
                    sumando1.setText(sumando2.getText() + " +");
                    sumando2.setText("");
                    contador_operadores++;
                } else if (contador == 1) {

                    sumando1.append(" + ");

                }
            }else{
                Toast.makeText(getApplicationContext(), "primero el numero", Toast.LENGTH_SHORT).show();

            }
        }
    };
    private View.OnClickListener actividad_boton_restar =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {


                if (contador_operadores != 0) {
                    numero2 = Double.valueOf(String.valueOf(sumando2.getText()));
                    total = numero1 - numero2;
                    numero1 = total;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }

                    sumando2.setText("-");

                } else if (contador == 0) {
                    numero1 = Double.valueOf(String.valueOf(sumando2.getText()));
                    sumando1.setText(sumando2.getText() + " -");
                    sumando2.setText("");
                    contador_operadores++;

                } else if (contador != 0) {

                    sumando1.append(" - ");
                }
            }else{
                Toast.makeText(getApplicationContext(), "primero el numero", Toast.LENGTH_SHORT).show();

            }
        }
    };
    private View.OnClickListener actividad_boton_multiplicar =  new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {

                if (contador_operadores != 0) {
                    numero2 = Double.valueOf(String.valueOf(sumando2.getText()));
                    total = numero1 * numero2;
                    numero1 = total;
                    sumando2.setText("*");
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);

                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }


                } else if (contador == 0) {
                    numero1 = Double.valueOf(String.valueOf(sumando2.getText()));
                    sumando1.setText(sumando2.getText() + " *");
                    sumando2.setText("");
                    contador_operadores++;

                } else if (contador != 0) {

                    sumando1.append(" - ");
                }
            }else{
                Toast.makeText(getApplicationContext(), "primero el numero", Toast.LENGTH_SHORT).show();

            }
        }
    };
    private View.OnClickListener actividad_boton_punto =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(".");
        }
    };

    private View.OnClickListener actividad_boton_00 =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sumando2.append(".00");
        }
    };

    private final View.OnClickListener actividad_boton_igual = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {

                numero2 = Double.valueOf(String.valueOf(sumando2.getText()));


                if ((sumando1.getText().toString()).indexOf("+") != -1) {
                    contador++;
                    total = numero1 + numero2;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }

                    sumando2.setText("");

                } else if ((sumando1.getText().toString()).indexOf("-") != -1) {
                    total = numero1 - numero2;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }

                    sumando2.setText("");
                } else if ((sumando1.getText().toString().indexOf("*")) != -1) {
                    total = numero1 * numero2;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }

                    sumando2.setText("");
                } else if ((sumando1.getText().toString()).indexOf("/") != -1) {

                    total = numero1 / numero2;
                    String decimal = ".0";
                    String suma_total = String.valueOf(total);
                    if (suma_total.indexOf(suma_total) != -1) {
                        sumando1.setText(eliminarDecimales(suma_total));
                    } else if (suma_total.indexOf(suma_total) == -1) {
                        sumando1.setText(String.valueOf(total));

                    }

                    sumando2.setText("");
                    if (numero2 == 0) {
                        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                        sumando2.setText("imposible");
                        sumando1.setText("");

                    }
                    contador_operadores = 0;

                }
            }else{
                Toast.makeText(getApplicationContext(), "primero el numero", Toast.LENGTH_SHORT).show();

            }
        }
    };
    private View.OnClickListener actividad_boton_porcentaje =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {

                numero2 = Double.valueOf(String.valueOf(sumando2.getText()));
                numero2 = numero2 / 100;
                sumando1.setText(String.valueOf(numero2));
                sumando2.setText("");
            }

        }
    };
    private View.OnClickListener actividad_boton_masmenos =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (contador_numero!=0) {


                String aux = (String) sumando1.getText();
                if ((sumando1.getText().toString()).indexOf("-") != -1) {
                    sumando2.setText("+" + aux.toString());
                } else {
                    sumando2.setText("-" + aux.toString());
                }
            }else{
                Toast.makeText(getApplicationContext(), "primero el numero.", Toast.LENGTH_SHORT).show();

            }


        }
    };
    public String eliminarDecimales(String numero){
        int longitud=numero.length() - 2;
        String auxiliar = "";
        for (int i=0;i<longitud;i++){
            auxiliar = auxiliar + numero.charAt(i);
                    
        }

        return auxiliar;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         boton1 = findViewById(R.id.boton1);
         boton2 = findViewById(R.id.boton2);
         boton3 = findViewById(R.id.boton3);
         boton4 = findViewById(R.id.boton4);
         boton5 = findViewById(R.id.boton5);
         boton6 = findViewById(R.id.boton6);
         boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        boton0 = findViewById(R.id.boton0);
        boton00 = findViewById(R.id.boton00);
        boton_sumar = findViewById(R.id.boton_sumar);
        boton_igual = findViewById(R.id.boton_igual);
        boton_dividir = findViewById(R.id.boton_dividir);
        boton_porcentaje = findViewById(R.id.boton_porcentaje);
        boton_masmenos = findViewById(R.id.boton_masmenos);
        boton_c = findViewById(R.id.boton_c);
        boton_multiplicar = findViewById(R.id.boton_multiplicar);
        boton_menos = findViewById(R.id.boton_menos);
        boton_punto = findViewById(R.id.boton_punto);
        sumando2= findViewById(R.id.sumando2);
        sumando1=findViewById(R.id.sumando_1);
        boton1.setOnClickListener(actividad_boton1);
        boton2.setOnClickListener(actividad_boton2);
        boton3.setOnClickListener(actividad_boton3);
        boton4.setOnClickListener(actividad_boton4);
        boton5.setOnClickListener(actividad_boton5);
        boton6.setOnClickListener(actividad_boton6);
        boton7.setOnClickListener(actividad_boton7);
        boton8.setOnClickListener(actividad_boton8);
        boton9.setOnClickListener(actividad_boton9);
        boton0.setOnClickListener(actividad_boton0);
        boton_c.setOnClickListener(actividad_botonC);
        boton_dividir.setOnClickListener(actividad_boton_dividir);
        boton_sumar.setOnClickListener(actividad_boton_sumar);
        boton_menos.setOnClickListener(actividad_boton_restar);
        boton_multiplicar.setOnClickListener(actividad_boton_multiplicar);
        boton_punto.setOnClickListener(actividad_boton_punto);
        boton00.setOnClickListener(actividad_boton_00);
        boton_igual.setOnClickListener(actividad_boton_igual);
        boton_porcentaje.setOnClickListener(actividad_boton_porcentaje);
        boton_masmenos.setOnClickListener(actividad_boton_masmenos);

    }
}