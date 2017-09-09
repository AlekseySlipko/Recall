package bel.aleksey.recall.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bel.aleksey.recall.R;

public class BirthdayFragment extends AbstractTabFragment{
    public static final int LAYOUT = R.layout.fragment_example;

    public static BirthdayFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdayFragment birthdayFragment = new BirthdayFragment();
        birthdayFragment.setArguments(args);
        birthdayFragment.setContext(context);
        birthdayFragment.setTitle(context.getString(R.string.tab_item_birthdays));
        return birthdayFragment;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}
