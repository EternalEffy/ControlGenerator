package com.effy.controlgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ControlGenerator generator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generator = new ControlGenerator(this);
        Button dynamicButton = generator.initButton("text",16f,R.drawable.cake);
        dynamicButton.setOnClickListener(v -> Toast.makeText(getApplicationContext(),"Dont touch me",Toast.LENGTH_SHORT).show());

        TextView dynamicText = generator.initTextView("text",24f,0xff3D73AF,0xff000000);
        generator.setFontTextView(Typeface.MONOSPACE,dynamicText);

        int[] paddings = new int[]{5,5,5,5};
        ImageView dynamicImage = generator.initImageView(R.drawable.donut);
        generator.setLayoutSize(500,500,paddings,dynamicImage);

        EditText dynamicEdit = generator.initEditText("hint",0xff3D73AF);
        generator.setLayoutSize(LinearLayout.LayoutParams.WRAP_CONTENT,200,paddings,dynamicEdit);

        CheckBox dynamicBox = generator.initCheckBox(true);

        RadioButton dynamicRadio = generator.initRadioButton(0xff3D73AF,true);

        LinearLayout ll = (LinearLayout)findViewById(R.id.dynamic);
        ll.addView(dynamicButton);
        ll.addView(dynamicText);
        ll.addView(dynamicImage);
        ll.addView(dynamicEdit);
        ll.addView(dynamicBox);
        ll.addView(dynamicRadio);
    }
}