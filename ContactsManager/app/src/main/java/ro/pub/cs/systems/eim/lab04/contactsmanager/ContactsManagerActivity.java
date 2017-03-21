package ro.pub.cs.systems.eim.lab04.contactsmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Button;
import android.provider.ContactsContract;
import android.widget.Toast;
import android.app.Activity;
//import android.intent.Intent;

public class ContactsManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_manager);

        Button show_hide = (Button)findViewById(R.id.button3);
        Button save = (Button)findViewById(R.id.button);
        Button cancel = (Button)findViewById(R.id.button2);

        Intent intent = getIntent();
        if (intent != null) {
            String phone = intent.getStringExtra("ro.pub.cs.systems.eim.lab04.contactsmanager.PHONE_NUMBER_KEY");
            if (phone != null) {
                ((EditText)findViewById(R.id.editText2)).setText(phone);
            } else {
                Toast.makeText(this, "eroare", Toast.LENGTH_LONG).show();
            }
        }


        show_hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Button button  = (Button)view;
                LinearLayout ll = (LinearLayout)findViewById(R.id.activity_contacts_manager_3);

                String name = button.getText().toString();
                if (name == "Show details") {
                    button.setText("Hide details");
                    ll.setVisibility(View.VISIBLE);
                }
                else {
                    button.setText("Show details");
                    ll.setVisibility(View.INVISIBLE);
                }


            }

        });

        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                setResult(Activity.RESULT_CANCELED, new Intent());
                finish();

            }

        });

        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Button button  = (Button)view;

                String name = ((EditText)findViewById(R.id.editText)).getText().toString();
                String phone = ((EditText)findViewById(R.id.editText2)).getText().toString();
                String email = ((EditText)findViewById(R.id.editText3)).getText().toString();
                String address = ((EditText)findViewById(R.id.editText4)).getText().toString();
                String jobTitle = ((EditText)findViewById(R.id.editText5)).getText().toString();
                String company = ((EditText)findViewById(R.id.editText6)).getText().toString();

                Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
                intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                if (name != null) {
                    intent.putExtra(ContactsContract.Intents.Insert.NAME, name);
                }
                if (phone != null) {
                    intent.putExtra(ContactsContract.Intents.Insert.PHONE, phone);
                }
                if (email != null) {
                    intent.putExtra(ContactsContract.Intents.Insert.EMAIL, email);
                }
                if (address != null) {
                    intent.putExtra(ContactsContract.Intents.Insert.POSTAL, address);
                }
                if (jobTitle != null) {
                    intent.putExtra(ContactsContract.Intents.Insert.JOB_TITLE, jobTitle);
                }
                if (company != null) {
                    intent.putExtra(ContactsContract.Intents.Insert.COMPANY, company);
                }
                /*
                ArrayList<ContentValues> contactData = new ArrayList<ContentValues>();
                if (website != null) {
                    ContentValues websiteRow = new ContentValues();
                    websiteRow.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Website.CONTENT_ITEM_TYPE);
                    websiteRow.put(ContactsContract.CommonDataKinds.Website.URL, website);
                    contactData.add(websiteRow);
                }
                if (im != null) {
                    ContentValues imRow = new ContentValues();
                    imRow.put(ContactsContract.Data.MIMETYPE, ContactsContract.CommonDataKinds.Im.CONTENT_ITEM_TYPE);
                    imRow.put(ContactsContract.CommonDataKinds.Im.DATA, im);
                    contactData.add(imRow);
                }
                intent.putParcelableArrayListExtra(ContactsContract.Intents.Insert.DATA, contactData);
                */
                //startActivity(intent);
                startActivityForResult(intent, 21);
            }

        });

    }
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        switch(requestCode) {
            case 21:
                setResult(resultCode, new Intent());
                finish();
                break;
        }
    }
}
