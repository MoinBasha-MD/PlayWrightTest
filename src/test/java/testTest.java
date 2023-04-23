import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class testTest {
    Playwright playwright = Playwright.create();
    Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page= browser.newPage();
    LocalDateTime current = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
    String formatedDateTime = current.format(format);
    String screenshot_name = formatedDateTime+".jpg";
    public void screenshot_func(){
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("E:\\PWR\\Screenshots\\"+screenshot_name)));
    }
    @Test
    public void testTest(){
        screenshot_func();
        page.navigate("https://www.google.com/");
        screenshot_func();
        page.frameLocator("iframe[name=\"callout\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("No thanks")).click();
        screenshot_func();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).click();
        screenshot_func();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).fill("hello world");
        screenshot_func();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Search")).press("Enter");
        screenshot_func();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("\"Hello, World!\" program Wikipedia https://en.wikipedia.org › wiki › \"Hello,_World!\"_pro...")).click();
        screenshot_func();
    playwright.close();
}
}