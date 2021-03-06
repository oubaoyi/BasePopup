package razerdp.demo.ui.fullscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;
import razerdp.basepopup.R;
import razerdp.demo.base.baseactivity.BaseActivity;
import razerdp.demo.popup.DemoPopup;

/**
 * Created by 大灯泡 on 2020/5/17.
 */
public class FullScreenActivity extends BaseActivity {
    DemoPopup mDemoPopup;

    @Override
    protected void onHandleIntent(Intent intent) {

    }

    @Override
    protected void onStartCreate(Bundle savedInstanceState) {
        super.onStartCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }


    @Override
    public int contentViewLayoutId() {
        return R.layout.activity_full_screen;
    }

    @Override
    protected void onInitView(View decorView) {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                                                 | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                                                 | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                                                 | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                                                                 | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                                                 | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    @OnClick(R.id.tv_test)
    void show() {
        if (mDemoPopup == null) {
            mDemoPopup = new DemoPopup(this);
            mDemoPopup.setText("FullScreenTest");
        }
        mDemoPopup.showPopupWindow();
    }
}
