package bel.aleksey.recall.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bel.aleksey.recall.R;

public class HistoryFragment extends AbstractTabFragment {
    public static final int LAYOUT = R.layout.fragment_example;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment historyFragment = new HistoryFragment();
        historyFragment.setArguments(args);
        historyFragment.setContext(context);
        historyFragment.setTitle(context.getString(R.string.tab_item_history));
        return historyFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
