import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sample {

    @Test
public void ScreenFolder(String FolderNam){
    LocalDateTime current = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
    String formatedDateTime = current.format(format);
    String FolderName = FolderNam;
    String  Folderpath = System.getProperty("user.dir")+"\\Screenshots\\"+FolderName+"_"+formatedDateTime;
    File file = new File(Folderpath);
    //Creating the directory
    boolean bool = file.mkdir();
    if(bool){
        System.out.println(Folderpath);
        System.out.println("Directory created successfully");

    }else {
        System.out.println("Sorry couldn’t create specified directory");
    }
}


}
