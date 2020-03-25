package com.karolm.qrcodegenerator;

public class QRErrorCorrectionLevel {
    private QRErrorCorrection errorLevel;
    private Integer numericMode;
    private Integer alphanumericMode;
    private Integer byteMode;
    private Integer kanjiMode;

    public QRErrorCorrectionLevel(QRErrorCorrection errorLevel,
                                  Integer numericMode,
                                  Integer alphanumericMode,
                                  Integer byteMode,
                                  Integer kanjiMode) {
        this.errorLevel = errorLevel;
        this.numericMode = numericMode;
        this.alphanumericMode = alphanumericMode;
        this.byteMode = byteMode;
        this.kanjiMode = kanjiMode;
    }

    public QRErrorCorrection getErrorLevel() {
        return errorLevel;
    }

    public Integer getNumericMode() {
        return numericMode;
    }

    public Integer getAlphanumericMode() {
        return alphanumericMode;
    }

    public Integer getByteMode() {
        return byteMode;
    }

    public Integer getKanjiMode() {
        return kanjiMode;
    }
}
