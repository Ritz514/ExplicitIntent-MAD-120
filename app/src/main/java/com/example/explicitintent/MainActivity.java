package com.example.explicitintent;
import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        btn1 = findViewById(R.id.btn1);
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        btn1.setOnClickListener(View->{
            i.putExtra("number",edt1.getText().toString());
            startActivity(i);
        });

    }
}
