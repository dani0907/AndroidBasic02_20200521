package com.example.androidbasic02_20200521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();
//    abstract넣으면 내용물 당장 없어도 ㄱㅊ

}
