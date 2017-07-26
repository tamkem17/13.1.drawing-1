package com.example.tam.a131drawing_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by tam on 7/26/2017.
 */

public class RandomShapeView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public RandomShapeView(Context context) {
        super(context);
    }

    public RandomShapeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        DrawShapeView(canvas, 300, 300);

    }

    public void DrawShapeView(Canvas drawBitmap, float viewHieght, float viewWidth){
        Paint  paint = new Paint();
        paint.setColor(Color.RED);
        float left = (getWidth()-viewWidth)/2.0f;
        float top = (getHeight()-viewHieght)/2.0f;
        drawBitmap.drawRect(left,top,left+viewWidth,top+viewHieght, paint);
        drawBitmap.drawLine(left,top,left+viewWidth,top+viewHieght, mPaint);
        drawBitmap.drawLine(left,top+viewHieght,left+viewWidth,top, mPaint);
        drawBitmap.drawLine(left,(top+viewHieght/2),left+viewWidth,(top+viewHieght/2), mPaint);
        drawBitmap.drawLine((left+viewWidth/2),top,(left+viewWidth/2), top+viewHieght, mPaint);
    }

}
