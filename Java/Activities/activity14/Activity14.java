package activity14;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) {
		
		try {
			
			File file=new File("src/test/java/activity14/act14.txt");
			boolean fileStatus=file.createNewFile();
			
			if (fileStatus) 
			{
  				System.out.println("File is created");
			}
			else {
				System.out.println("File is not created");
			}
			
			File fileUtil=FileUtils.getFile("src/test/java/activity14/act14.txt");// get the file object
			//Read file
			System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
			
			//create directory
			File destDir = new File("resources");
			//Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);
            
          //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "act14.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);	
			
		} catch (Exception e) {
			System.out.println("exception:"+e);
		}

	}

}
