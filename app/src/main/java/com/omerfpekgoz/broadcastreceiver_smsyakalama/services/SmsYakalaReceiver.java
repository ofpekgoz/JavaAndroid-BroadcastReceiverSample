package com.omerfpekgoz.broadcastreceiver_smsyakalama.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsYakalaReceiver extends BroadcastReceiver {

    SmsManager smsManager=SmsManager.getDefault();  //Varsayılan sms manager tanımladık
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle=intent.getExtras();   //Gelen bütün mesajları Bundle ile aldık

        //Gelen mesajlar pdus tipinde olacak bunları Object array e çevirip dizi şekilinde aldık
        Object[] pdusObj=(Object[]) bundle.get("pdus");
        for (int i=0;i<pdusObj.length;i++){
            SmsMessage guncelMesaj=SmsMessage.createFromPdu((byte[])pdusObj[i]); //array içinde gezinip byte array e çevirip smsmesage olarak alıdk

            String telNo=guncelMesaj.getDisplayOriginatingAddress(); //Mesaj gönderen adresi aldık
            String mesaj=guncelMesaj.getDisplayMessageBody();   //Mesajı aldık

            Toast.makeText(context,"Tel No: "+telNo+" "+"Mesaj: "+mesaj,Toast.LENGTH_SHORT).show();

        }

    }
}
