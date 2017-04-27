package com.example.android.miwok;

/**
 * Created by Dewo on 4/26/2017.
 * {@Link Word} represents a vocabulary word that user want to learn
 * that contains defaultTranslation and Miwok Translations
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;



    public Word(String inputDefault, String inputMiwok){

        mMiwokTranslation = inputMiwok;
        mDefaultTranslation = inputDefault;

    }



    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }



    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }
}
