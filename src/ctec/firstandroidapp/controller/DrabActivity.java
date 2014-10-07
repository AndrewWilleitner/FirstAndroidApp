package ctec.firstandroidapp.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * 
 * @author awil6680
 *Parents go after extends.
 */
public class DrabActivity extends Activity
{
	//oncreate works as a constructor
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		//Super calls parent method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drab);
	}
}
