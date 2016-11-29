package com.bwie.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 1.
 * 2.梁萌萌
 * 3.2016/11/29
 */
public class FirstFragment extends Fragment {
    private static final String LOG_TAG = "FirstFragment";
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    public FirstFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.w(LOG_TAG, "onAttach...");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(LOG_TAG, "onCreate...");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.w(LOG_TAG, "onCreateView...");
        return inflater.inflate(R.layout.fm_item, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.w(LOG_TAG, "onActivityCreated...");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(LOG_TAG, "onStart...");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.w(LOG_TAG, "onResume...");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w(LOG_TAG, "onPause...");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(LOG_TAG, "onStop...");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w(LOG_TAG, "onDestroyView...");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(LOG_TAG, "onDestroy...");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.w(LOG_TAG, "onDetach...");
    }
}
