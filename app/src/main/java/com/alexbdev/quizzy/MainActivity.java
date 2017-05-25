package com.alexbdev.quizzy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static String INTENT_QUIZ_QUESTION_ID = "quizQuestionId";

    ListView listView;
    ArrayList<String> listItems = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListView();

        String[] items = {"Quiz 1", "Quiz 2"};

        addItems(items);
    }

    private void initListView() {
        listView = (ListView) findViewById(R.id.mainList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                String quizQuestionId = adapter.getItem(position);
                loadQuizQuestionActivity(quizQuestionId);
                System.out.println(quizQuestionId);
            }
        });

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);

        listView.setAdapter(adapter);
    }

    public void addItem(String content) {
        String[] items = {content};

        addItems(items);
    }

    public void addItems(String[] contents) {
        for (String content: contents) {
            listItems.add(content);
        }

        adapter.notifyDataSetChanged();
    }

    private void loadQuizQuestionActivity(String quizQuestionId) {
        setContentView(R.layout.activity_quiz_question);
        Intent i = new Intent(getApplicationContext(), QuizQuestionActivity.class);

        i.putExtra(MainActivity.INTENT_QUIZ_QUESTION_ID, quizQuestionId);
        startActivity(i);
    }
}
