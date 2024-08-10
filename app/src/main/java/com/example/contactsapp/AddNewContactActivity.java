package com.example.contactsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.contactsapp.databinding.ActivityAddNewContactBinding;
import com.example.contactsapp.databinding.ActivityMainBinding;

public class AddNewContactActivity extends AppCompatActivity {

    private ActivityAddNewContactBinding binding;
    private AddNewContactClickHandler handler;
    private Contacts contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_new_contact);

        contacts = new Contacts();

        binding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_add_new_contact
        );

        MyViewModel myViewModel = new ViewModelProvider(this)
                .get(MyViewModel.class);

        handler = new AddNewContactClickHandler(
                contacts,
                this,
                myViewModel
        );

        binding.setContact(contacts);
        binding.setClickHandler(handler);
    }
}