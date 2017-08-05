package com.adminomkar.kanadaapp;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by Admin on 26-Jan-17.
 */

public class Word {
    private  String mEnglishtrans;
    private String mKannadtrans;
    private static final int Image_available=-1;
    private int mImg=Image_available;


    public Word(String kannadatrans,String englishtrans)
    {mEnglishtrans=englishtrans;
        mKannadtrans=kannadatrans;

    }

  public Word(String kannadatrans,String englishtrans,int img)
  {mEnglishtrans=englishtrans;
      mKannadtrans=kannadatrans;
      mImg=img;

  }


    public String  getEnglishTrans()
    {
      return mEnglishtrans;


    }
    public String getKannadTrans()
    {
        return mKannadtrans;
    }
    public int getImage()
    {
        return mImg;
    }

    public boolean hasImage()
    {

        return Image_available!=mImg ;
    }























}
