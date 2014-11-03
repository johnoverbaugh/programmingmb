// Read more: http://mrbool.com/how-to-create-a-calculator-app-for-android/28100#ixzz3Hxrq6lvc

import android.app.Activity; 
import android.content.Intent; 
import android.os.Bundle; 

public class Home extends Activity
{ 
	@Override 
	protected void onCreate(Bundle savedInstanceState) 
	{ 
		// TODO Auto-generated method stub 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.home); 
		Thread th = new Thread()
		{ 
			public void run()
			{ 
				try
				{ 
					sleep(1000); 
				} 
				catch(Exception e)
				{ 
					e.printStackTrace(); 
				} 
				finally
				{ 
					onPause(); 
					startActivity(new Intent("com.one.slate.CALC")); 
				} 
			} 
		}; 
		th.start(); 
	} 
	
	@Override 
	public void onPause()
	{ 
		super.onPause(); 
		finish(); 
	} 
}
