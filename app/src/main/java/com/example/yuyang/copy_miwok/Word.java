package com.example.yuyang.copy_miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;


    private String mDefaultTransiton;
    private String mMiwokTransition;

    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Word(String defaultTransition, String miwokTransition) {
        mDefaultTransiton = defaultTransition;
        mMiwokTransition = miwokTransition;
    }

    public Word(String defaultTransition, String miwokTransition, int imageResourceId) {
        mDefaultTransiton = defaultTransition;
        mMiwokTransition = miwokTransition;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTransiton() {
        return mDefaultTransiton;
    }

    public String getmMiwokTransition() {
        return mMiwokTransition;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
