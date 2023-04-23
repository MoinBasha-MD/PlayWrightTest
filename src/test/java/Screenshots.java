import com.microsoft.playwright.Page;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;

public class Screenshots extends Launch{
    Page page = browser.newPage();
    LocalDateTime current = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
    String formatedDateTime = current.format(format);
    String screenshot_name = formatedDateTime + ".jpg";

    String  Folderpath = System.getProperty("user.dir")+"\\Screenshots\\"+"_"+formatedDateTime;
    public void screenshot_func() {
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(Folderpath + screenshot_name)));
    }
}
