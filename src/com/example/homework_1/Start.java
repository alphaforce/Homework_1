package com.example.homework_1;

import android.content.BroadcastReceiver;  
import android.content.Context;  
import android.content.Intent;  

public class Start extends BroadcastReceiver {  
    //��дonReceive����  
    @Override  
    public void onReceive(Context context, Intent intent) {  
        //��ߵ�XXX.class����Ҫ�����ķ���  
        Intent intent1 = new Intent();
        intent1.setClass(context, MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);  
         
       //����Ӧ�ã�����Ϊ��Ҫ�Զ�������Ӧ�õİ���
//        Intent intent2 = context.getPackageManager().getLaunchIntentForPackage("com.example.homework_1");
//        context.startActivity(intent2 );        
    }
}
