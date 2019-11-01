package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.example.proteintracker.Model.DaftarTeman;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);

        Button layoutBtn = (Button)findViewById(R.id.buttonLayout);
        layoutBtn.setOnClickListener(buttonLayoutListener);

        Button relativeBtn = (Button)findViewById(R.id.relativeButton);
        relativeBtn.setOnClickListener(relativeButtonListener);

        Button tableBtn = (Button)findViewById(R.id.tableButton);
        tableBtn.setOnClickListener(tableButtonListener);

        Button proteinBtn = (Button)findViewById(R.id.proteinButton);
        proteinBtn.setOnClickListener(proteinButtonListener);

        Button mhsFragmentBtn = (Button)findViewById(R.id.btnFragmenMhs);
        mhsFragmentBtn.setOnClickListener(mhsFragmentButtonListener);

        Button btnlist = (Button)findViewById(R.id.list_Activity);
        btnlist.setOnClickListener(listActivityButtonListener);

        Button btnRec = (Button)findViewById(R.id.btnrec);
        btnRec.setOnClickListener(recButtonListener);

        Button btnCardViewMhs = (Button)findViewById(R.id.btnCardViewteman);
        btnCardViewMhs.setOnClickListener(cardViewMhsButtonListener);

        if(savedInstanceState != null){
            Log.d("ProteinTracker",savedInstanceState.getString("abc"));
        }

        Button fragment = (Button)findViewById(R.id.fragment);
        fragment.setOnClickListener(fragmentButtonListener);
    }

    private View.OnClickListener buttonLayoutListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Test.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener listActivityButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, List.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener relativeButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Text.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener tableButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Table.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener proteinButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ProteinTrackerApp.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener myBtnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            EditText myEditText = (EditText) findViewById(R.id.editText1);
            Log.d("Proteintracker",myEditText.getText().toString());
        }
    };

    private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            Bundle b = new Bundle();
            EditText myEditText = (EditText)findViewById(R.id.editText1);
            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    };

    private View.OnClickListener fragmentButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main3FragmentActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener mhsFragmentButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,MahasiswaActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener recButtonListener = new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Intent intent = new Intent(MainActivity.this,RecyclerViewActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener cardViewMhsButtonListener = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,DaftarTemanActivity.class);
            startActivity(intent);
        }
    };


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
        }
    }