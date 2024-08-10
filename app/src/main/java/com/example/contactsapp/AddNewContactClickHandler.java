package com.example.contactsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class AddNewContactClickHandler {
    Contacts contact;
    Context context;

    public AddNewContactClickHandler(Contacts contact, Context context) {
        this.contact = contact;
        this.context = context;
    }

    public void onSubmitBtnClicked(View view){
        if(contact.getName() == null || contact.getEmail() == null){
            Toast.makeText(context, "Fields Cannot be empty", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i = new Intent(context, MainActivity.class);
            i.putExtra("Name",contact.getName());
            i.putExtra("Name",contact.getEmail());
            context.startActivity(i);
        }
    }
}
