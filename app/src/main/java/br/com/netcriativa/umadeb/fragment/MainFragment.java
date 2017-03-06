package br.com.netcriativa.umadeb.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import br.com.netcriativa.umadeb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener{
    private static final String KEY_TITLE = "title";


    public MainFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String demo) {
        MainFragment f = new MainFragment();

        Bundle args = new Bundle();

        args.putString(KEY_TITLE, demo);
        f.setArguments(args);

        return (f);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        Button btn1 = (Button) v.findViewById(R.id.btn1);
        Button btn2 = (Button) v.findViewById(R.id.btn2);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(getActivity(), "Botão 1 Clicado", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getActivity(), "Botão 2 Clicado", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
