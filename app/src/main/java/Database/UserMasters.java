package Database;

import android.provider.BaseColumns;

public final class UserMasters {

    //constructor
    private UserMasters(){}

    //methods
    protected static class Users implements BaseColumns{

        //user table
        public static final String TABLE_NAME = "User";
        public static final String COL_1 = "ID";
        public static final String COL_2 = "NAME";
        public static final String COL_3 = "PASSWORD";
        public static final String COL_4 = "TYPE";

        //message table
        public static final String T_NAME = "Message";
        public static final String C1 = "ID";
        public static final String C2 = "NAME";
        public static final String C3 = "SUBJECT";
        public static final String C4 = "MESSAGE";

    }

}
