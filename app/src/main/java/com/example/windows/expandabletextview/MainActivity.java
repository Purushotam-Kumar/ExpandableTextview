package com.example.windows.expandabletextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.borjabravo.readmoretextview.ReadMoreTextView;
import com.ms.square.android.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandableTextView expTv1 = (ExpandableTextView)findViewById(R.id.expandable_text_view_1);
        ExpandableTextView expTv2 = (ExpandableTextView)findViewById(R.id.expandable_text_view_2);
        ReadMoreTextView rmTv = (ReadMoreTextView)findViewById(R.id.readmoreTextview);

        expTv1.setText("This is an Expandable textView. It is using package 'com.ms-square:expandableTextView:0.1.4'. It's parent always must ba a Linear Layout. The View have parent 'com.ms.square.android.expandabletextview.ExpandableTextView' it can have any id. But it have two childs i.e. TextView and an Image Button with a fixed id name as expandable_text and expand_collapse respectively. The Image button is shown as below but in this textView it is set to have 0 height and width");
        expTv2.setText("This is an Expandable textView. It is using package 'com.ms-square:expandableTextView:0.1.4'. It's parent always must ba a Linear Layout. The View have parent 'com.ms.square.android.expandabletextview.ExpandableTextView' it can have any id. But it have two childs i.e. TextView and an Image Button with a fixed id name as expandable_text and expand_collapse respectively. The Image button can have background transparent and gravity of arrow right, default is left");
        rmTv.setText("This is a show more and show less textView. It is using package 'com.borjabravo:readmoretextview:2.0.1'. It is a direct view as 'com.borjabravo.readmoretextview.ReadMoreTextView'");

    }
}
