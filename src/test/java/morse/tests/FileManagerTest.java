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

import java.awt.FileDialog;
import java.io.File;
import morse.utils.FileManager;

/**
 * Author: Ricky☆. 
 * Starting Date: 20/10/2025.
 * Ending Date: dd/MM/2025.
 * Description: The following class pretends to carry out
 * tests on the class "FileManager" with the intent of
 * guaranteeing the predicted behaviour is assured.
 */
public class FileManagerTest {

    /**
     * File Manager.
     */
    FileManager fileMan;

    /**
     * Names of the Files that will be played.
     */
    String[] fileNames = {"dit.wav", "dah.wav"};

    /**
     * Default Constructor.
     *
     * @throws Exception Possible Exception
     */
    public FileManagerTest() throws Exception {
        setupClass();
    }

    /**
     * Setup Method for the Class.
     *
     * @throws Exception Possible Exception
     */
    public void setupClass() throws Exception {
        this.fileMan = new FileManager();
    }

    /**
     * Destructive Method for the Class.
     *
     * @throws Exception Possible Exception
     */
    public void tearDownClass() throws Exception {
        this.fileMan = null;
    }

    /**
     * Method to test the ability of the File Manager to save a given file in
     * memory.
     *
     * @param submittedFile
     * @throws Exception Possible Exception
     */
    public void testSaving(File submittedFile) throws Exception {
        boolean result = this.fileMan.saveFile(submittedFile);
        System.out.println("Saved the File? -> " + result);
        // Force the submition of a valid file 
        if(result == false){
            getFile();
        }
    }

    /**
     * Method to obtain the desired file.
     * 
     * @throws Exception Possible Exception
     */
    public void getFile() throws Exception {
        FileDialog fileDialog = new java.awt.FileDialog((java.awt.Frame) null);
        fileDialog.setDirectory("C:\\");
        fileDialog.setMode(FileDialog.LOAD);
        fileDialog.setVisible(true);
        // Obtain the file selected by the user
        File[] file = fileDialog.getFiles();
        // Case where the user chose a file
        if (file.length != 0) {
            // Check if the chosen file is in a valid format
            if (file[0].getName().endsWith(".wav") || 
                file[0].getName().endsWith(".mp3") || 
                file[0].getName().endsWith(".aac") || 
                file[0].getName().endsWith(".fac")) {
                testSaving(file[0]);
            }
        }
    }

    /**
     * Main Test Method.
     *
     * @param args Possible Arguments (aren't used in this case)
     * @throws Exception Possible Exception
     */
    public static void main(String[] args) throws Exception {
        FileManagerTest test = new FileManagerTest();
        test.getFile();
    }
}
