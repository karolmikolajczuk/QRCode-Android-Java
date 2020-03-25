package com.karolm.qrcodegenerator;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.Objects;

public class QRDataString {
    private String data;

    public QRDataString(String data) {
        this.data = data;
    }

    public int getLength() {
        return data.length();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QRDataString that = (QRDataString) o;
        return Objects.equals(data, that.data);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @NonNull
    @Override
    public String toString() {
        return data;
    }
}
