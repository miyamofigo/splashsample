package com.example.miyamofigo.splashsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashActivity extends Activity {
   @Override
   protected void onCreate(Bundle savedInstaceState) {
      super.onCreate(savedInstaceState);
      requestWindowFeature(Window.FEATURE_NO_TITLE);
      setContentView(R.layout.splash);
      Handler handler = new Handler();
      handler.postDelayed(new splashHandler(), 2000);
   }

   class splashHandler implements Runnable {
      public void run(){
         Intent intent = new Intent(getApplication(), MainActivity.class);
         startActivity(intent);
         SplashActivity.this.finish();
      }
   }
}