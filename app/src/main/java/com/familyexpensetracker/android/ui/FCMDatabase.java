package com.familyexpensetracker.android.ui;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * @author Anju
 */
public class FCMDatabase {

    private static final FCMDatabase fcmDatabase = new FCMDatabase();

    private DatabaseReference database = null;

    private FirebaseUser user = null;

    private FCMDatabase() {

    }

    public static synchronized FCMDatabase getInstance() {
        return fcmDatabase;
    }

    public synchronized DatabaseReference getDatabaseReference() {
        if (database == null) {
            database = FirebaseDatabase.getInstance().getReference();
        }
        return database;
    }

    public FirebaseUser getUser() {
        return user;
    }

    public void setUser(FirebaseUser user) {
        this.user = user;
    }
}
