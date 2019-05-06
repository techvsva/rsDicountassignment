package com.assgnment.rs.discount.models;

public class UserRule {

    private int appliedDiscountPer;
    private boolean forGrocery;
    private int associationDuration;

    public int getAppliedDiscountPer() {
        return appliedDiscountPer;
    }

    public void setAppliedDiscountPer(int appliedDiscountPer) {
        this.appliedDiscountPer = appliedDiscountPer;
    }

    public boolean isCalculatePer() {
        return !this.forGrocery;
    }

    public boolean isForGrocery() {
        return forGrocery;
    }

    public void setForGrocery(boolean forGrocery) {
        this.forGrocery = forGrocery;
    }

    public int getAssociationDuration() {
        return associationDuration;
    }

    public void setAssociationDuration(int associationDuration) {
        this.associationDuration = associationDuration;
    }
}
