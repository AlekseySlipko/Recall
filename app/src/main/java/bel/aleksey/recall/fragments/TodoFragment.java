package bel.aleksey.recall.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class TodoFragment extends AbstractTabFragment {
    public static final int LAYOUT = bel.aleksey.recall.R.layout.fragment_example;

    public static TodoFragment getInstance(Context context) {
        Bundle args = new Bundle();
        TodoFragment todoFragment = new TodoFragment();
        todoFragment.setArguments(args);
        todoFragment.setContext(context);
        todoFragment.setTitle(context.getString(bel.aleksey.recall.R.string.tab_item_todo));
        return todoFragment;
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
