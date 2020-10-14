package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defalutTranslation,String miwoktranslation)
    {
        mDefaultTranslation=defalutTranslation;
        mMiwokTranslation=miwoktranslation;
    }
    public String getmDefaultTranslationName() {
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
