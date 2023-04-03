package com.example.android_tut_9;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button serious, fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializer();
        serious.setOnClickListener(this);
        fun.setOnClickListener(this);

    }

    public void initializer() {
        serious = (Button) findViewById(R.id.b1);
        fun = (Button) findViewById(R.id.b2);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.b1:
                serious.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //creating alertDialogBox
                        //passing context in dialogbox where to call
                        new AlertDialog.Builder(MainActivity.this)

                                //setting icon
                                .setIcon(R.drawable.baseline_assistant_photo_24)

                                //text to display
                                .setTitle("Do you really want to quit?")

                                //positive button
                                //yes=text for pos button
                                //new DialogInterface is what we want to do
                                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })

                                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })

                                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })

                                //to display the dialog box
                                .show();


                    }
                });
                break;

            case R.id.b2:
                fun.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        //creating alertDialogBox
                        //passing context in dialogbox where to call
                        new AlertDialog.Builder(MainActivity.this)

                                //setting icon
                                .setIcon(R.drawable.baseline_emoji_people_24)

                                //text to display
                                .setTitle("Good Bye :)")

                                //positive button
                                //yes=text for pos button
                                //new DialogInterface is what we want to do
                                .setPositiveButton("Leave me", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })

                                .setNegativeButton("Don't Go", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })

                                .setNeutralButton("Just wait let me think", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {

                                    }
                                })

                                //to display the dialog box
                                .show();


                    }
                });


                break;

        }


    }
}