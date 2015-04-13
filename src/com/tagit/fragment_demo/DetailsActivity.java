package com.tagit.fragment_demo;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.details);
		
		Bundle b = getIntent().getExtras();
		HashMap<String, String> item = (HashMap<String, String>)b.get("item");
		TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText(item.get("id"));
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText(item.get("description"));
        TextView t6 = (TextView) findViewById(R.id.textView6);
        t6.setText(item.get("cost"));
	}

	
}
