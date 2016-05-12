package ggikko.me.stepperapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import ggikko.me.stepperapp.fragment.InvestRegistrationFragmentThird;
import ggikko.me.stepperapp.verticalstepper.adapter.ExpandableRecyclerAdapter;
import ggikko.me.stepperapp.verticalstepper.model.ParentListItem;

/**
 * Created by admin on 16. 5. 12..
 */
public class ExpandableAdapter extends ExpandableRecyclerAdapter<ThreeStepParentViewHolder,ThreeStepChildViewHolder> {

    private Context mContext;
    private LayoutInflater mInflater;
    private InvestRegistrationFragmentThird mFragment;

    public ExpandableAdapter(Context context, List<ParentListItem> itemList, InvestRegistrationFragmentThird fragment) {
        super(itemList);
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mFragment = fragment;
    }

    public ExpandableAdapter(@NonNull List<? extends ParentListItem> parentItemList) {
        super(parentItemList);
    }

    @Override
    public ThreeStepParentViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        return null;
    }

    @Override
    public ThreeStepChildViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        return null;
    }

    @Override
    public void onBindParentViewHolder(ThreeStepParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {

    }

    @Override
    public void onBindChildViewHolder(ThreeStepChildViewHolder childViewHolder, int position, Object childListItem) {

    }
}