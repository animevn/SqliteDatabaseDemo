package com.haanhgs.sqlitedatabasedemo.ui.result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.haanhgs.sqlitedatabasedemo.R;

public class ResultFragment extends Fragment {

    private ResultViewModel resultViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        resultViewModel =
                ViewModelProviders.of(this).get(ResultViewModel.class);
        View root = inflater.inflate(R.layout.fragment_result, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        resultViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}