package br.com.netcriativa.umadeb.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.netcriativa.umadeb.R;
import br.com.netcriativa.umadeb.adapter.MoviesAdapter;
import br.com.netcriativa.umadeb.helper.DividerItemDecoration;
import br.com.netcriativa.umadeb.model.Movie;


/**
 * A simple {@link Fragment} subclass.
 */
public class AgendaGeralFragment extends Fragment {
    private static final String KEY_TITLE = "title";

    //RecyclerView
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;


    public AgendaGeralFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String demo) {
        AgendaGeralFragment f = new AgendaGeralFragment();

        Bundle args = new Bundle();

        args.putString(KEY_TITLE, demo);
        f.setArguments(args);

        return (f);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_agenda_geral, container, false);

        return v;
    }

}
