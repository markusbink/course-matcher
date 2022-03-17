package com.example.cm;

import com.google.android.gms.maps.model.LatLng;

public class Constants {
    public static final String KEY_USER_ID = "keyUserId";
    public static final String KEY_MEETUP_ID = "keyMeetupId";
    public static final String KEY_MEETUP_LOCATION_LAT = "keyMeetupLocationLat";
    public static final String KEY_MEETUP_LOCATION_LNG = "keyMeetupLocationLng";
    public static final String KEY_CREATE_MEETUP_VM = "keyCreateMeetupViewModel";
    public static final int MAX_CHAR_COUNT = 125;
    public static final int SPLASH_TIMER = 000;

    public static final String FIREBASE_STORAGE_FOLDER_PROFILE_IMAGES = "profile_images/";
    public static final String FIREBASE_STORAGE_FOLDER_MEETUP_IMAGES = "meetup_images/";
    public static final String FIREBASE_STORAGE_TITLE_PROFILE_IMAGES = "Profile Image";
    public static final String FIREBASE_STORAGE_TITLE_MEETUP_IMAGES = "Meetup Image";
    public static final String PROFILE_IMAGE_EXTENSION = ".jpg";
    public static final int PROFILE_IMAGE_MAX_WIDTH = 800;
    public static final String KEY_IS_OWN_USER = "keyIsOwnUser";
    public static final int MIN_PASSWORD_LENGTH = 6;
    public static final int TRASH_ICON_MARGIN = 15;
    public static final int TRASH_ICON_SIZE = 175;
    public static final int HALVING_FACTOR = 2;
    public static final LatLng DEFAULT_LOCATION = new LatLng(48.992162698, 12.090332972);
    public static final int MARKER_PADDING = 25;
    public static final float DEFAULT_MAP_ZOOM = 12.5f;
    public static final int MARKER_SIZE = 150;
    public static final int MAP_CARD_ANIMATION_DURATION = 250;
    public static final float INITIAL_CARD_ALPHA = 0f;
    public static final float FINAL_CARD_ALPHA = 1f;
    public static final float ON_SNAPPED_MAP_ZOOM = 15.0f;
    public static final int DEFAULT_CARD_OFFSET = 0;
    public static final int MAX_CLUSTER_ITEM_DISTANCE = 15;
    public static final int CURRENT_USER_Z_INDEX = 999;

    // Shared Preferances Keys
    public static final String PREFS_SETTINGS_KEY = "settings";
    public static final String PREFS_SHARE_LOCATION_KEY = "shareLocation";

    //Tabbar
    public static final float PENDING_HEADER_WEIGHT = 0.7f;
    public static final float ADD_HEADER_WEIGHT = 0.5f;


    public enum ImageType {
        PROFILE_IMAGE,
        MEETUP_IMAGE
    }
}