package com.tagit.fragment_demo;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;


@SuppressLint("NewApi")
public class ListingFragment extends ListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.activity_listing_acticity, container,false);
		SimpleAdapter adapter = new SimpleAdapter(getActivity(),Item.getParts(),R.layout.listing,new String[]{"id","description"},new int[]{R.id.textViewShowId,R.id.textViewShowDesc});
		setListAdapter(adapter);
		return v;
	}	
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Item a = (Item)getListAdapter().getItem(position);
		display(a);
	
	}
	
	void display(Item a)
	{
		final String TAG = "DETAILS";
		FragmentManager fm = getFragmentManager();
		FragmentTransaction trans = fm.beginTransaction();
		
		Fragment f = new DetailsFragment();
		Bundle b = new Bundle();
		b.putSerializable("item", a);
		f.setArguments(b);
		if(fm.findFragmentByTag(TAG) == null)
		{
			trans.add(R.id.detailsframe, f,TAG);
		}else{
			trans.replace(R.id.detailsframe, f,TAG);
			
		}
		trans.commit();
		
	}
}
