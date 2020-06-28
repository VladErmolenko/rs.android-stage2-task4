package com.example.myapplication
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
class DBHelper : SQLiteOpenHelper {
    val DATABASE_VERSION=1
    val DATABASE_NAME="zooDb"
    val TABLE_DATA="animals"
    val KEY_ID="id"
    val KEY_NAME="NAME"
    val KEY_AGE="age"
    val KEY_BREED="breed"

    constructor(context: Context,name:String,version:Int) : super(context,name,null,version)

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table "+TABLE_DATA+"("+KEY_ID+" integer primary key, "+ KEY_ID
+" integer primary key, " + KEY_NAME + " text, "+ KEY_AGE+" text"
+ KEY_BREED + " text" + ")")
}

override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    db?.execSQL("drop table if exists "+ TABLE_DATA)

    onCreate(db)

}

}