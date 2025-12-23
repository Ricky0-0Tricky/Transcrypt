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
package morse.tests;

//import morse.core.Translator;

/**
 * Author: Ricky☆. 
 * Starting Date: 26/10/2025.
 * Ending Date: 26/10/2025.
 * Description: The following class pretends to carry out
 * tests on the class "Translator" with the intent of
 * guaranteeing the predicted behaviour is assured.
 */
public class TranslatorTest {
    /**
     * Translator.
     */
    //Translator trans;

    /**
     * Natural Language String.
     */
    String naturalStr = "Hello World";
    
    /**
     * Morse Code String. 
     */
    String morseCode = ".... . .-.. .-.. --- /.-- --- .-. .-.. -.. ";
    
    /**
     * Default Constructor.
     *
     * @throws Exception Possible Exception
     */
    public TranslatorTest() throws Exception {
        setupClass();
    }

    /**
     * Setup Method for the Class.
     *
     * @throws Exception Possible Exception
     */
    public void setupClass() throws Exception {
        //this.trans = new Translator(morseCode);
    }

    /**
     * Destructive Method for the Class.
     *
     * @throws Exception Possible Exception
     */
    public void tearDownClass() throws Exception {
        //this.trans = null;
    }

    /**
     * Method to test the ability of the Translator to translate a natural
     * looking text to morse code.
     *
     * @throws Exception Possible Exception
     */
    public void testNaturalToMorse() throws Exception {
        //String result = trans.translate(true);
        //System.out.println("The original string was " + this.naturalStr + "\nand the result was " + result);
    }
    
    /**
     * Method to test the ability of the Translator to translate morse 
     * code into natural language.
     *
     * @throws Exception Possible Exception
     */
    public void testMorseToNatural() throws Exception {
        //String result = trans.translate(false);
        //System.out.println("The original string was " + this.morseCode + "\nand the result was " + result);
    }

    /**
     * Main Test Method.
     *
     * @param args Possible Arguments (aren't used in this case)
     * @throws Exception Possible Exception
     */
    public static void main(String[] args) throws Exception {
        TranslatorTest test = new TranslatorTest();
        test.testMorseToNatural();
    }
}
