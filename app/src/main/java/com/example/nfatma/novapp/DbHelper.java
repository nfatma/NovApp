package com.example.nfatma.novapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final String database_name = "Student_Data";

    public static final String table_name = "Student_Register";

    public static final String stud_id = "student_id";
    public static final String first_name = "student_first_name";
    public static final String last_name = "student_last_name";
    public static final String marks = "student_marks";

    public static int VERSION = 1;

    private static final String CREATE_TABLE = "create table if not exists " + table_name + "(" + stud_id + " integer primary key," +
            first_name + " text," +last_name + " text," + marks + " integer)";

    private static final String DROP_TABLE = "drop table if exists "+table_name;


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public void insert(SQLiteDatabase db, int id, String first, String last, int mark){
        ContentValues cv = new ContentValues();
        cv.put(stud_id, id);
        cv.put(first_name, first);
        cv.put(last_name, last);
        cv.put(marks, mark);
        db.insert(table_name, null, cv);
    }

    public Cursor viewAll(SQLiteDatabase db){
        String[] data_row = {stud_id, first_name, last_name, marks};
        return db.query(table_name, data_row, null, null, null, null, null );
    }

    public Cursor view(SQLiteDatabase db, int id){
        String[] data_row = {stud_id, first_name, last_name, marks};

        return db.query(table_name, data_row, stud_id + "=" + "'" + id + "'", null, null, null, null);
    }

    public void update(SQLiteDatabase db, int id, String first, String last, int mark){
        ContentValues cv = new ContentValues();
        cv.put(stud_id, id);
        cv.put(first_name, first);
        cv.put(last_name, last);
        cv.put(marks, mark);
        db.update(table_name, cv,stud_id + "=" + "'" + id + "'", null);

    }

    public void delete(SQLiteDatabase db, int id){
        db.delete(table_name, stud_id + "=" + id, null);
    }
}

