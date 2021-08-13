package com.madme.mobile.sdk;

public interface AdConstants {
    public static final String EXTRA_AD_A_KEY_PACKAGE = "a_key_package";
    public static final String EXTRA_AD_TAGS = "tags";
    public static final String NO_AD_TO_SHOW_ACTION = "com.madme.NO_AD_TO_SHOW";

    public interface Video {
        public static final String EXTRA_PLAYBACK_RESULT = "playback_result";
        public static final String PLAYBACK_ABORTED = "aborted";
        public static final String PLAYBACK_COMPLETED = "completed";
        public static final String PLAYBACK_RESULT_ACTION = "com.madme.VIDEO_PLAYBACK_RESULT";
        public static final String PLAYBACK_SKIPPED = "skipped";
    }
}
