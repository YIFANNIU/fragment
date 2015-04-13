package com.tagit.fragment_demo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ListingActicity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listing_acticity);
		SimpleAdapter adapter = new SimpleAdapter(this, Item.getParts(),R.layout.listing, new String[]{"id","description"}, new int[]{R.id.textViewShowId,R.id.textViewShowDesc});
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		Item s = (Item)getListAdapter().getItem(position);
		Intent intent = new Intent(this,DetailsActivity.class);
		intent.putExtra("item", s);
		startActivity(intent);
		
	}
}
