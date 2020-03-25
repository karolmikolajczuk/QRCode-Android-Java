package com.karolm.qrcodegenerator;


import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * HELLO WORLD
 *  ENCODING
 *
 *  HE LL O WO RL D
 *  each word divide into pairs if possible
 *
 *  take first HE
 *      H in alphanumericTable
 *      get bits in H
 *      get bits in E
 *      45 * H pos + E pos
 *      convert it into 11 bit string
 *
 *      encoding 1 letter
 *      same stuff but convert it into 6 bit string
 *
 */

public class AlphanumericComputing {

    private static final int alphanumericCode = 45;
    private static final EncodeMode encodemode = EncodeMode.ALPHANUMERIC;

    private String[] words;
    private byte[] bytes;
    private ArrayList<BitSet> bits = new ArrayList<>();
    private String modeIndicator;
    private String characterCountIndicator;
    private StringBuilder terminator;
    private int dataLength;


    public AlphanumericComputing(String data) {
        this.dataLength = data.length();
        this.characterCountIndicator = Integer.toBinaryString(data.length());
        this.words = data.split(" ");

        this.makeCharacterCountIndicatorValid();
    }



    public void computeBytes() {
        // for each word
        for(int i = 0; i < words.length; ++i) {
            // for each pair
            for(int j = 0; j < Math.round(words[i].length()%2); ++j) {
                int flag = (Math.round(words[i].length()%2)-1 == j) ? 1 : 2;
                Character[] carr = {
                        words[i].charAt(j*2+0),
                        words[i].charAt(j*2+1)
                };
                this.computeAlpha(carr, (flag == 1) ?
                        AlphanumericComputingOption.SOLO :
                        AlphanumericComputingOption.PAIR );
            }
        }
    }

    /**
     *
     * @param twoLetters
     * @param bitSize
     * @return
     */
    private BitSet computeAlpha(Character[] twoLetters, AlphanumericComputingOption bitSize) {
        String pairResult;
        if (bitSize == AlphanumericComputingOption.PAIR) {
            pairResult = Integer.toBinaryString(alphanumericCode *
                    AlphanumericTable.alphanumericTable.get(twoLetters[0]).intValue() +
                    AlphanumericTable.alphanumericTable.get(twoLetters[1]).intValue());
        } else {
            pairResult = Integer.toBinaryString(AlphanumericTable.alphanumericTable.get(twoLetters[0]).intValue());
        }

        BitSet bs = new BitSet((bitSize == AlphanumericComputingOption.PAIR) ? 11 : 6);

        for (int i = 0; i <= pairResult.length(); ++i) {
            if (pairResult.charAt(i) == '1') bs.set(i);
        }

        return bs;
    }

    /**
     * Character Count Indicator have to be 9 bits long.
     */
    private void makeCharacterCountIndicatorValid() {
        int howMany0sToAdd = 9 - this.characterCountIndicator.length();
        StringBuilder nulls = new StringBuilder();
        for (int i = 0; i < howMany0sToAdd; ++i) {
            nulls.append('0');
        }
        nulls.append(this.characterCountIndicator);
        this.characterCountIndicator = nulls.toString();
    }

    /**
     * Check prepared list with rules of QR size and pick
     *  the smallest option.
     * @return the smallest bigger or equal option
     */
    private Integer determineHowManyBitsRequired() {
        Integer howManyBits = Integer.MAX_VALUE; // default

        for(ThreesomeTemplate<QRVersion, QRErrorCorrection, Integer> temp : QRDetermineBitsNumber.rulesTable) {
            if (temp.getThird() >= this.dataLength && temp.getThird() < howManyBits) howManyBits = temp.getThird();
            if (temp.getThird() < this.dataLength && howManyBits != Integer.MAX_VALUE) break;
        }

        return howManyBits;
    }

    /**
     * Sometimes QR needs to be filled by 0s at the end of
     *  bit string. Max length of terminator is 4.
     *  Possibilities:
     *      -> "0"
     *      -> "00"
     *      -> "000"
     *      -> "0000"
     * Sometimes it needs only a few 0s to add, but when
     *  the lack is bigger or equal to 4 then the last choice
     *  has been picked.
     */
    private void prepareTerminatorString() {
        int limese = this.determineHowManyBitsRequired().intValue() - this.bits.size();
        limese = (limese > 4) ? 4 : limese;

        for(int i=0; i<limese; ++i) {
            this.terminator.append('0');
        }
    }

    /**
     * method checks if terminator has to be added to string of bits.
     *
     * @return true if terminator have to be added
     *         false if terminator don't have to be added
     */
    private boolean checkIfTerminatorNeeded() {
        return (this.determineHowManyBitsRequired().intValue() - this.dataLength > 0);
    }

    /**
     * Checks if bit string requires a terminator and
     *  eventually add's it.
     *
     */
    private void addTerminatorIfNecessary() {
        if (!this.checkIfTerminatorNeeded()) return;

        this.prepareTerminatorString();

        int endIndex = this.bits.get(this.bits.size()-1).size() + this.terminator.length();
        for(int index = endIndex - this.terminator.length(); index < endIndex; ++index) {
            this.bits.get(this.bits.size()-1).set(index, 0);
        }
    }

    /**
     * Takes current bit string and changes it to 8
     *  bit long words.
     */
    private void prepare8bitCodeWords() {
        StringBuilder nulls = new StringBuilder();

        int bitCount = 0;
        for (BitSet bs : this.bits) {
            bitCount += bs.size();
        }

        int rest = bitCount % 8;
        while(rest-- > 0) {
            nulls.append('0');
        }

        // for each '0' add it to tail of last bit set.
        for (Character c : nulls.toString().toCharArray()) {
            this.bits.get(this.bits.size()-1).set(
                this.bits.get(this.bits.size()-1).length()+1, c
            );
        }
    }

    /**
     * Checks if current state of bit string is
     *  ready to use. If it is not then it adds
     *  pad bytes.
     */
    private void checkIfBitStringIsReady() {

    }




    // Error computing

    /**
     * If QR Code is larger than version #2 then
     *  it is necessary to break it into blocks.
     */
    private void breakIntoBlocks() {

    }

    /**
     * Set blocks into groups.
     */
    private void groupBlocks() {

    }

    private void longDivision() {

    }

}
