package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String languages[], descriptions[];
    int images[] = {R.drawable.c, R.drawable.cpp, R.drawable.csharp, R.drawable.java, R.drawable.javascript, R.drawable.kotlin, R.drawable.net, R.drawable.php, R.drawable.python, R.drawable.scala};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        languages = getResources().getStringArray(R.array.programming_languages);
        descriptions = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, languages, descriptions, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}