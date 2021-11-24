package com.effy.controlgenerator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ControlGenerator {
    private final LinearLayout.LayoutParams lp;
    private final Activity activity;

    public ControlGenerator(Activity activity){
        lp = new LinearLayout.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        this.activity = activity;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public Button initButton(String text, float text_size, int image_id){
        Button dynamicButton = new Button(activity.getApplicationContext());
        dynamicButton.setText(text);
        dynamicButton.setTextSize(text_size);
        dynamicButton.setBackground(activity.getDrawable(image_id));
        dynamicButton.setLayoutParams(lp);
        return dynamicButton;
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public TextView initTextView(String text, float text_size, int text_color, int back_color){
        TextView dynamicText = new TextView(activity.getApplicationContext());
        dynamicText.setText(text);
        dynamicText.setTextSize(text_size);
        dynamicText.setBackgroundColor(back_color);
        dynamicText.setTextColor(text_color);
        dynamicText.setLayoutParams(lp);
        return dynamicText;
    }

    public ImageView initImageView(int image_id){
        ImageView dynamicImage = new ImageView(activity.getApplicationContext());
        dynamicImage.setImageResource(image_id);
        dynamicImage.setLayoutParams(lp);
        return dynamicImage;
    }

    public EditText initEditText(String hint, int back_color){
        EditText editText = new EditText(activity.getApplicationContext());
        editText.setHint(hint);
        editText.setBackgroundColor(back_color);
        editText.setLayoutParams(lp);
        return editText;
    }

    public CheckBox initCheckBox(Boolean check){
        CheckBox dynamicBox = new CheckBox(activity.getApplicationContext());
        dynamicBox.setChecked(check);
        dynamicBox.setLayoutParams(lp);
        return dynamicBox;
    }

    public RadioButton initRadioButton(int color,boolean check){
        RadioButton dynamicRadio = new RadioButton(activity.getApplicationContext());
        dynamicRadio.setBackgroundColor(color);
        dynamicRadio.setChecked(check);
        dynamicRadio.setLayoutParams(lp);
        return dynamicRadio;
    }

    public void setFontTextView(Typeface font, TextView view){
        view.setTypeface(font);
    }

    public void setLayoutSize(int height,int width, int[]paddings, View view){
        view.setLayoutParams(new LinearLayout.LayoutParams(width,height));
        view.setPadding(paddings[0],paddings[1],paddings[2],paddings[3]);
    }
}
