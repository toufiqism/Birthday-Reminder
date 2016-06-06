package com.example.oblivion.birthdayreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class HomeActivity extends BaseActivity {

    private ListView lstDataInHomeActivity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initializeControls();
        loadData();
        registerActions();

    }

    private void registerActions() {
    }

    private void loadData() {
    }

    private void initializeControls() {
        lstDataInHomeActivity = (ListView) findViewById(R.id.lstDataInHomeActivity);


    }
}
