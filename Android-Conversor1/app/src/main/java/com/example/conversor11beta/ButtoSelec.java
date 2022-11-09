package com.example.conversor11beta;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.conversor11beta.databinding.FragmentButtoSelecBinding;
import com.example.conversor11beta.databinding.FragmentConversionMonedasBinding;


public class ButtoSelec extends Fragment {



private FragmentButtoSelecBinding mBinding;
    public ButtoSelec() {
        // Required empty public constructor
    }


    public static ButtoSelec newInstance(String param1, String param2) {
        ButtoSelec fragment = new ButtoSelec();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
;   mBinding = FragmentButtoSelecBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    Boolean estadoButton= true;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBinding.Btnverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(estadoButton ==true){

                    android.widget.Toast.makeText(getContext(), "Selecciono Btn Verde", Toast.LENGTH_LONG).show();
                    mBinding.Btnverde.setText("Activado");
                    estadoButton= false;
                }
                else if(estadoButton== false){
                    mBinding.Btnverde.setText("Desactivado");
                    estadoButton= true;
                }

            }
        });


    }
}