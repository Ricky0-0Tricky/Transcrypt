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
package morse.config;

import java.util.Dictionary;

/**
 * Author: Ricky☆. 
 * Starting Date: 20/10/2025. 
 * Ending Date: dd/MM/YYYY.
 * Description: The following class represents the Settings of the app itself.
 * It is supposed to hold things like the current UI theme the user has chosen
 * and the current sounds the user has uploaded.
 */
public class Settings {

    /**
     * Dictionary to store the names of the 
     * designated audio files.
     */
    private Dictionary<String, String> audioFiles;

    /**
     * Designated GUI visual style.
     */
    private boolean visualMode;

    /**
     * Default Constructor.
     */
    public Settings() {
        this.audioFiles = null;
        this.visualMode = false;
        populateFiles();
    }
    
    /**
     * Method to initially populate the 
     * file dictionary to the default
     * files.
     */
    private void populateFiles() {
        this.audioFiles.put("dit", "dit.wav");
        this.audioFiles.put("dah", "dah.wav");
    }

    /**
     * Method to save the current settings.
     *
     * @param fileName Name of the Settings File
     */
    public void save(String fileName) {
        // TODO: Write the code to save the selected settings
    }

    /**
     * Method to load the current settings.
     *
     * @param fileName Name of the Settings File
     * @return Objeto de Definições
     */
    public Settings load(String fileName) {
        // TODO: Write the code to load the selected settings
        return null;
    }

    /**
     * Setter of the Dits Audio File.
     *
     * @param fileName Dits Audio File Name
     */
    public void setDitAudio(String fileName) {
        this.audioFiles.put("ditFile", fileName);
    }

    /**
     * Setter of the Dahs Audio File.
     *
     * @param fileName Dahs Audio File Name
     */
    public void setDahAudio(String fileName) {
        this.audioFiles.put("dahFile", fileName);
    }

    /**
     * Setter of the GUI Style.
     *
     * @param visualMode Visual Style of the GUI
     */
    public void setvisualMode(boolean visualMode) {
        this.visualMode = visualMode;
    }

    /**
     * Getter of the Dits Audio File Name.
     *
     * @return Name of the Dits File Name
     */
    public String getDitAudio() {
        return this.audioFiles.get("dihFile");
    }

    /**
     * Getter of the Dahs Audio File Name.
     *
     * @return Name of the Dahs File Name
     */
    public String getDahAudio() {
        return this.audioFiles.get("ditFile");
    }

    /**
     * Getter of the GUI Style.
     *
     * @return Visual Type of the GUI
     */
    public boolean getvisualMode() {
        return this.visualMode;
    }
    
    /**
     * Method "toString"
     * @return Object's Definition
     */
    @Override
    public String toString(){
        return "This object is an instance of the Settings class.";
    }
    
    // Serial UID
    public static final long serialVersionUID = 1L;
}
