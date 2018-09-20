package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);
        btn = (Button) findViewById(R.id.btn);

    }

    @Override
    public void onClick(View view) {
        btn.setText(LocalDateTime.now().toString());
    }
}
