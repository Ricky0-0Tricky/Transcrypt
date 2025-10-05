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

import java.io.File;

/**
 * Author: Ricky☆. 
 * Starting Date: 02/10/2025.
 * Ending Date: dd/MM/YYYY.
 * Description: The following class represents a File Manager.
 * Designed, as of this moment, to handle file submissions for
 * substitution of the default future audio files that will be
 * included.
 */
public class FileManager {
    
    /**
     * Method to save a given file.
     * 
     * @param submittedFile File that needs to be saved
     * @return Result of the Attempt
     */
    public boolean saveFile(File submittedFile){
        // TODO: Write the code to save a file
        return true;
    }
    
    /**
     * Evaluation Method to check if the file is valid.
     * 
     * @param submittedFile File to evaluate
     * @return Admissibility of File
     */
    private boolean isValidFile(File submittedFile){
        // TODO: Write the code to check if the file is admissible or not
        return true;
    }
    
    /**
     * Method to go over the format of the given file.
     * 
     * @param submittedFile File to look over
     * @return Whether or not it's in allowed format
     */
    private boolean isValidFormat(File submittedFile){
        // TODO: Write the code to check if the format of the file is legal
        return true;
    }
    
    
     /**
     * Método para avaliar a duração do ficheiro fornecido.
     *
     * @param submittedFile Ficheiro fornecido
     * @return Valor lógico da avaliação da duração
     */
    private boolean isValidLength(File submittedFile) {
        // TODO: Write the code to guarantee that the file's duration isn't too long
        return true;
    }

    /**
     * Method to obtain the file's duration in seconds.
     *
     * @param submittedFile Submitted File
     * @return Duration of the given file in seconds
     */
    private double getFileDuration(File submittedFile) {
        // TODO: Write the code to get the file's duration in seconds
        return 0.0;
    }
    
    /**
     * Method "toString"
     * @return Object's Definition
     */
    @Override
    public String toString(){
        return "This object is an instance of the File Manager class.";
    }
    
}
