package com.newtutorialslab.entertextdisplaytoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);

        //instead of implementing
        //button.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View view){
        String my_text = editText.getText().toString();
        Toast.makeText(getApplicationContext(),"Your Text is -:"+my_text,Toast.LENGTH_LONG).show();
    }
}
