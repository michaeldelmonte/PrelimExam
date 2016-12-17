package com.example.prelimexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {

    Hashtable<String, String> source = new Hashtable<String,String>();
    HashMap<String, String> map = new HashMap(source);
    CustomListAdapter adapter;
    ListView listView;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSaveToList(View view) {
        Log.d("@@@ handleSaveToList >","handleSaveToList");

        EditText txtName = (EditText) findViewById(R.id.textName);
        EditText txtCourse = (EditText) findViewById(R.id.textCourse);

        String strName = txtName.getText().toString();
        String strCourse = txtCourse.getText().toString();

        map.put(strName, strCourse);

        adapter = new CustomListAdapter(map);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
