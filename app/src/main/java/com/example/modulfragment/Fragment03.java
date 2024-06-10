package com.example.modulfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment03 extends Fragment {

    private Button bf01;
    private Button bf02;
    private Button bf03;
    private Button bact2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.layout_fragment03, container, false);

        bf01 = view.findViewById(R.id.f01);
        bf02 = view.findViewById(R.id.f02);
        bf03 = view.findViewById(R.id.f03);
        bact2 = view.findViewById(R.id.act2);

        bf01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "Pindah ke Fragment 01",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });

        bf02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "Pindah ke Fragment 02",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        bf03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "Pindah ke Fragment 03",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(2);
            }
        });
        bact2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(), "Pindah ke Activity Kedua",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ActivityKedua.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
