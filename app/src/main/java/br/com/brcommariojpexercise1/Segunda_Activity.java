package br.com.brcommariojpexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Segunda_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView textView = findViewById(R.id.textView);

        if(getIntent().hasExtra(MainActivity.CHAVE_ROTULO)) {
            String texto = getIntent().getStringExtra(MainActivity.CHAVE_ROTULO);
            textView.setText(texto);
        }
    }
    public void voltar(View view) {
       Log.d("BOTAO","BOTAO VOLTAR");
       Intent intent = new Intent();
       intent.putExtra("CHAVE","VALOR");
       setResult(200,intent);
       intent = new Intent(this,MainActivity.class);
       startActivity(intent);
       finish();
    }
}