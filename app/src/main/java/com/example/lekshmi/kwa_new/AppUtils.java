package com.example.lekshmi.kwa_new;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;

public class AppUtils {

    static void makeCall(Context context) {
        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9539614368;1"));
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.M
                || ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            context.startActivity(i);
        } else {
            Toast.makeText(context, "No permission for Phone", Toast.LENGTH_SHORT).show();
        }
    }
}
