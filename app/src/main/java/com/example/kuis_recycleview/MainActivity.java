package com.example.kuis_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kuis_recycleview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private com.example.recyclerview_keluarga.Keluarga_Adapter keluarga_adapter;
    private ArrayList<com.example.recyclerview_keluarga.Keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recycleView);
        keluarga_adapter = new com.example.recyclerview_keluarga.Keluarga_Adapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluarga_adapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new com.example.recyclerview_keluarga.Keluarga("ACH. SYAFII", "Bapak", getDrawable(R.drawable.draw1)));
        keluargaArrayList.add(new com.example.recyclerview_keluarga.Keluarga("DARWATI", "Ibuk", getDrawable(R.drawable.draw2)));
        keluargaArrayList.add(new com.example.recyclerview_keluarga.Keluarga("MOCH. IBNU ABBAS AL", "Anak", getDrawable(R.drawable.draw3)));
    }
}