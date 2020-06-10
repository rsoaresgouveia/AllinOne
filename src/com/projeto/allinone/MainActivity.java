package com.projeto.allinone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView btTelaImc, btTelaComb, btTelaCalc, btTelaMeu;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		btTelaImc = (TextView)findViewById(R.id.edTelaImc);
		btTelaComb = (TextView)findViewById(R.id.edTelaComb);
		btTelaCalc = (TextView)findViewById(R.id.edTelaCalc);
		btTelaMeu = (TextView)findViewById(R.id.edTelaMeu);
		
		btTelaImc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent telaImc = new Intent(MainActivity.this, ImcActivity.class);
				startActivity(telaImc);
				
			}
		});
		
		btTelaComb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent telaImc = new Intent(MainActivity.this, CombustivelActivity.class);
				startActivity(telaImc);
				
			}
		});
	}

}
