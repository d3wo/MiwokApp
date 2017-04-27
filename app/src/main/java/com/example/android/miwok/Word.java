package com.example.android.miwok;

/**
 * Created by Dewo on 4/26/2017.
 * {@Link Word} represents a vocabulary word that user want to learn
 * that contains defaultTranslation and Miwok Translations
 */

public class Word {


    private static final int NO_IMAGE_PROVIDED = -1;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Word(String inputDefault, String inputMiwok){

        mMiwokTranslation = inputMiwok;
        mDefaultTranslation = inputDefault;

    }

    public Word(String inputDefault, String inputMiwok, int resourceId){

        mMiwokTranslation = inputMiwok;
        mDefaultTranslation = inputDefault;
        mImageResourceId = resourceId;

    }

    public int getImageResourceId(){
        return mImageResourceId;
    }


    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }



    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }
}
