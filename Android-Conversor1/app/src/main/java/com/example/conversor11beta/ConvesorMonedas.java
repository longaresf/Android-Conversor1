package com.example.conversor11beta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.conversor11beta.databinding.ActivityConvesorMonedasBinding;

public class ConvesorMonedas extends AppCompatActivity {


    private ActivityConvesorMonedasBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convesor_monedas);

        mBinding = ActivityConvesorMonedasBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        OpenFragment();
    }



    // METODO QUE INSTANCIA Y ABRE FRAGMENTO

    private void OpenFragment(){
          ConversionMonedas conversionMonedas = new ConversionMonedas();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mBinding.contenedorFr.getId(),conversionMonedas,
                        ConversionMonedas.class.getSimpleName());
               transaction.commit();

    }
}