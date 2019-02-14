package com.example.jalalhassane.pushnotifications;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by jalal.hassane on 2/14/2019.
 */

public class MainActivity extends AppCompatActivity{
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(FirebaseInstanceId.getInstance().getToken());
        PrefUtils.setBoolean(this,"isOpen",true);

    }

    @Override
    protected void onDestroy() {
        PrefUtils.setBoolean(this,"isOpen",false);
        super.onDestroy();
    }

}
