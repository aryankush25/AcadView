package com.example.aryankush25.authenticationapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import static android.content.Context.MODE_PRIVATE;

public class DBActivity {

    Context context;
    SQLiteDatabase db;

    public DBActivity(Context context) {
        this.context = context;
        db = context.openOrCreateDatabase("userauth",MODE_PRIVATE,null);
        db.execSQL("create table if not exists users(name varchar, password varchar)");
    }

    void addUser(String usr, String pwd) {

        db.execSQL("insert into users values('"+usr+"', '"+pwd+"')");
    }

    boolean checkAuth(String usr, String pwd) {

        Cursor c = db.rawQuery("select password from users where name='"+usr+"'", null);
        String orig_pswd="";

        if(c.moveToFirst()) {
            int index = c.getColumnIndex("password");

            orig_pswd = c.getString(index);
        }

        if(pwd.compareTo(orig_pswd) == 0)
            return true;
        return false;
    }

}
