package com.arao.ramnel.araoramnellab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i =  new Intent(getApplicationContext(),MyCustomService.class);
        startService(i);
    }

    public void process(View v){
       Intent intent=null, chooser=null;
    if(v.getId()==R.id.btnact1) {
        intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }else if(v.getId()==R.id.btnact2){
            intent = new Intent(getApplicationContext(), TwoActivity.class);
            startActivity(intent);
    }else if(v.getId()==R.id.btnmap1){
            intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:13.145018, 123.757871"));
        chooser = Intent.createChooser(intent,"Launch Maps");
        startActivity(chooser);
    }
    }


}
