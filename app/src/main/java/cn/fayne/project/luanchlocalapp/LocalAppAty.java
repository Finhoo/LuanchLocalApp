package cn.fayne.project.luanchlocalapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LocalAppAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_app_aty);

        Uri uri = getIntent().getData();
        Log.d("data", uri.getHost());
    }
}
