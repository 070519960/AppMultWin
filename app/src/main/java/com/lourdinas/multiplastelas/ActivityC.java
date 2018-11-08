package com.lourdinas.multiplastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        TextView txtidade = findViewById(R.id.tx_nome);
        Button fechar = findViewById(R.id.btn_fechar);

        Intent intentRecebido =getIntent();
        String idade = intentRecebido.getStringExtra("nome");

        txtidade.setText(idade);


        fechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
