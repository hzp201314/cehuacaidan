package com.hzp.cehuacaidan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.hzp.cehuacaidan.view.MySlidingMenu;

public class MainActivity extends Activity {
    private ImageView mBack;
    private MySlidingMenu mSlidingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        mBack = (ImageView) findViewById( R.id.back );
        mSlidingMenu = (MySlidingMenu) findViewById( R.id.myslidingmenu );
        mBack.setOnClickListener( new OnClickListener() {

            @Override
            public void onClick(View v) {
                //打开关闭侧拉菜单
                mSlidingMenu.toggle();
            }
        } );
    }

    /**
     * 菜单页的textview的点击事件
     *
     * @param view ： 被点击控件的对象
     */
    public void showtext(View view) {
        TextView textView = (TextView) view;
        Toast.makeText( this, textView.getText(), 0 ).show();
    }
}
