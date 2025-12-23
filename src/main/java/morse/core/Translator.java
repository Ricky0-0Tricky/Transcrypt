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
package morse.core;

import morse.utils.TranslatingThread;

/**
 * Author: Ricky☆. 
 * Starting Date: 21/10/2025.
 * Ending Date: 26/10/2025.
 * Description: The following class represents the Translator.
 * In charge of translations between Natural Human Language
 * and Morse Code. Noting that it's possible that this class
 * will grow out to have more duties than originaly intended.
 */
public class Translator {
    
    /**
     * Submitted text to translate.
     */
    private String submittedText;
    
    /**
     * Result of the consequent translation.
     */
    private String result;
   
    /**
     * Parameterized Constructor.
     * @param submittedText Submitted text to translates
     */
    public Translator(String submittedText) {
        this.submittedText = submittedText;
        this.result = "";
    }
    
    /**
     * Setter of the submitted text.
     * @param submittedText Submitted Text to translate
     */
    public void setSubmittedText(String submittedText){
        this.submittedText = submittedText.toUpperCase();
    }
    
    /**
     * Translation Method to translate 
     * according to the users request.
     * 
     * @param typeTranslation Type of the requested translation
     * @return Requested translation
     */
    public String translate(boolean typeTranslation){
        // Natural Language -> Morse Code
        if(typeTranslation == true){
            languageToMorse();
            return this.result;
        } else {
            // Morse Code -> Natural Language
            morseToLanguage();
            return this.result;
        }
    }

    /**
     * Method to translate Morse to Natural Language.
     *
     * @param submittedCode Submitted Morse Code
     * @return Natural Language Translation
     */
    private void morseToLanguage() {
        // Creation and Start of a Translating Thread 
        TranslatingThread thd = new TranslatingThread(this.submittedText,false);
        thd.start();
        // Attempt at translating and gathering of the result 
        try{
            thd.join();
            this.result = thd.result;
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Method to translate Natural Language to Morse.
     *
     * @param submittedText Submitted Text
     * @return Morse Code Translation
     */
    private void languageToMorse() {
        // Creation and Start of a Translating Thread 
        TranslatingThread thd = new TranslatingThread(this.submittedText,true);
        thd.start();
        // Attempt at translating and gathering of the result 
        try{
            thd.join();
            this.result = thd.result;
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
   
    /**
     * Method "toString"
     * @return Object's Definitions
     */
    @Override
    public String toString(){
        return """
               This object is an instance of the Translator class.
               Currently with the following submitted text ->""" + this.submittedText
                + "and result -> " + this.result + ".";
    }
}
