import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Launch {
    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();
    //String Page_url = page.url();

    public void FolderCreate(){
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
        String formatedDateTime = current.format(format);
//        String FolderName = Page_url;
        String  Folderpath = System.getProperty("user.dir")+"\\Screenshots\\"+"_"+formatedDateTime;
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

    public void Screenshot_Screen(){
        Page page = browser.newPage();
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
        String formatedDateTime = current.format(format);
        String  Folderpath = System.getProperty("user.dir")+"\\Screenshots\\"+"_"+formatedDateTime;
        String screenshot_name = formatedDateTime + ".jpg";
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(Folderpath + screenshot_name)));
    }


}
