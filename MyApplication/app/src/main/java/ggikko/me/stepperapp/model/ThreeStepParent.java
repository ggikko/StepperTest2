package ggikko.me.stepperapp.model;

import java.util.List;

import ggikko.me.stepperapp.verticalstepper.model.ParentListItem;

/**
 * Created by admin on 16. 5. 13..
 */
public class ThreeStepParent implements ParentListItem {

    private List<ThreeStepChild> mChildeItemList;

    public List<ThreeStepChild> getmChildeItemList() {
        return mChildeItemList;
    }

    public void setmChildeItemList(List<ThreeStepChild> mChildeItemList) {
        this.mChildeItemList = mChildeItemList;
    }

    @Override
    public List<?> getChildItemList() {
        return mChildeItemList;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
