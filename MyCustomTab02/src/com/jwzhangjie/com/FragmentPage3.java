package com.jwzhangjie.com;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentPage3 extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {	
		Log.e("test", "FragmentPage3");
		return inflater.inflate(R.layout.fragment_3, null);		
	}	
}