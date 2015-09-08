package androidhive.info.materialdesign.dbconnection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

//import androidhive.info.materialdesign.model.EventORM;

/**
 * Created by baratheraja on 2/9/15.
 */
public class DatabaseWrapper extends SQLiteOpenHelper {

    private static final String TAG = "DatabaseWrapper";

    private static final String DATABASE_NAME = "MyDatabase.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseWrapper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Called if the database named DATABASE_NAME doesn't exist in order to create it.
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.i(TAG, "Creating database [" + DATABASE_NAME + " v." + DATABASE_VERSION + "]...");
        //TODO: Create the Database
  //      sqLiteDatabase.execSQL(EventORM.SQL_CREATE_TABLE);
        sqLiteDatabase.close();
    }

    /**
     * Called when the DATABASE_VERSION is increased.
     */
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        Log.i(TAG, "Upgrading database ["+DATABASE_NAME+" v." + oldVersion+"] to ["+DATABASE_NAME+" v." + newVersion+"]...");
     ////   sqLiteDatabase.execSQL(EventORM.SQL_DROP_TABLE);
        onCreate(sqLiteDatabase);
    }
}