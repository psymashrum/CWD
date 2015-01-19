/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CWD;

import java.io.File;

/**
 *
 * @author aelkin
 */
public class CreateFolder {
    
    public  static void made (String student, String group, String spec){
        String pathToGroup = "D:\\OAT-Students\\" + spec + "\\" + group;
        File groupDir = new File (pathToGroup);
            if (groupDir.exists() != true){
                groupDir.mkdir();
                groupDir.setReadable(true);
                groupDir.setWritable(true);
                groupDir.setExecutable(true);
                System.out.print("Created DIR" + pathToGroup + "\n");
            }
        String pathToStudy = pathToGroup + "\\" + student;
        File studyDir = new File (pathToStudy);
            if(studyDir.exists() != true ){
                studyDir.mkdir();
                studyDir.setReadable(true);
                studyDir.setWritable(true);
                studyDir.setExecutable(true);
                System.out.print("Created DIR" + pathToStudy + "\n");
            }
        }
}

