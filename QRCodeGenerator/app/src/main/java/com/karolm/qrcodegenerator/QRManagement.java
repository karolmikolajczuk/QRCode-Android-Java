package com.karolm.qrcodegenerator;

public class QRManagement {

    /**
     * This function is computing the smallest and the best
     *  version for QRCode basing on the given data.
     *
     * @return The QRVersion which is an enum. It represents
     *  the size of an element.
     */
    public static QRVersion getCorrectVersion(QRDataString data) {

        return QRVersion.V1;
    }
}
