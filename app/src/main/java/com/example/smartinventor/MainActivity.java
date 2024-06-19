package com.example.smartinventor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smartinventor.http.MyApiInterface;
import com.example.smartinventor.http.models.LoginRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    EditText username , password ;
    TextView forgetPwd ;
    Button login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        username = findViewById(R.id.connexion_username);
        password = findViewById(R.id.connexion_password);
        login = findViewById(R.id.connexion_loginbtn);
        forgetPwd = findViewById(R.id.forget_pwd);

        login.setOnClickListener(v -> {
            httpLogin();
        });
        forgetPwd.setOnClickListener(v ->{
            forgetPwdFn();
        });

    }

    private void forgetPwdFn() {
    }

    private void httpLogin() {

        LoginRequest loginRequest = new LoginRequest(
                username.getText().toString(),
                password.getText().toString()
        );

        Intent intent = new Intent(this , MapActivity.class);
        startActivity(intent);
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://192.168.1.12:8081/api/v1/auth/login") // Replace with your base URL
//                 .build();
//        MyApiInterface apiService = retrofit.create(MyApiInterface.class);
//        Call<Object> http = apiService.login(loginRequest);
//        http.enqueue(new Callback<Object>() {
//            @Override
//            public void onResponse(Call<Object> call, Response<Object> response) {
//                Toast.makeText(MainActivity.this, "login succ", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(Call<Object> call, Throwable t) {
//                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}