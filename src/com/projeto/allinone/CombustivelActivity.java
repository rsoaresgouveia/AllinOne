package com.projeto.allinone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CombustivelActivity extends Activity {
	TextView tvMain;
	EditText edGasolina, edEtanol;
	Button btCalc, btLimpa;
	double diferenca, gasolina, etanol;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_combustivel);
		tvMain = (TextView)findViewById(R.id.tvHomeImc);
		edGasolina = (EditText)findViewById(R.id.edGasolina);
		edEtanol = (EditText)findViewById(R.id.edEtanol);
		btCalc = (Button)findViewById(R.id.btCalcComb);
		btLimpa = (Button)findViewById(R.id.btLimparComb);
		
		btCalc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				gasolina = (Double.parseDouble(edGasolina.getText().toString()));
				etanol = (Double.parseDouble(edEtanol.getText().toString()));
				
				diferenca = gasolina * 0.7;
				
				if(etanol > diferenca){
					Toast.makeText(CombustivelActivity.this,"ABASTEÇA GASOLINA" , 4000).show();
				}else{
					Toast.makeText(CombustivelActivity.this,"ABASTEÇA ETANOL" , 4000).show();
				}
			}
		});
		btLimpa.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				edGasolina.setText("");
				edEtanol.setText("");
				
			}
		});
		tvMain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				
			}
		});
	}
}














