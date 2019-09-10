package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    //declarations
    public static final String DATABASE_NAME = "CourseApp.db";

    public DatabaseHelper(Context context,String name,SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //create table
        String CREATE_USER_TABLE_QUERY = "CREATE TABLE " + UserMasters.Users.TABLE_NAME + " ( " +
                UserMasters.Users.COL_1 + " INTEGER PRIMARY KEY ," +
                UserMasters.Users.COL_2 + " VARCHAR(20) ," +
                UserMasters.Users.COL_3 + " VARCHAR(20) ," +
                UserMasters.Users.COL_4 + " VARCHAR(10) )" ;

        String CREATE_MESSAGE_TABLE_QUERY = "CREATE TABLE " + UserMasters.Users.T_NAME + "( " +
                UserMasters.Users.C1 + "INTEGER PRIMARY KEY ," +
                UserMasters.Users.C2 + " VARCHAR(50), " +
                UserMasters.Users.C3 + " VARCHAR(10), " +
                UserMasters.Users.C4 + " VARCHAR(100) )";

        db.execSQL(CREATE_USER_TABLE_QUERY);
        db.execSQL(CREATE_MESSAGE_TABLE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
