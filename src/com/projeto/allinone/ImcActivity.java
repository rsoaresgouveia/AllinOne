package com.projeto.allinone;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ImcActivity extends Activity {
	TextView tvHomeImc;
	EditText edPeso, edAltura;
	Button btCalc, btLimpa;
	double imc, peso, altura;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_imc);
		edPeso = (EditText)findViewById(R.id.edPeso);
		edAltura = (EditText)findViewById(R.id.edAltura);
		btCalc = (Button)findViewById(R.id.btCalcImc);
		btLimpa = (Button)findViewById(R.id.btLimpar);
		tvHomeImc = (TextView)findViewById(R.id.tvHomeImc);
		
		tvHomeImc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
		btLimpa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				edPeso.setText("");
				edAltura.setText("");
			}
		});
		
		btCalc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				peso = (Double.parseDouble(edPeso.getText().toString()));
				altura = (Double.parseDouble(edAltura.getText().toString()));
				
				altura = altura / 100;
				imc = peso / (altura * altura);
				
				if(imc < 17){
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Muito abaixo do Peso");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}else if (imc >= 17 && imc < 18.5){
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Abaixo do Peso");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}else if (imc >= 18.5 && imc < 25){
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Peso normal");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}else if (imc >= 25 && imc < 30){
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Acima do Peso");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}else if(imc >=30 && imc < 35){
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Obesidade I");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}else if(imc >35 && imc <40){
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Obesidade II - SEVERA");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}else{
					AlertDialog.Builder alerta = new AlertDialog.Builder(ImcActivity.this);
					alerta.setTitle("Calculadora IMC");
					alerta.setMessage("Seu imc é de: " + String.format("%.2f", imc) + " - Obesidade III - MÓRBIDA");
					alerta.setNeutralButton("OK", null);
					alerta.show();
				}
				
				
				
			}
		});
		
	}

}









