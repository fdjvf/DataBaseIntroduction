package co.edu.uninorte.databaseintroduction;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by fdjvf on 3/12/2017.
 */

public class DataHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "mYFirstDb";

    public static final String TABLE = "myTable";
    public static final String KEY_ID = "id";
    public static final String KEY_FIELD1 = "field1";
    public static final String KEY_FIELD2 = "field2";

    public DataHandler(Context MyContext) {
        super(MyContext, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d(Constanst.TAG, "DataHandler Called");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Metodo que se llama para crear la base de datos
        Log.d(Constanst.TAG, "Table Created");
        String CREATE_TABLE = "CREATE TABLE " + TABLE + "(" + KEY_ID + " integer primary key," + KEY_FIELD2 + " integer," + KEY_FIELD1 + " interger)";
        if (db.isOpen()) {
            db.execSQL(CREATE_TABLE);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Metodo que se llama para actualizar  la base de datos
        Log.d(Constanst.TAG, "Table Deleted");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
    }

    public SQLiteDatabase getWritedb()
    {
return  super.getWritableDatabase();
    }
}
