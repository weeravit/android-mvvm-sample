package com.weeravit.androidmvvm;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weeravit.androidmvvm.databinding.FragmentSampleBinding;

/**
 * Created by appsolute4 on 9/10/2016 AD.
 */
public class SampleFragment extends Fragment {

    FragmentSampleBinding binding;

    public static SampleFragment newInstance() {
        SampleFragment fragment = new SampleFragment();
        Bundle bundle = new Bundle();
        // TODO: 9/10/2016 AD - implement add arguments into bundle, up to you
        // ...
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sample, container, false);
        initInstances();
        return binding.getRoot();
    }

    private void initInstances() {

    }

}
