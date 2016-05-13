package ggikko.me.stepperapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ggikko.me.stepperapp.R;
import ggikko.me.stepperapp.fragment.InvestRegistrationFragmentThird;
import ggikko.me.stepperapp.verticalstepper.adapter.ExpandableRecyclerAdapter;
import ggikko.me.stepperapp.verticalstepper.model.ParentListItem;

/**
 * Created by ggikko on 16. 5. 12..
 */
public class ExpandableAdapter extends ExpandableRecyclerAdapter<ThreeStepParentViewHolder,ThreeStepChildViewHolder> {

    private Context mContext;
    private LayoutInflater mInflater;
    private InvestRegistrationFragmentThird mFragment;
    private int STEP_NUMBER = 0;

    public ExpandableAdapter(Context context, List<ParentListItem> itemList, InvestRegistrationFragmentThird fragment) {
        super(itemList);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mFragment = fragment;
    }

    @Override
    public ThreeStepParentViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View view = mInflater.inflate(R.layout.vertical_stepper_parent,parentViewGroup, false);
        return new ThreeStepParentViewHolder(view, mFragment);
    }

    @Override
    public ThreeStepChildViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View view = mInflater.inflate(R.layout.vertical_stepper_child,childViewGroup, false);
        return new ThreeStepChildViewHolder(view, mFragment);
    }

    @Override
    public void onBindParentViewHolder(ThreeStepParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        parentViewHolder.roundedView.setText(++STEP_NUMBER + "");
    }

    @Override
    public void onBindChildViewHolder(ThreeStepChildViewHolder childViewHolder, int position, Object childListItem) {

    }
}
