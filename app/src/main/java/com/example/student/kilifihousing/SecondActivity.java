package com.example.student.kilifihousing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity  {

    private FirebaseAuth mAuth;
    private Button logout;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mAuth = FirebaseAuth.getInstance();

        logout = (Button)findViewById(R.id.btnlogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               logout();

            }
        });
    }
    private void logout(){
        mAuth.signOut();
        finish();
        startActivity(new Intent(SecondActivity.this,MainActivity.class));

    }

    @Override
  public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
  }
  @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.logoutmenu:{
                logout();
            }

        }
      return super.onOptionsItemSelected(item);
  }

  }
