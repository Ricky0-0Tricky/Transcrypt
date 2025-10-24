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

import morse.config.Settings;

/**
 * Author: Ricky☆. 
 * Starting Date: 24/10/2025.
 * Ending Date: 24/10/2025.
 * Description: The following class pretends to carry out
 * tests on the class "Settings" with the intent of
 * guaranteeing the predicted behaviour is assured.
 */
public class SettingsTest {
    /**
     * File Manager.
     */
    Settings sets;

    /**
     * Names of the Files that will be played.
     */
    String[] fileNames = {"dit.wav", "dah.wav"};

    /**
     * Default Constructor.
     *
     * @throws Exception Possible Exception
     */
    public SettingsTest() throws Exception {
        setupClass();
    }

    /**
     * Setup Method for the Class.
     *
     * @throws Exception Possible Exception
     */
    public void setupClass() throws Exception {
        this.sets = new Settings();
    }

    /**
     * Destructive Method for the Class.
     *
     * @throws Exception Possible Exception
     */
    public void tearDownClass() throws Exception {
        this.sets = null;
    }

    /**
     * Method to test the ability of the Settings to save.
     *
     * @throws Exception Possible Exception
     */
    public void testSaving() throws Exception {
        sets.save("settings.obj");
        System.out.println("I saved!");
    }

    /**
     * Method to test the ability of the Settings to load.
     * 
     * @throws Exception Possible Exception
     */
    public void testLoad() throws Exception {
       sets.load("settings.obj");
       System.out.println("I loaded!");
    }

    /**
     * Main Test Method.
     *
     * @param args Possible Arguments (aren't used in this case)
     * @throws Exception Possible Exception
     */
    public static void main(String[] args) throws Exception {
        SettingsTest test = new SettingsTest();
        test.testSaving();
        test.testLoad();
    }
}
