package com.elysewarren.inclassassignment07_elysew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("title");
    private DatabaseReference dogRef = database.getReference("dog");

    private EditText displayTitle;
    private EditText displayBreed;
    private EditText displayAge;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTitle = (EditText) findViewById(R.id.title_view);
        displayBreed = (EditText) findViewById(R.id.dog_breed);
        displayAge = (EditText) findViewById(R.id.dog_age);
        checkBox = (CheckBox) findViewById(R.id.allergy_type);
    }

    public void set(View view) {
        titleRef.setValue(displayTitle.getText().toString());
    }

    public void add(View view) {
        String dogType = displayBreed.getText().toString();
        int dogAge = Integer.parseInt(displayAge.getText().toString());
        boolean isAllergic = checkBox.isChecked();

        Dog yorkie = new Dog(dogType, dogAge, isAllergic);
        dogRef.push().setValue(yorkie);
    }

}
