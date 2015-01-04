package com.weeraman.android.quickstart;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by anuradha on 1/4/15.
 */
@Table(name = "KeyValue")
public class QuickstartStorage extends Model {
    @Column(name = "key")
    public String key;

    @Column(name = "value")
    public String value;
}
