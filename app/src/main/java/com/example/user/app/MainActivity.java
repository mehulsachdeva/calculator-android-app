package com.example.user.app;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mDisplayResult;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btneq,btndot,btnclear;
    double temp;
    double temp_new;
    int flag=0;
    String operator="notassigned";

    public void calcResult(){
        if(operator=="add"){
            temp_new=temp;
            temp = Double.parseDouble(mDisplayResult.getText().toString());
            if(temp_new != 0) {
                temp = temp_new+temp;
            }
            else{
                temp=temp;
            }
            //mDisplayResult.setText(Double.toString(temp));
        }
        else if(operator=="sub"){
            temp_new=temp;
            temp = Double.parseDouble(mDisplayResult.getText().toString());
            if(temp_new != 0) {
                temp = temp_new-temp;
            }
            else{
                temp=temp;
            }
            //mDisplayResult.setText(Double.toString(temp));
        }
        else if(operator=="mul"){
            temp_new=temp;
            temp = Double.parseDouble(mDisplayResult.getText().toString());
            if(temp_new != 0) {
                temp = temp_new*temp;
            }
            else{
                temp=temp;
            }
            //mDisplayResult.setText(Double.toString(temp));
        }
        else if(operator=="div"){
            temp_new=temp;
            temp = Double.parseDouble(mDisplayResult.getText().toString());
            if(temp_new != 0) {
                temp = temp_new/temp;
            }
            //mDisplayResult.setText(Double.toString(temp));
        }
        else if(operator=="notassigned"){
            temp = Double.parseDouble(mDisplayResult.getText().toString());
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mDisplayResult=(TextView) findViewById(R.id.result_display);
        btnclear=(Button) findViewById(R.id.buttonclear);
        btn0=(Button) findViewById(R.id.button0);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);
        btn7=(Button) findViewById(R.id.button7);
        btn8=(Button) findViewById(R.id.button8);
        btn9=(Button) findViewById(R.id.button9);
        btndot=(Button) findViewById(R.id.buttondot);
        btnadd=(Button) findViewById(R.id.buttonadd);
        btnsub=(Button) findViewById(R.id.buttonsub);
        btnmul=(Button) findViewById(R.id.buttonmul);
        btndiv=(Button) findViewById(R.id.buttondiv);
        btneq=(Button) findViewById(R.id.buttoneq);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText("");
                temp=0;
                temp_new=0;
                flag=0;
                operator="notassigned";
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+"9");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDisplayResult.setText(mDisplayResult.getText()+".");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0){
                    calcResult();
                }
                else{
                    flag=0;
                }
                mDisplayResult.setText("");
                operator="add";
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0){
                    calcResult();
                }
                else{
                    flag=0;
                }
                mDisplayResult.setText("");
                operator="sub";
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0){
                    calcResult();
                }
                else{
                    flag=0;
                }
                mDisplayResult.setText("");
                operator="mul";
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0){
                    calcResult();
                }
                else{
                    flag=0;
                }
                mDisplayResult.setText("");
                operator="div";
            }
        });

        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcResult();
                flag=1;
                mDisplayResult.setText(Double.toString(temp));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.help,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int  id=item.getItemId();
        if(id==R.id.credits){
            Toast.makeText(getApplicationContext(),"Made By Mehul Sachdeva",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.action_help){
            Toast.makeText(getApplicationContext(),"Page Not Found",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
