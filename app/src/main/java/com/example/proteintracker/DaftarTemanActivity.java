package com.example.proteintracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.DaftarTeman;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarTemanAdapter daftarTemanAdapter;
    private ArrayList<DaftarTeman>DaftarTemanArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();

        recyclerView = findViewById(R.id.RvTeman);
        daftarTemanAdapter = new DaftarTemanAdapter(DaftarTemanArraylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter(daftarTemanAdapter);
    }
    private  void addData(){
        DaftarTemanArraylist =  new ArrayList<>();
        DaftarTemanArraylist.add(new DaftarTeman("Adrian Paskalis","72170125","Baca Buku","Data Analyst","Skuy Living","Laki-Laki", R.drawable.adrian));
        DaftarTemanArraylist.add(new DaftarTeman("Yos Rafel Kristanto","72170092","Main game","Banyak uang","sans","Laki-Laki", R.drawable.yos));
        DaftarTemanArraylist.add(new DaftarTeman("Yashinta Novita Dewi","72170110","Tidur","Kaya raya","lebih baik naik gunung","Perempuan", R.drawable.shinta));
        DaftarTemanArraylist.add(new DaftarTeman("Laurentia Yulia C","72170126","Make Up","Putih","jangan jadi bucin","Perempuan", R.drawable.lau));
    }
}