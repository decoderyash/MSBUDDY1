package com.example.anew.msbuddy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by New on 23/09/2017.
 */
public class applicationtimeline_fragment extends Fragment {
    @Nullable
   // @Override
    View myview;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       myview = inflater.inflate(R.layout.applicationtimeline, container ,false);
        return myview;
    }
}
