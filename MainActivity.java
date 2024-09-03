package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan variabel dengan elemen di layout
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        // Mengatur click listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                // Validasi login sederhana
                if (user.equals("admin") && pass.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login berhasil!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login gagal! Username atau password salah.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
