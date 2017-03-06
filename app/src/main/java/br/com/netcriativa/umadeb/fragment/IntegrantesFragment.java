package br.com.netcriativa.umadeb.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.netcriativa.umadeb.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class IntegrantesFragment extends Fragment {
    private static final String KEY_TITLE = "title";


    public IntegrantesFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String demo) {
        IntegrantesFragment f = new IntegrantesFragment();

        Bundle args = new Bundle();

        args.putString(KEY_TITLE, demo);
        f.setArguments(args);

        return (f);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_integrantes, container, false);
    }

}
