package br.com.brcommariojpexercise1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String CHAVE_ROTULO = "CHAVE";
    private EditText text;
    private TextView textView;
    private Button button;
    String gameState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            gameState = savedInstanceState.getString(GAME_STATE_KEY);
        }
        setContentView(R.layout.activity_main);
        this.editText = findViewById(R.id.editNome);
        this.textView = findViewById(R.id.labelMensagem);
        this.button = findViewById(R.id.btnCumprimentar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                acao(v);
            }
        });
    }
    public void acao (View v) {
        Intent intent = new Intent(this,Segunda_Activity.class);
        intent.putExtra(CHAVE_ROTULO,this.textView.getText().toString());
        startActivity(intent);
        String texto = this.editText.getText().toString();
        this.textView.setText("Alô, "+texto+"!"+texto);
    }
    protected void onStart(Bundle bundle) {
        super.onStart();
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String label = savedInstanceState.getString("CHAVE");
        this.textView.setText(label);
        textView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(GAME_STATE_KEY, gameState);
        outState.putString(TEXT_VIEW_KEY, textView.getText());
        outState.putString("CHAVE", this.textView.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("RESULT","RETORNO");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}