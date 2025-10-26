/*
 * The MIT License
 *
 * Copyright 2025 Ricky☆.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package morse.utils;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Author: Ricky☆. 
 * Starting Date: 24/10/2025.
 * Ending Date: dd/MM/YYYY.
 * Description: The following class represents a Translating Thread.
 * In charge to do do the heavy lifting in the translation department.
 */
public class TranslatingThread extends Thread {
    
    /**
     * Submitted Text.
     */
    private String submittedText;

    /**
     * Translation Result.
     */
    public String result;

    /**
     * Dictionary with the equivalents.
     */
    private Dictionary<Character, String> info;

    /**
     * Type of Translation.
     */
    private boolean typeTranslation;

    /**
     * ABCs and 123s.
     */
    char[] alphanumeric = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
        '4', '5', '6', '7', '8', '9'
    };

    /**
     * Morse Code.
     */
    String[] code = {
        ".-", "-...", "-.-.", "-..", ".",
        "..-.", "--.", "....", "..", ".---",
        "-.-", ".-..", "--", "-.", "---",
        ".--.", "--.-", ".-.", "...", "-",
        "..-", "...-", ".--", "-..-", "-.--",
        "--..", "-----", ".----", "..---", "...--",
        "....-", ".....", "-....", "--...", "---..", "----."
    };
    
    /**
     * Parameterized Constructor.
     * 
     * @param submittedText Submitted Text to translate
     * @param typeTranslation Intended type of translation
     */
    public TranslatingThread(String submittedText, boolean typeTranslation){
        this.result = "";
        this.submittedText = submittedText.strip().toUpperCase();
        this.info = new Hashtable();
        // Population of the Translation Dictionary
        populateDictionary();
    }
    
    /**
     * Method to populate the Translation Dictionary.
     */
    private void populateDictionary(){
        // Iteration Counter
        int numIteration = 0;
        // Loop to Populate the Dictionary
        while (numIteration < 36) {
            this.info.put(this.alphanumeric[numIteration], this.code[numIteration]);
            numIteration++;
        }
    }
    
    /**
     * Method to remove spaces before breaks between words.
     *
     * @param spaces ArrayList containing space indexes
     */
    private void removeSpacesBeforeBreaks(ArrayList spaces) {
        // Loop to go over the space indexes
        for (int i = 0; i < spaces.size(); i++) {
            // Case where the previous char of the space is a break
            if (submittedText.charAt(((int) spaces.get(i)) - 1) == '/') {
                submittedText = submittedText.substring(0, ((int) spaces.get(i)) - 1) + "" + submittedText.substring(((int) spaces.get(i)) + 1, submittedText.length());
                spaces = findSpaceIndexs(submittedText);
            }
        }
    }

    /**
     * Method designed to find the space indexes in a String.
     *
     * @return ArrayList with the space indexes
     */
    private ArrayList findSpaceIndexs(String submittedText) {
        ArrayList<Integer> spaces = new ArrayList<Integer>();
        String auxText = submittedText;
        boolean spaceExists = true;
        int offset = 0;
        while (auxText.indexOf(" ") >= 0) {
            int localIndex = auxText.indexOf(" ");
            spaces.add(localIndex + offset);
            auxText = auxText.substring(localIndex + 1);
            offset += localIndex + 1;
        }
        return spaces;
    }
    
    @Override
    public void run(){
        // TODO: Write the code to translate the provided String
    }
}
