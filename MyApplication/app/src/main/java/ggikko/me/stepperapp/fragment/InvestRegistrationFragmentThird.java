package ggikko.me.stepperapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ggikko.me.stepperapp.R;
import ggikko.me.stepperapp.adapter.ExpandableAdapter;
import ggikko.me.stepperapp.verticalstepper.adapter.ExpandableRecyclerAdapter;
import ggikko.me.stepperapp.verticalstepper.model.ParentListItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvestRegistrationFragmentThird extends Fragment {

    public InvestRegistrationFragmentThird() {}

    @Bind(R.id.three_step_recycler_view) RecyclerView three_step_recycler_view;

    private ExpandableRecyclerAdapter expandableRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_invest_registration_fragment_third, container, false);
        three_step_recycler_view.setLayoutManager(new LinearLayoutManager(getActivity()));

        three_step_recycler_view.setItemViewCacheSize(8);
        three_step_recycler_view.setHasFixedSize(true);

        expandableRecyclerAdapter = new ExpandableAdapter(getActivity(), generateData(), this);


        ButterKnife.bind(this,view);
        return view;
    }

    // 여기까지 함
    private List<ParentListItem> generateData() {
        return null;
    }

}
