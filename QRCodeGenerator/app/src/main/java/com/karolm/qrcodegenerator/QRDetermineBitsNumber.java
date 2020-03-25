package com.karolm.qrcodegenerator;

import java.util.LinkedList;
import java.util.List;

public class QRDetermineBitsNumber {
    public static final List<ThreesomeTemplate<QRVersion, QRErrorCorrection, Integer>> rulesTable =
        new LinkedList<ThreesomeTemplate<QRVersion, QRErrorCorrection, Integer>>() {{
            add(new ThreesomeTemplate<>(QRVersion.V1, QRErrorCorrection.L, 19));
            add(new ThreesomeTemplate<>(QRVersion.V1, QRErrorCorrection.M, 16));
            add(new ThreesomeTemplate<>(QRVersion.V1, QRErrorCorrection.Q, 13));
            add(new ThreesomeTemplate<>(QRVersion.V1, QRErrorCorrection.H, 9));

            add(new ThreesomeTemplate<>(QRVersion.V2, QRErrorCorrection.L, 34));
            add(new ThreesomeTemplate<>(QRVersion.V2, QRErrorCorrection.M, 28));
            add(new ThreesomeTemplate<>(QRVersion.V2, QRErrorCorrection.Q, 22));
            add(new ThreesomeTemplate<>(QRVersion.V2, QRErrorCorrection.H, 16));

            add(new ThreesomeTemplate<>(QRVersion.V3, QRErrorCorrection.L, 55));
            add(new ThreesomeTemplate<>(QRVersion.V3, QRErrorCorrection.M, 44));
            add(new ThreesomeTemplate<>(QRVersion.V3, QRErrorCorrection.Q, 34));
            add(new ThreesomeTemplate<>(QRVersion.V3, QRErrorCorrection.H, 26));

            add(new ThreesomeTemplate<>(QRVersion.V4, QRErrorCorrection.L, 80));
            add(new ThreesomeTemplate<>(QRVersion.V4, QRErrorCorrection.M, 64));
            add(new ThreesomeTemplate<>(QRVersion.V4, QRErrorCorrection.Q, 48));
            add(new ThreesomeTemplate<>(QRVersion.V4, QRErrorCorrection.H, 36));

            add(new ThreesomeTemplate<>(QRVersion.V5, QRErrorCorrection.L, 108));
            add(new ThreesomeTemplate<>(QRVersion.V5, QRErrorCorrection.M, 86));
            add(new ThreesomeTemplate<>(QRVersion.V5, QRErrorCorrection.Q, 62));
            add(new ThreesomeTemplate<>(QRVersion.V5, QRErrorCorrection.H, 46));

            add(new ThreesomeTemplate<>(QRVersion.V6, QRErrorCorrection.L, 136));
            add(new ThreesomeTemplate<>(QRVersion.V6, QRErrorCorrection.M, 108));
            add(new ThreesomeTemplate<>(QRVersion.V6, QRErrorCorrection.Q, 76));
            add(new ThreesomeTemplate<>(QRVersion.V6, QRErrorCorrection.H, 60));

            // till V40
        }};


}
