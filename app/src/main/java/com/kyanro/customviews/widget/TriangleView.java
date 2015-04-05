package com.kyanro.customviews.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * custom view の勉強用
 */
public class TriangleView extends View {

    private static final int DEFAULT_STROKE_WIDTH = 2;

    private int mStrokeWidth;

    private float mDensity;

    public TriangleView(Context context) {
        this(context, null);
    }

    public TriangleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TriangleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mDensity = context.getResources().getDisplayMetrics().density;
        mStrokeWidth = (int) (DEFAULT_STROKE_WIDTH * mDensity);


    }
}
