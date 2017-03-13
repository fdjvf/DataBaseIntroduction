package co.edu.uninorte.databaseintroduction;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Region;

/**
 * Created by fdjvf on 3/12/2017.
 */

public class DataEntryDAO {


    public String TAG=Constanst.TAG;
    private Context MyContext;
    private  DataHandler myHandler;
    private SQLiteDatabase mydb;
    public DataEntryDAO(Context context)
    {


        MyContext=context;
         myHandler=new DataHandler(MyContext);
        Open();

    }
    public   void Open()
    {
mydb=myHandler.getWritedb();
    }

    public   void Close()
    {
       myHandler.close();
    }

    public long addDataEntry(DataEntry myEntry)
    {//iNSERCION DE INFORMACION
        ContentValues val=new ContentValues();//Tabla Hash

        val.put(DataHandler.KEY_FIELD1,myEntry.field1);
        val.put(DataHandler.KEY_FIELD2,myEntry.field2);

        long index=mydb.insert(DataHandler.TABLE,null,val);
        return index;
    }
}
