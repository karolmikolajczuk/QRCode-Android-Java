package com.karolm.qrcodegenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QRVersionAlignmentPattern {
    public static final Map<QRVersion, ArrayList<Integer>> QRAlignmentPattern =
            new HashMap<QRVersion, ArrayList<Integer>>() {{
        put(QRVersion.V2, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(18));
        }});

        put(QRVersion.V3, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(22));
        }});

        put(QRVersion.V4, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26));
        }});

        put(QRVersion.V5, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30));
        }});

        put(QRVersion.V6, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(34));
        }});

        put(QRVersion.V7, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(22)); add(Integer.valueOf(38));
        }});

        put(QRVersion.V8, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(24)); add(Integer.valueOf(42));
        }});

        put(QRVersion.V9, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(46));
        }});

        put(QRVersion.V10, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(28)); add(Integer.valueOf(50));
        }});

        put(QRVersion.V11, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(54));
        }});

        put(QRVersion.V12, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(32)); add(Integer.valueOf(58));
        }});

        put(QRVersion.V13, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(34)); add(Integer.valueOf(62));
        }});

        put(QRVersion.V14, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(46));
            add(Integer.valueOf(66));
        }});

        put(QRVersion.V15, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(48));
            add(Integer.valueOf(70));
        }});

        put(QRVersion.V16, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(50));
            add(Integer.valueOf(74));
        }});

        put(QRVersion.V17, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(54));
            add(Integer.valueOf(78));
        }});

        put(QRVersion.V18, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(56));
            add(Integer.valueOf(82));
        }});

        put(QRVersion.V19, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(58));
            add(Integer.valueOf(86));
        }});

        put(QRVersion.V20, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(34)); add(Integer.valueOf(62));
            add(Integer.valueOf(90));
        }});

        put(QRVersion.V21, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(28)); add(Integer.valueOf(50));
            add(Integer.valueOf(72)); add(Integer.valueOf(94));
        }});

        put(QRVersion.V22, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(50));
            add(Integer.valueOf(74)); add(Integer.valueOf(98));
        }});

        put(QRVersion.V23, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(54));
            add(Integer.valueOf(78)); add(Integer.valueOf(102));
        }});

        put(QRVersion.V24, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(28)); add(Integer.valueOf(54));
            add(Integer.valueOf(80)); add(Integer.valueOf(106));
        }});

        put(QRVersion.V25, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(32)); add(Integer.valueOf(58));
            add(Integer.valueOf(84)); add(Integer.valueOf(110));
        }});

        put(QRVersion.V26, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(58));
            add(Integer.valueOf(86)); add(Integer.valueOf(114));
        }});

        put(QRVersion.V27, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(34)); add(Integer.valueOf(62));
            add(Integer.valueOf(90)); add(Integer.valueOf(118));
        }});

        put(QRVersion.V28, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(50));
            add(Integer.valueOf(74)); add(Integer.valueOf(98)); add(Integer.valueOf(122));
        }});

        put(QRVersion.V29, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(54));
            add(Integer.valueOf(78)); add(Integer.valueOf(102)); add(Integer.valueOf(126));
        }});

        put(QRVersion.V30, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(52));
            add(Integer.valueOf(78)); add(Integer.valueOf(104)); add(Integer.valueOf(130));
        }});

        put(QRVersion.V31, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(56));
            add(Integer.valueOf(82)); add(Integer.valueOf(108)); add(Integer.valueOf(134));
        }});

        put(QRVersion.V32, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(34)); add(Integer.valueOf(60));
            add(Integer.valueOf(86)); add(Integer.valueOf(112)); add(Integer.valueOf(138));
        }});

        put(QRVersion.V33, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(58));
            add(Integer.valueOf(86)); add(Integer.valueOf(114)); add(Integer.valueOf(142));
        }});

        put(QRVersion.V34, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(34)); add(Integer.valueOf(62));
            add(Integer.valueOf(90)); add(Integer.valueOf(118)); add(Integer.valueOf(146));
        }});

        put(QRVersion.V35, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(54));
            add(Integer.valueOf(78)); add(Integer.valueOf(102)); add(Integer.valueOf(126));
            add(Integer.valueOf(150));
        }});

        put(QRVersion.V36, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(24)); add(Integer.valueOf(50));
            add(Integer.valueOf(76)); add(Integer.valueOf(102)); add(Integer.valueOf(128));
            add(Integer.valueOf(154));
        }});

        put(QRVersion.V37, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(28)); add(Integer.valueOf(54));
            add(Integer.valueOf(80)); add(Integer.valueOf(106)); add(Integer.valueOf(132));
            add(Integer.valueOf(158));
        }});

        put(QRVersion.V38, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(32)); add(Integer.valueOf(58));
            add(Integer.valueOf(84)); add(Integer.valueOf(110)); add(Integer.valueOf(136));
            add(Integer.valueOf(162));
        }});

        put(QRVersion.V39, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(26)); add(Integer.valueOf(54));
            add(Integer.valueOf(82)); add(Integer.valueOf(110)); add(Integer.valueOf(138));
            add(Integer.valueOf(166));
        }});

        put(QRVersion.V40, new ArrayList<Integer>() {{
            add(Integer.valueOf(6)); add(Integer.valueOf(30)); add(Integer.valueOf(58));
            add(Integer.valueOf(86)); add(Integer.valueOf(114)); add(Integer.valueOf(142));
            add(Integer.valueOf(170));
        }});
    }};
}
