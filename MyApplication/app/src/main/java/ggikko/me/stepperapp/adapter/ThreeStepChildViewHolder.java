package ggikko.me.stepperapp.adapter;

import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ggikko.me.stepperapp.R;
import ggikko.me.stepperapp.fragment.InvestRegistrationFragmentThird;

/**
 * Created by admin on 16. 5. 12..
 */
public class ThreeStepChildViewHolder extends ggikko.me.stepperapp.verticalstepper.viewholder.ChildViewHolder {

    InvestRegistrationFragmentThird mFragment;

    @Bind(R.id.buttonContinue) Button buttonContinue;

    @OnClick(R.id.buttonContinue)
    void callNext(){
        mFragment.next();
    }

    public ThreeStepChildViewHolder(View itemView, InvestRegistrationFragmentThird fragment) {
        super(itemView);

        ButterKnife.bind(this, itemView);

        this.mFragment = fragment;


    }
}
