package com.madme.mobile.sdk.fragments.survey;

import java.util.Map;

public interface SurveyUiListener {
    void onDismissSurvey();

    void onSetSurveyTitle(CharSequence charSequence);

    void onShowPageNavigationBar(boolean z);

    Map<String, Object> onSupplySurveySubmissionAttributes();

    void onSurveySubmitClicked();

    void onSurveyUserInteraction();
}
