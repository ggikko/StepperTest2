package ggikko.me.stepperapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ggikko.me.stepperapp.R;
import ggikko.me.stepperapp.adapter.ExpandableAdapter;
import ggikko.me.stepperapp.model.ThreeStepChild;
import ggikko.me.stepperapp.model.ThreeStepParent;
import ggikko.me.stepperapp.verticalstepper.adapter.ExpandableRecyclerAdapter;
import ggikko.me.stepperapp.verticalstepper.model.ParentListItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvestRegistrationFragmentThird extends Fragment {

    private int currentStep = 1;

    public InvestRegistrationFragmentThird() {
    }

    /**
     * bind view
     */
    //TODO : Butterknif 7 -> 8
    @Bind(R.id.three_step_recycler_view) RecyclerView three_step_recycler_view;

    /**
     * expandable adapter
     */
    private ExpandableRecyclerAdapter expandableRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_invest_registration_fragment_third, container, false);
        ButterKnife.bind(this, view);

        /** RecyclerView setting */
        three_step_recycler_view.setLayoutManager(new LinearLayoutManager(getActivity()));
        three_step_recycler_view.setItemViewCacheSize(8);
        three_step_recycler_view.setHasFixedSize(true);
        expandableRecyclerAdapter = new ExpandableAdapter(getActivity(), generateData(), this);

        three_step_recycler_view.setAdapter(expandableRecyclerAdapter);

        /** All step open */
        expandableRecyclerAdapter.expandParent(0);

        return view;
    }

    /**
     * Parent 및 Child fake data 생성
     */
    private List<ParentListItem> generateData() {

        List<ParentListItem> listItems = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            ThreeStepParent parent = new ThreeStepParent();
            ThreeStepChild child = new ThreeStepChild();
            List<ThreeStepChild> childList = new ArrayList<>();
            childList.add(child);
            parent.setmChildeItemList(childList);
            listItems.add(parent);
        }

        return listItems;
    }

    /**
     * Managing next expanded
     */
    public void next() {
        callNextStep();
    }

    /**
     * collapse previous step & expand next step
     */
    private void callNextStep() {
        expandableRecyclerAdapter.collapseParent(currentStep - 1);
        expandableRecyclerAdapter.expandParent(currentStep);
        currentStep++;
    }
}
