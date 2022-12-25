package com.devdroid.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code For a Single Button
//        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//        alertDialog.setTitle("Terms & Condition");
//        alertDialog.setIcon(R.drawable.info);
//        alertDialog.setMessage("Have you read all the terms and condition");
//        alertDialog.setButton(Dialog.BUTTON_POSITIVE,"yes, I've Read", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this,"Yes, You can proceed now..", Toast.LENGTH_SHORT).show();
//            }
//        });
//        alertDialog.show();

        // AlertDialog For 2 Buttons
        AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this);
        delDialog.setTitle("Delete");
        delDialog.setIcon(R.drawable.delete);
        delDialog.setMessage("Are you sure want to delete?");
        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Item Deleted.", Toast.LENGTH_SHORT).show();
            }
        });

        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Item Not Deleted.", Toast.LENGTH_SHORT).show();
            }
        });
        delDialog.show();



    }
    // Alert Dialog For 3 Button
    // Outside the curly bracket we write the code on Backpress method if the user want to exit from the app


    @Override
    public void onBackPressed() {
        AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);
        exit.setTitle("Exit");
        exit.setIcon(R.drawable.exit);
        exit.setMessage("Do you want to Exit?");
        exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        });

        exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Welcome Backed!", Toast.LENGTH_SHORT).show();
            }
        });

        exit.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Operation Cancelled!", Toast.LENGTH_SHORT).show();
            }
        });

        exit.show();

    }
}