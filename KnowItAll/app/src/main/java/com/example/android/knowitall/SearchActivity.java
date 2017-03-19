package com.example.android.knowitall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        // Find the button view that says next
        Button search = (Button) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                EditText searchBar = (EditText) findViewById(R.id.search_bar);

                Intent next_activity = new Intent(SearchActivity.this, NewsActivity.class);
                next_activity.putExtra("query", searchBar.getText().toString());

                startActivity(next_activity);
            }
        });


    }

}
