package com.example.cores;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class BoxFragment extends Fragment {

    public View viewColor;

    public BoxFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_box, container, false);
        viewColor = (View) view.findViewById(R.id.viewColor);
        return view;
    }

    public void mudarCor(String cor){
        if (cor != null){
            if(cor == "preto"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.preto));
            }else if(cor == "azul"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.azul));
            }else if(cor == "verde"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.verde));
            }else if(cor == "vermelho"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.vermelho));
            }else if(cor == "amarelo"){
                viewColor.setBackgroundColor(getResources().getColor(R.color.amarelo));
            }else{
                viewColor.setBackgroundColor(Color.GRAY);
            }
        }
    }
}
