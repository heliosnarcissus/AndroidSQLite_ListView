package noogui.androiddev.com.androidsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
        * CRUD OPERATIONS
        * */
        //Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Helios", "0909123456578"));
        db.addContact(new Contact("Katarina", "0909100000001"));
        db.addContact(new Contact("Garen", "0909343434001"));

        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.get_id() + " ,Name: " + cn.get_name() + " ,Phone: " + cn.get_phoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}
