package ggikko.me.stepperapp.adapter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import ggikko.me.stepperapp.R;
import ggikko.me.stepperapp.fragment.InvestRegistrationFragmentThird;
import ggikko.me.stepperapp.verticalstepper.util.RoundedView;

/**
 * Created by ggikko on 16. 5. 12..
 */
public class ThreeStepParentViewHolder extends ggikko.me.stepperapp.verticalstepper.viewholder.ParentViewHolder {

    @Bind(R.id.roundedView) RoundedView roundedView;
    private TextView textViewLabel;

    private static final boolean HONEYCOMB_AND_ABOVE = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;

    public ThreeStepParentViewHolder(View itemView, InvestRegistrationFragmentThird mFragment) {
        super(itemView);

        ButterKnife.bind(this,itemView);

    }

    @SuppressLint("NewApi")
    @Override
    public void setExpanded(boolean expanded) {
        super.setExpanded(expanded);
        if (!HONEYCOMB_AND_ABOVE) {
            return;
        }
        if (expanded) {

        } else {
            Log.e("ggikko", "how");
            roundedView.setChecked(true);
        }
    }
}
