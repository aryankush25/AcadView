package com.example.aryankush25.notesapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class DBActivity {

    Context context;
    SQLiteDatabase db;

    public DBActivity(Context context) {
        this.context = context;
        db = context.openOrCreateDatabase("noteDB",MODE_PRIVATE,null);
    }

    void AddNote(String notes){

        try {
            //SQLiteDatabase db = context.openOrCreateDatabase("notesDB", MODE_PRIVATE, null);
            db.execSQL("create table if not exists noteList (text VARCHAR)");


            db.execSQL("insert into noteList values('" + notes + "')");
            Log.i("notes", "Success");
            Toast.makeText(context, "Notes added successfully", Toast.LENGTH_SHORT).show();


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    ArrayList<String> getNotes() {

        ArrayList<String> notes = new ArrayList<>();
        try{
            //SQLiteDatabase db = context.openOrCreateDatabase("notesDB", MODE_PRIVATE, null);
            Cursor c = db.rawQuery("SELECT * FROM noteList",null);
            if(c.moveToFirst()) {
                do {
                    int index = c.getColumnIndex("text");

                    String note = c.getString(index);
                    Log.d("note",note);
                    notes.add(note);
                } while (c.moveToNext());
                Toast.makeText(context, "Notes got successfully", Toast.LENGTH_SHORT).show();
            }
        }catch(Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "Notes didn't get successfully", Toast.LENGTH_SHORT).show();
        }

        return  notes;
    }

}
