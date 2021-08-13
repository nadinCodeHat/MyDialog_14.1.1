package lk.dialog.cemstatslibrary.containers.tests;

public interface CEMTestResult {
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    String getDate();

    String getIteration();

    String getReferenceID();

    String getResults();

    Integer getTestTypeID();

    void setDate();
}
