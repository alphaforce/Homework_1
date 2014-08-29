package com.example.homework_1;

import android.content.BroadcastReceiver;  
import android.content.Context;  
import android.content.Intent;  

public class Start extends BroadcastReceiver {  
    //重写onReceive方法  
    @Override  
    public void onReceive(Context context, Intent intent) {  
        //后边的XXX.class就是要启动的服务  
        Intent intent1 = new Intent();
        intent1.setClass(context, MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);  
         
       //启动应用，参数为需要自动启动的应用的包名
//        Intent intent2 = context.getPackageManager().getLaunchIntentForPackage("com.example.homework_1");
//        context.startActivity(intent2 );        
    }
}
