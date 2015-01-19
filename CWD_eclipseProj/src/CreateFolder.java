
import java.io.File;

/**
 *
 * @author aelkin
 */
public class CreateFolder {
    
    public  static void made (String student, String group, String spec){
    	String pathToSpec = "D:\\OAT-Students\\" + spec;
    	File specDir = new File (pathToSpec);
        if (specDir.exists() != true){
            System.out.println("Speciality " + spec + "is have no folder!");
            Logger.write("ERROR ! Speciality " + spec + "is have no folder!");
            Errors.SpectialityErrors +=1;
        }
    
    	String pathToGroup = "D:\\OAT-Students\\" + spec + "\\" + group;
        File groupDir = new File (pathToGroup);
            if (groupDir.exists() != true){
                groupDir.mkdir();
                groupDir.setReadable(true);
                groupDir.setWritable(true);
                groupDir.setExecutable(true);
                System.out.print("Created DIR " + pathToGroup + "\n");
                Logger.write("Created DIR " + pathToGroup + "\n");
            }
            else{
            	System.out.println("Group " + pathToGroup + "alredy exists");
            	Logger.write("Group " + pathToGroup + "alredy exists");
            }
        
        String pathToStudy = pathToGroup + "\\" + student;
        File studyDir = new File (pathToStudy);
            if(studyDir.exists() != true ){
                studyDir.mkdir();
                studyDir.setReadable(true);
                studyDir.setWritable(true);
                studyDir.setExecutable(true);
                System.out.print("Created DIR " + pathToStudy + "\n");
                Logger.write("Created DIR " + pathToStudy + "\n");
            }
            else{
            	 System.out.println("Student " + pathToStudy + "alredy exists");
            	 Logger.write("ERROR ! Student " + pathToStudy + "alredy exists");
            	 Errors.StudentsErrors +=1;
            }
        }
}

