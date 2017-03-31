package com.elysewarren.inclassassignment07_elysew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference dogRef = database.getReference("dog");
    private DatabaseReference dogsRef = database.getReference("dogs");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {
        dogRef.setValue(new Dog("Poodle", 10, false));
    }

    public void add(View view) {
        dogsRef.push().setValue(new Dog("Yorkie", 11, true));
    }

}
