package com.kasroudra.messengerdesktop;
import android.app.*;
import android.os.*;
import android.content.*;

public class splash extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Handler handler= new Handler();
		handler.postDelayed(new Runnable(){
				@Override
				public void run()
				{

					Intent i=new Intent(splash.this, MainActivity.class);
					startActivity(i);
					finish();
				}
			}, 1500);
	}


}
