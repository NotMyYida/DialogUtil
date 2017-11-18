package com.hss01248.dialog.config;

import android.content.Context;
import android.support.annotation.ColorRes;

import com.hss01248.dialog.R;

/**
 * Created by Administrator on 2016/10/9.
 */
public class DefaultConfig {

    public static  @ColorRes int iosBtnColor = R.color.dialogutil_ios_btntext_blue;



    public  static @ColorRes int lvItemTxtColor = R.color.dialogutil_text_item_33;

    public static  @ColorRes int mdBtnColor = R.color.dialogutil_ios_btntext_blue;

    public static @ColorRes int titleTxtColor = R.color.dialogutil_text_title_11;
    public static @ColorRes int msgTxtColor = R.color.dialogutil_text_title_11;
    public static @ColorRes int inputTxtColor = R.color.dialogutil_text_input_44;


/* <dimen name="btn_txt_size">14sp</dimen>
    <dimen name="title_txt_size">17sp</dimen>
    <dimen name="msg_txt_size">14sp</dimen>
    <dimen name="item_txt_size">14sp</dimen>*/
    public static int btnTxtSize = 14;// in sp
    public static int titleTxtSize = 17;
    public static int msgTxtSize = 14;
    public static int itemTxtSize = 14;
    public static int inputTxtSize = 14;


    public static CharSequence btnTxt1 ;
    public static CharSequence btnTxt2 ;

    public static CharSequence bottomTxt ;
    public static CharSequence loadingTxt ;
    public static CharSequence uploadingTxt ;
    public static CharSequence downloadingTxt ;

    public static final int TYPE_MD_LOADING = 1;
    public static final int TYPE_MD_ALERT = 2;
    public static final int TYPE_MD_SINGLE_CHOOSE = 3;
    public static final int TYPE_MD_MULTI_CHOOSE = 4;



    public static final int TYPE_IOS_HORIZONTAL = 5;
    public static final int TYPE_IOS_VERTICAL = 6;
    public static final int TYPE_IOS_BOTTOM = 7;
    public static final int TYPE_IOS_CENTER_LIST = 8;
    public static final int TYPE_IOS_INPUT = 9;

    public static final int TYPE_CUSTOM_VIEW =10;

    public static final int TYPE_BOTTOM_SHEET_CUSTOM =11;

    public static final int TYPE_BOTTOM_SHEET_LIST =12;

    public static final int TYPE_BOTTOM_SHEET_GRID =13;

    public static final int TYPE_IOS_LOADING = 14;

    public static final int TYPE_PROGRESS = 15;

    public static final int TYPE_MD_INPUT = 16;

    public static void initBtnTxt(Context context){
        btnTxt1 = context.getResources().getString(R.string.dialogutil_btn_sure);
        btnTxt2 = context.getResources().getString(R.string.dialogutil_btn_cancel);
        bottomTxt = context.getResources().getString(R.string.dialogutil_btn_cancel);
        loadingTxt = context.getResources().getString(R.string.dialogutil_loading);
        uploadingTxt = context.getResources().getString(R.string.dialogutil_uploading);
        downloadingTxt = context.getResources().getString(R.string.dialogutil_downloading);
    }





}
