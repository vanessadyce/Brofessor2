package com.example.vanessadyce.brofessor2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import android.widget.EditText;

public class BrofessorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brofessor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_brofessor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getBroName(View view) {
        ArrayList<String> names = new ArrayList<String>();
        String[] list = {"Brock", "Rock", "Mc", "Awesome", "Sally"};
        names.addAll(Arrays.asList(list));
        Random rand = new Random();
        String name = names.get(rand.nextInt(names.size()-1)) + " " + names.get(rand.nextInt(names.size()-1)) +
                names.get(rand.nextInt(names.size()-1));

        //EditText nameDisplay = (EditText)findViewById(R.id.editText);

        //nameDisplay.setText(name);
    }
}
