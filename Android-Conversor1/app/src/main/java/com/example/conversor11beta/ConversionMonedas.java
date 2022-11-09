package com.example.conversor11beta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.conversor11beta.databinding.FragmentConversionMonedasBinding;


public class ConversionMonedas extends Fragment {


private FragmentConversionMonedasBinding mBinding;
    public ConversionMonedas() {
        // Required empty public constructor
    }


    public static ConversionMonedas newInstance(String param1, String param2) {
        ConversionMonedas fragment = new ConversionMonedas();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mBinding.btnconvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Validar que no esten los dos seleccionados

                if (mBinding.dolarAeuro.isChecked() && mBinding.euroAdolar.isChecked()) {
                    android.widget.Toast.makeText(getContext(), "Seleccione solo uno", Toast.LENGTH_LONG).show();
                }
                if (mBinding.dolarAeuro.isChecked() == false && mBinding.euroAdolar.isChecked() == false) {

                    android.widget.Toast.makeText(getContext(), "Seleccione Almenos uno", Toast.LENGTH_LONG).show();
                }else {


                    if (mBinding.dolarAeuro.isChecked()) {
                        android.widget.Toast.makeText(getContext(), "Selecciono de Dolar a Euro", Toast.LENGTH_LONG).show();
                    EuroDolar();
                    }  if (mBinding.euroAdolar.isChecked()) {
                        android.widget.Toast.makeText(getContext(), "Seleccione de Euro a dolar", Toast.LENGTH_LONG).show();
                   DolarEuro();
                    }

                }
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentConversionMonedasBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }


    private void EuroDolar() {

        if (mBinding.moneda.getText().toString().isEmpty()) {
            android.widget.Toast.makeText(getContext(), "Complete los campos", Toast.LENGTH_LONG).show();
        } else {
            // convirtiendo de String a double
            String eur = mBinding.moneda.getText().toString();
            double euro = Double.parseDouble(eur);
            double val;

            val = euro;

            mBinding.resultado.setText((Double.toString(val * 0.98)));
            mBinding.equivalencia.setVisibility(View.VISIBLE);
            mBinding.equivalencia.setText("un Euro es 0.98 dolar");

        }
    }
        private void DolarEuro(){

            if(mBinding.moneda.getText().toString().isEmpty()){
                android.widget.Toast.makeText(getContext(),"Complete los campos", Toast.LENGTH_LONG).show();
            }
            else{
                // convirtiendo de String a double
                String dol = mBinding.moneda.getText().toString();
                double dollar =Double.parseDouble(dol);
                double val;

                val=dollar;

                mBinding.resultado.setText((Double.toString(val*1.03)));
                mBinding.equivalencia.setVisibility(View.VISIBLE);
                mBinding.equivalencia.setText("1 Dolar es 1.03 Euro");

            }



    }





}