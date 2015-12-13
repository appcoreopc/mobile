package com.example.jeremy.mydatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TestViewModel extends BaseObservable
{
    private String name;
    private String id;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
