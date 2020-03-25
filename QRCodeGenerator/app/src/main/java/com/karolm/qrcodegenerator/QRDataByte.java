package com.karolm.qrcodegenerator;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class QRDataByte {
    private Byte data;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QRDataByte that = (QRDataByte) o;
        return Objects.equals(data, that.data);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public Byte getData() {
        return data;
    }

    public void setData(Byte data) {
        this.data = data;
    }

    public QRDataByte(Byte data) {
        this.data = data;
    }
}
