package com.madme.mobile.sdk.fragments.profile;

public interface ChangeProfileContext {
    boolean displayAccountSettings();

    boolean displayDemographics();

    boolean displayInterests();

    boolean displayLocation();

    LocationType getLocationType();
}
