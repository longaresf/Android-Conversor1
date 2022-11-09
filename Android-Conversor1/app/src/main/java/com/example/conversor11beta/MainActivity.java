package com.example.conversor11beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.conversor11beta.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        // INTENT PARA IR AL CONVERSOR

        mBinding.Btnconversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
      // para ir a otra actividad
                Intent intent = new Intent(MainActivity.this,ConvesorMonedas.class);
                startActivity(intent);

            }
        });

        // INTENT PARA IR A LOS TOAST

     mBinding.BtnToast.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MainActivity.this,ButtonsSelection.class);
             startActivity(intent);

         }
     });

    }
}