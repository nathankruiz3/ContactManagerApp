package com.nathankruiz3.contactmanagerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        Log.d("DB count: ", String.valueOf(db.getContactsCount()));

        // Insert contacts

//        Log.d("Insert: ", "Inserting...");
//        db.addContact(new Contact("Paul", "6132379188"));
//        db.addContact(new Contact("Jeff", "1827364527"));
//        db.addContact(new Contact("Alex", "9173645278"));
//        db.addContact(new Contact("Chris", "9875566534"));

        // Read the contacts back

        Log.d("Reading: ", "Reading all contacts...");
        List<Contact> contactList = db.getAllContacts();

        // Get one contact
//        Contact oneContact = db.getContact(1);
//        oneContact.setName("Paulooooo");
//        oneContact.setPhoneNumber("0000000000");

        // Update a contact
//        int newContact = db.updateContact(oneContact);

//        Log.d("One Contact: ", "Updated Row: " + String.valueOf(newContact) + " Name: " +
//                oneContact.getName() + " Phone: " + oneContact.getPhoneNumber());

//        db.deleteContact(oneContact);
        for (Contact c : contactList) {
            String log = "ID: " + c.getId() + " , Name: " + c.getName() +
                    " , Phone Number: " + c.getPhoneNumber();

            Log.d("Name: " , log);
        }
    }
}