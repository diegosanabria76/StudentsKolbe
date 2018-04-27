package com.example.diegosanabriabecerra.studentskolbe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    student diego;
    student mariana;
    student luciana;
    student olga;

    TextView name;
    TextView lastName;
    TextView age;
    TextView studentCode;
    ArrayList<student> people;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diego = new student("Diego","Sanabria","79691422", 42);
        mariana = new student("Mariana","Sanabria","20060308", 12);
        luciana = new student("Luz Dary","Sanabria","20090711", 8);
        olga = new student("Olga","Agon","80907898", 39);
       // System.out.println("edad de diego"+diego.getAge());
        //System.out.println("nombre "+diego.getName());
        //System.out.println("apellido "+diego.getLastName());
       // System.out.println("codigo"+diego.getCodigoStudent());
       name = (TextView) findViewById(R.id.name);
        lastName = (TextView) findViewById(R.id.lastName);
        age = (TextView) findViewById(R.id.age);
        studentCode = (TextView) findViewById(R.id.code);


        name.setText(diego.getName());
        lastName.setText(diego.getLastName());
        age.setText(String.valueOf(diego.getAge()));// the way to get an integer value into a TextView.
        studentCode.setText(diego.getCodigoStudent());
        people = new ArrayList<>();

        people.add(mariana);
        people.add(luciana);
        people.add(olga);
        people.add(diego);

        for(int i =0; i < people.size(); i++){
            Log.d("hola","onCreate: name: " + people.get(i).getName());
        }






    }
}
