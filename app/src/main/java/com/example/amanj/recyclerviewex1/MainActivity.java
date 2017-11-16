package com.example.amanj.recyclerviewex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String states[]={
            "Arunachal Pradesh",
            "Assam",
            "Bihar",
            "Chhattisgarh",
            "Goa",
            "Gujarat",
            "Jharkhand",
            "Karnataka",
            "Kerala",
            "Rajasthan",
            "Tamil Nadu",
            "West Bengal"

    };

    String cap[]={
            "Itanagar",
            "Dispur",
            "Patna",
            "Raipur",
            "Panaji",
            "Gandhinagar",
            "Ranchi",
            "Bangalore",
            "Thiruvananthapuram",
            "Jaipur",
            "Chennai",
            "Kolkata"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.Recyclerview);
        adapter=new MyAdapter(states,cap);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


    }
}
