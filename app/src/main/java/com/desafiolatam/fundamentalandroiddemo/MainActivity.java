package com.desafiolatam.fundamentalandroiddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinearLayout = findViewById(R.id.btn_task_one);
        Button btnRelativeLayout = findViewById(R.id.btn_task_two);
        Button btnConstraintLayout = findViewById(R.id.btn_task_three);
        Button btnFrameLayout = findViewById(R.id.btn_task_four);
        Button btnLoginScreen = findViewById(R.id.btn_task_five);
        Button btnListView = findViewById(R.id.btn_task_six);
        Button btnRecyclerView = findViewById(R.id.btn_task_seven);

        btnLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, LinearLayoutActivity.class);
            startActivity(intent);
        });

        btnRelativeLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, RelativeLayoutActivity.class);
            startActivity(intent);
        });

        btnConstraintLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, ConstrainLayoutActivity.class);
            startActivity(intent);
        });

        btnFrameLayout.setOnClickListener(view -> {
            Intent intent = new Intent(this, FrameLayoutActivity.class);
            startActivity(intent);
        });

        btnLoginScreen.setOnClickListener(view -> {
            Intent intent = new Intent(this, LoginScreenActivity.class);
            startActivity(intent);
        });

        btnListView.setOnClickListener(view -> {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });

        btnRecyclerView.setOnClickListener(view -> {
            Intent intent = new Intent(this, RecyclerViewActivity.class);
            startActivity(intent);
        });
    }
}