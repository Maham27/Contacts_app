package com.example.contacts_app;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.ImageView;

import java.io.FileOutputStream;
import java.io.IOException;


public class addperson extends AppCompatActivity {


    EditText etname,etemail,etnum,etadress,etdob;
    ImageView ivp,imBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addperson);
        etname=findViewById(R.id.etname);
        etemail=findViewById(R.id.etemail);
        etnum=findViewById(R.id.etnum);
        etadress=findViewById(R.id.etadress);
        etdob=findViewById(R.id.etdob);
        ivp=findViewById(R.id.ivp);
        imBack=findViewById(R.id.imBack);

        imBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name, eml;
                String adrs;
                String number, dob;
                Name = etname.getText().toString().trim();
                eml = etemail.getText().toString().trim();
                number = etnum.getText().toString().trim();
                adrs = etadress.getText().toString().trim();
                dob = etdob.getText().toString().trim();
                if (Name.isEmpty()) {
                    etname.setError("name cannot be empty");
                } else if (eml.isEmpty()) {
                    etemail.setError("email cannot be empty");
                } else if (number.isEmpty()) {
                    etnum.setError("no cannot be empty");
                } else if (adrs.isEmpty()) {
                    etadress.setError("adress cannot be empty");
                } else if (dob.isEmpty()) {
                    etdob.setError("name cannot be empty");
                } else {
                    Intent intent4 = new Intent();
                    intent4.putExtra("n", Name);
                    intent4.putExtra("e", eml);
                    intent4.putExtra("adres", adrs);
                    intent4.putExtra("num", number);
                    intent4.putExtra("d", dob);
                    setResult(RESULT_OK, intent4);
                    finish();
                }
                String datafile="contactdata";
                String info=Name+","+eml+","+adrs+","+number+","+dob;
                FileOutputStream fileOutputStream=null;
                try {
                    fileOutputStream = openFileOutput(datafile,MODE_APPEND);
                    fileOutputStream.write(info.getBytes());
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}