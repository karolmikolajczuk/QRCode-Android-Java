package com.karolm.qrcodegenerator;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.Map;

public class QRCodePrinting {

    // Singleton
    private QRCodePrinting() { }
    private static final QRCodePrinting instance = new QRCodePrinting();
    public final QRCodePrinting getInstance() { return instance; }

    // Data about QR Code
    private int width;              // width of qr code border
    private int height;             // height of qr code border
    private Bitmap bitmap;          // bitmap on which qr code exists
    private String bits;            // string of bits to put into bitmap
    private QRVersion qrVersion;    // version of qrcode it depends on later data

    // this map contains whole package of coords where
    // black pixels are stored. It is needed for target
    // data printing to not dismiss that.
    // BUT also there are white pixels which can't be
    // overwritten and they are the separators
    private Map<Integer, Integer> coordsOfGivenFinalPixels;


    /**
     * This is factory function which invokes in sequence
     *  rest methods which creates in total a QR Code
     * @param width of whole QR Code
     * @param height of whole QR Code
     * @param bits String (sequence) of bits in right order ASC.
     * @param bitmap Reference to a correct destination where the QR Code is created.
     */
    public void printQRCode(int width, int height, String bits, Bitmap bitmap) {


        setFindingPatterns(bitmap, width, height);
    }

    /**
     * Finding patterns are 3 squares placed in 3 corners
     *  - top right
     *  - top left
     *  - bottom left
     *
     *  Size of Finding patterns are always the same no matter
     *  how big QR Code has to be.
     *
     *  7x7 black circuit
     *  5x5 white circuit
     *  3x3 with filled middle black solid square
     */
    private void setFindingPatterns(Bitmap bitmap, int width, int height) {
        // first TOP-LEFT finding pattern
        for (int i=0; i<7; ++i) {
            for (int j=0; j<7; ++j) {
                if (i == 0 || j == 0 || j == 6 || i == 6 ||
                    (i>1 && i<5 && j>1 && j<5))
                    bitmap.setPixel(i, j, 0);
                else
                    bitmap.setPixel(i, j, 255);
                this.coordsOfGivenFinalPixels.
                    put(Integer.valueOf(i), Integer.valueOf(j));
            }
        }

        // second TOP-RIGHT finding pattern
        for (int i=0; i<7; ++i) {
            for (int j=width-1; j>width-9; --j) {
                if (i == 0 || j == width-1 || i == 6 || j == width - 8 || (i>1 && i<5 && j<width-2 && j>width-7))
                    bitmap.setPixel(i, j, 0);
                else
                    bitmap.setPixel(i, j, 255);

                this.coordsOfGivenFinalPixels.
                        put(Integer.valueOf(i), Integer.valueOf(j));
            }
        }

        // third BOTTOM-LEFT finding pattern
        for (int i=height-1; i>height-9; --i) {
            for (int j=0; j<7; ++j) {
                if (i == height-1 || i == height-8 || j == 0 || j == 6 || (j>1 && j<5 && i<height-2 && i>height-7))
                    bitmap.setPixel(i, j, 0);
                else
                    bitmap.setPixel(i, j, 255);

                this.coordsOfGivenFinalPixels.
                        put(Integer.valueOf(i), Integer.valueOf(j));
            }
        }
    }

    /**
     *
     * @param bitmap
     * @param width
     * @param height
     */
    private void setWhiteBorderForFindingPatterns(Bitmap bitmap, int width, int height) {

        // TOP-LEFT corner
        for (int i = 0; i <= 7; ++i) {
            bitmap.setPixel(i, 7, 255);
            this.coordsOfGivenFinalPixels.
                put(Integer.valueOf(i), Integer.valueOf(7));
            if (i == 7) {
                for (int j = 7; j >= 0; --j) {
                    bitmap.setPixel(i, j, 255);
                    this.coordsOfGivenFinalPixels.
                        put(Integer.valueOf(i), Integer.valueOf(j));
                }
            }
        }

        // TOP-RIGHT corner
        for (int i = 0; i <= 7; ++i) {
            bitmap.setPixel(i, width-8, 255);
            this.coordsOfGivenFinalPixels.
                put(Integer.valueOf(i), Integer.valueOf(width-8));
            if (i == 7) {
                for (int j = width-9; j<width; ++j) {
                    bitmap.setPixel(i, j, 255);
                    this.coordsOfGivenFinalPixels.
                        put(Integer.valueOf(i), Integer.valueOf(j));
                }
            }
        }

        // BOTTOM-LEFT
        for(int i = height-1; i >= height-8; --i) {
            bitmap.setPixel(i, 7, 255);
            this.coordsOfGivenFinalPixels.
                put(Integer.valueOf(i), Integer.valueOf(7));
            if(i == height - 8) {
                for (int j = 7; j>=0; --j) {
                    bitmap.setPixel(i, j, 255);
                    this.coordsOfGivenFinalPixels.
                        put(Integer.valueOf(i), Integer.valueOf(j));
                }
            }
        }
    }

    /**
     * Alignment pattern the fourth one, which is not exactly in the corner
     *  5x5 black circuit
     *  3x3 white circuit
     *  1x1 in the middle black square
     *
     * table for parameters
     *  x->
     *  y->
     *
     */
    private void addAlignmentPattern() {

        //this.coordsOfGivenFinalPixels.
        //    put(Integer.valueOf(i), Integer.valueOf(j));

        ArrayList<Integer> coordinates =
                QRVersionAlignmentPattern.
                       QRAlignmentPattern.
                       get(this.qrVersion);

        for (Integer i : coordinates) {
            for (Integer j : coordinates) {
                if(this.coordsOfGivenFinalPixels.
                        get(i).
                        equals(j)) { return; }

                // try to draw an alignment pattern

                // check 2 squares in each site
                // thanks to that we know if we can
                // put alignment pattern


            }
        }
    }



    private void placingDataBits() {

    }
}
