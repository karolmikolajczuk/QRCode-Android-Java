package com.karolm.qrcodegenerator;

import java.util.HashMap;
import java.util.Map;

public class QRCapacityTable {
    public static final Map<QRVersion, QRErrorCorrectionLevel> capacityTable =
            new HashMap<QRVersion, QRErrorCorrectionLevel>() {{
        // 17px x 17px
        put(QRVersion.V1, new QRErrorCorrectionLevel(QRErrorCorrection.L, 41, 25, 17, 10));
        put(QRVersion.V1, new QRErrorCorrectionLevel(QRErrorCorrection.M, 34, 20, 14, 8));
        put(QRVersion.V1, new QRErrorCorrectionLevel(QRErrorCorrection.Q, 27, 16, 11, 7));
        put(QRVersion.V1, new QRErrorCorrectionLevel(QRErrorCorrection.H, 17, 10, 7, 4));

        // 21px x 21px
        put(QRVersion.V2, new QRErrorCorrectionLevel(QRErrorCorrection.L, 77, 47, 32, 20));
        put(QRVersion.V2, new QRErrorCorrectionLevel(QRErrorCorrection.M, 63, 38, 26, 16));
        put(QRVersion.V2, new QRErrorCorrectionLevel(QRErrorCorrection.Q, 48, 29, 20, 12));
        put(QRVersion.V2, new QRErrorCorrectionLevel(QRErrorCorrection.H, 34, 20, 14, 8));

        // 25px x 25px
        put(QRVersion.V3, new QRErrorCorrectionLevel(QRErrorCorrection.L, 127, 77, 53, 32));
        put(QRVersion.V3, new QRErrorCorrectionLevel(QRErrorCorrection.M, 101, 61, 42, 26));
        put(QRVersion.V3, new QRErrorCorrectionLevel(QRErrorCorrection.Q, 77, 47, 32, 20));
        put(QRVersion.V3, new QRErrorCorrectionLevel(QRErrorCorrection.H, 58, 35, 24, 15));

        // 29px x 29px
        put(QRVersion.V4, new QRErrorCorrectionLevel(QRErrorCorrection.L, 187, 114, 78, 48));
        put(QRVersion.V4, new QRErrorCorrectionLevel(QRErrorCorrection.M, 149, 90, 62, 38));
        put(QRVersion.V4, new QRErrorCorrectionLevel(QRErrorCorrection.Q, 111, 67, 46, 28));
        put(QRVersion.V4, new QRErrorCorrectionLevel(QRErrorCorrection.H, 82, 50, 34, 21));

        // 33px x 33px
        put(QRVersion.V5, new QRErrorCorrectionLevel(QRErrorCorrection.L, 255, 154, 106, 65));
        put(QRVersion.V5, new QRErrorCorrectionLevel(QRErrorCorrection.M, 202, 122, 84, 52));
        put(QRVersion.V5, new QRErrorCorrectionLevel(QRErrorCorrection.Q, 144, 87, 60, 37));
        put(QRVersion.V5, new QRErrorCorrectionLevel(QRErrorCorrection.H, 106, 64, 44, 27));

        // 37px x 37px
        put(QRVersion.V6, new QRErrorCorrectionLevel(QRErrorCorrection.L, 322, 195, 134, 82));
        put(QRVersion.V6, new QRErrorCorrectionLevel(QRErrorCorrection.M, 255, 154, 106, 65));
        put(QRVersion.V6, new QRErrorCorrectionLevel(QRErrorCorrection.Q, 178, 108, 74, 45));
        put(QRVersion.V6, new QRErrorCorrectionLevel(QRErrorCorrection.H, 139, 84, 58, 36));

        // till V40
        // 177px x 177px
    }};
}
