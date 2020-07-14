package com.omerfpekgoz.broadcastreceiver_smsyakalama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//Manifest e bunu ekledik
//<receiver
//            android:name=".services.SmsYakalaReceiver">
//            <intent-filter>
//                    <action android:name="android.provider.Telephony.SMS_RECEIVED"></action>
//
//            </intent-filter>
//        </receiver>


//İzin alamamız gerekir.Sms yakalama okuma izinleri aldık
//  <uses-permission android:name="android.permission.RECEIVE_SMS"/>
//    <uses-permission android:name="android.permission.READ_SMS"/>
//    <uses-permission android:name="android.permission.SEND_SMS"/>
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
