package com.weeraman.android.quickstart;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;
import de.greenrobot.event.EventBus;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity
public class QuickstartActivity extends Activity {



    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        EventBus.getDefault().unregister(this);
    }

    @Click(R.id.tapme)
    public void tapMe() {
        EventBus.getDefault().post(new String("Ready"));
    }

    @Click(R.id.activeandroid)
    public void testActiveAndroid() {
        QuickstartStorage storage = new QuickstartStorage();
        storage.key = "foo";
        storage.value = "bar";
        storage.save();

        QuickstartStorage retrievedItem = new Select().from(QuickstartStorage.class).where("key = ?", "foo").executeSingle();

        if (retrievedItem.value.equals("bar")) {
            Toast.makeText(this, "ActiveAndroid successful!", Toast.LENGTH_LONG).show();
        }

        retrievedItem.delete();
    }

    public void onEvent(String event) {
        if ("Ready".equals(event)) {
            Toast.makeText(this, "Annotations and EventBus works!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.weeraman.android.quickstart.R.menu.main, menu);
        return true;
    }
}

