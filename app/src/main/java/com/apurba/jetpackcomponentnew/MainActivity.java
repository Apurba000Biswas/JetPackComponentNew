package com.apurba.jetpackcomponentnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setRecyclerView();

    }


    private void setRecyclerView(){
        RecyclerView rvList = findViewById(R.id.rv_list);
        rvList.setHasFixedSize(true);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL
                , false);
        rvList.setLayoutManager(layoutManager);

        ListAdapter adapter = new ListAdapter();
        rvList.setAdapter(adapter);
    }
}