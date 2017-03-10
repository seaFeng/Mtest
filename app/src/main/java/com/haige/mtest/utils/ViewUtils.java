package com.haige.mtest.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/**
 *  状态栏变色的工具类。
 */

public class ViewUtils {
    /**
     *  状态栏变色方法。(5.x)
     * @param activity
     * @param colorResId
     */
    public static void setWindowStatusBarColor(Activity activity,int colorResId){
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                Window window = activity.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(activity.getResources().getColor(colorResId));
                window.setNavigationBarColor(activity.getResources().getColor(colorResId));
            }
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     *  状态栏变色工具(6.x)
     */
    
}
