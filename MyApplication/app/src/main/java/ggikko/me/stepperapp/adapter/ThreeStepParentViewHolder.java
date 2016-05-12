package ggikko.me.stepperapp.adapter;

import android.view.View;
import android.widget.TextView;

import ggikko.me.stepperapp.R;
import ggikko.me.stepperapp.verticalstepper.util.RoundedView;

/**
 * Created by admin on 16. 5. 12..
 */
public class ThreeStepParentViewHolder extends ggikko.me.stepperapp.verticalstepper.viewholder.ParentViewHolder {

    public RoundedView roundedView;
    public TextView textViewLabel;

    public ThreeStepParentViewHolder(View itemView) {
        super(itemView);
//        roundedView = (RoundedView) itemView.findViewById(R.id.roundedView);
//        textViewLabel = (TextView) itemView.findViewById(R.id.textViewLabel);
    }
}
