package bsuir.prmp.l4login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
        View.OnClickListener oclSign = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("1") &&
                        password.getText().toString().equals("1")) {
                    Toast.makeText(getApplicationContext(), "Success",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }

                else {
                    Toast.makeText(getApplicationContext(), "Fail",Toast.LENGTH_SHORT).show();

                }

            }
        };
        button.setOnClickListener(oclSign);
    }

}