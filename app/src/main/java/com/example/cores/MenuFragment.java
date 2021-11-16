package com.example.cores;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment implements View.OnClickListener{

    public OnFragmentInteractionListener listener;

    public MenuFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        Button btnPreto = (Button) view.findViewById(R.id.btnPreto);
        Button btnAzul = (Button) view.findViewById(R.id.btnAzul);
        Button btnVerde = (Button) view.findViewById(R.id.btnVerde);
        Button btnVermelho = (Button) view.findViewById(R.id.btnVermelho);
        Button btnAmarelo = (Button) view.findViewById(R.id.btnAmarelo);

        btnPreto.setOnClickListener(this);
        btnAzul.setOnClickListener(this);
        btnVerde.setOnClickListener(this);
        btnVermelho.setOnClickListener(this);
        btnAmarelo.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            int btn_id = v.getId();
            if(btn_id == R.id.btnPreto){
                listener.onFragmentInteraction("preto");
            }else if(btn_id == R.id.btnAzul){
                listener.onFragmentInteraction("azul");
            }else if(btn_id == R.id.btnVerde){
                listener.onFragmentInteraction("verde");
            }else if(btn_id == R.id.btnVermelho){
                listener.onFragmentInteraction("vermelho");
            }else if(btn_id == R.id.btnAmarelo){
                listener.onFragmentInteraction("amarelo");
            }else{
                listener.onFragmentInteraction("indefinido");
            }
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String text);
    }
}