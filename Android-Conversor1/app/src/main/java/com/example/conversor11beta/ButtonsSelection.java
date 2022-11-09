package com.example.conversor11beta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.conversor11beta.databinding.ActivityButtonsSelectionBinding;
import com.example.conversor11beta.databinding.ActivityConvesorMonedasBinding;

public class ButtonsSelection extends AppCompatActivity {


    private ActivityButtonsSelectionBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_selection);
        mBinding = ActivityButtonsSelectionBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        OpenFragment();

    }



    private void OpenFragment(){
        ButtoSelec buttoSelec = new ButtoSelec();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction()
                .add(mBinding.cotenedorToast.getId(),buttoSelec,
                        ConversionMonedas.class.getSimpleName());
        transaction.commit();

    }
}