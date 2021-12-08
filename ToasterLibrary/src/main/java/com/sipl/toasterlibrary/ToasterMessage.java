package com.sipl.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context ctx, String message){
        Toast.makeText(ctx,message,Toast.LENGTH_SHORT).show();
    }
}
