package com.example.cadastro

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context, factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION){
        //Override Sobscreve função
        override fun onCreate(db: SQLiteDatabase) {

            val query = ("CREATE TABLE  aluno("
                    + ID_COL + " INTEGER PRIMARY KEY, " +
                    NAME + " TEXT, " +
                    LASTNAME + " TEXT, " +
                    EMAIL + " TEXT, " +
                    PHONENUMBER + " TEXT " + ")" )

                db.execSQL(query)
        }

        override  fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int){
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
            onCreate(db)
        }


    fun addName(name: String, lastName: String, email: String, phoneNumber: String){
        val values = ContentValues()
        values.put(NAME, name)
        values.put(LASTNAME, lastName)
        values.put(EMAIL, email)
        values.put(PHONENUMBER, phoneNumber)

        val db = this.writableDatabase

            db.insert(TABLE_NAME, null, values)
            db.close()

    }

    fun  getName(): Cursor? {
        val db = this.readableDatabase
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null)
    }

    companion object{
        private val DATABASE_NAME = "CadastroAlunos"
        private val DATABASE_VERSION = 1
            val TABLE_NAME = "aluno"
            val ID_COL = "id"
            val NAME = "name"
            val LASTNAME = "lastName"
            val EMAIL = "email"
            val PHONENUMBER = "number"
    }


    fun getDados(id: String):Cursor? {
        //val é uma variavel que nao pode ser alterada
        val db = this.readableDatabase

        return db.rawQuery("SELECT * FROM  aluno where id  = " + id, null)

    }

    fun deleteDados(cpf : String){
        val db = this.writableDatabase
        db.execSQL("SELECT * FROM aluno where id =" + cpf, null)
        db.close()

    }

    fun deletetodosDados(){
        val db = this.writableDatabase
        db.delete("aluno", null, null)
        db.close()
    }




}