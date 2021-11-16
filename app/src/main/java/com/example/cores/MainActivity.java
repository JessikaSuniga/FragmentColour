package com.example.cores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MenuFragment.OnFragmentInteractionListener{

    public BoxFragment boxFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxFragment = (BoxFragment) getSupportFragmentManager().findFragmentById(R.id.frag_box);
    }

    @Override
    public void onFragmentInteraction(String cor) {
        boxFragment.mudarCor(cor);
    }
}