package com.haige.mtest.path;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/2/22 0022.
 */

public class PathView extends View {

    public PathView(Context context) {
        super(context);
    }

    public PathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PathView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);       // 抗锯齿
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);     // 设置空心
        paint.setStrokeWidth(3);
        canvas.drawCircle(40,40,30,paint);      // 画个圆。
        canvas.drawRect(10,90,70,150,paint);    // 画个正方形。
        canvas.drawOval(new RectF(10,220,70,250),paint);
        // path
        Path path = new Path();
        path.moveTo(10,330);
        path.lineTo(70,330);
        path.lineTo(40,270);
        path.close();
        canvas.drawPath(path,paint);
        // 梯形
        Path path1 = new Path();
        path1.moveTo(10,410);
        path1.lineTo(70,410);
        path1.lineTo(55,350);
        path1.lineTo(25,350);
        path1.close();
        canvas.drawPath(path1,paint);
        // 渐变色
        Shader mShader = new LinearGradient(0,0,100,100,
                new int[]{Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW},null, Shader.TileMode.REPEAT);
    }
}
