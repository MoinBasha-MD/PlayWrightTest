import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Formfill {

    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();
    String Page_url = page.url();
    LocalDateTime current = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
    String formatedDateTime = current.format(format);
    //        String FolderName = Page_url;
    String  Folderpath = System.getProperty("user.dir")+"\\Screenshots\\"+"_"+formatedDateTime;
    public class Tester {
        public void FolderCreate(){

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
            LocalDateTime current = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss");
            String formatedDateTime = current.format(format);
            String  Screenshotpath = Folderpath+"\\";
            String screenshot_name = formatedDateTime + ".jpg";
            page.screenshot(new Page.ScreenshotOptions()
                    .setPath(Paths.get(Screenshotpath + screenshot_name)));
        }
    }

    @Test
    public void formfill() {
        Tester tester = new Tester();
        tester.FolderCreate();
        tester.Screenshot_Screen();

        page.navigate("https://www.roboform.com/filling-test-all-fields");
        page.locator("input[name=\"\\30 1___title\"]").click();
        page.locator("input[name=\"\\30 1___title\"]").fill("MR");
        page.locator("input[name=\"\\30 1___title\"]").press("Tab");
        page.locator("input[name=\"\\30 2frstname\"]").fill("Dummy");
        page.locator("input[name=\"\\30 2frstname\"]").press("Tab");
        page.locator("input[name=\"\\30 3middle_i\"]").fill("DH");
        page.locator("input[name=\"\\30 3middle_i\"]").press("Tab");
        page.locator("input[name=\"\\30 4lastname\"]").fill("MN");
        page.locator("input[name=\"\\30 4lastname\"]").press("Tab");
        page.locator("input[name=\"\\30 4fullname\"]").fill("Dummy DH MN");
        page.locator("input[name=\"\\30 4fullname\"]").press("Tab");
        page.locator("input[name=\"\\30 5_company\"]").fill("hagsg");
        page.locator("input[name=\"\\30 5_company\"]").press("Tab");
        page.locator("input[name=\"\\30 6position\"]").fill("tester");
        page.locator("input[name=\"\\30 6position\"]").press("Tab");
        page.locator("input[name=\"\\31 0address1\"]").fill("aswed");
        page.locator("input[name=\"\\31 0address1\"]").press("Tab");
        page.locator("input[name=\"\\31 1address2\"]").fill("sdjdd");
        page.locator("input[name=\"\\31 1address2\"]").press("Tab");
        page.locator("input[name=\"\\31 3adr_city\"]").fill("hdhs");
        page.locator("input[name=\"\\31 3adr_city\"]").press("Tab");
        page.locator("input[name=\"\\31 4adrstate\"]").fill("hdhxh");
        page.locator("input[name=\"\\31 4adrstate\"]").press("Tab");
        page.locator("input[name=\"\\31 5_country\"]").fill("chch");
        page.locator("input[name=\"\\31 5_country\"]").press("Tab");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("End");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("End");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("ArrowDown");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("ArrowDown");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("PageDown");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("PageDown");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("End");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("NumLock");
        page.locator("input[name=\"\\31 6addr_zip\"]").fill("145666");
        page.locator("input[name=\"\\31 6addr_zip\"]").press("Tab");
        page.locator("input[name=\"\\32 0homephon\"]").fill("112234455");
        page.locator("input[name=\"\\32 1workphon\"]").click();
        page.locator("input[name=\"\\32 1workphon\"]").fill("00112233544");
        page.locator("input[name=\"\\32 2faxphone\"]").click();
        page.locator("input[name=\"\\32 2faxphone\"]").fill("zdhjdh");
        page.locator("input[name=\"\\32 2faxphone\"]").press("Tab");
        page.locator("input[name=\"\\32 3cellphon\"]").fill("1122334455");
        page.locator("input[name=\"\\32 3cellphon\"]").press("Tab");
        page.locator("input[name=\"\\32 4emailadr\"]").fill("test@gmail.com");
        page.locator("input[name=\"\\32 4emailadr\"]").press("Tab");
        page.locator("input[name=\"\\32 5web_site\"]").fill("test.com");
        page.locator("input[name=\"\\33 0_user_id\"]").click();
        page.locator("input[name=\"\\33 0_user_id\"]").fill("user12");
        page.locator("input[name=\"\\33 0_user_id\"]").press("Tab");
        page.locator("input[name=\"\\33 1password\"]").fill("user12");
        page.locator("input[name=\"\\33 1password\"]").press("Tab");
        page.locator("select[name=\"\\34 0cc__type\"]").selectOption("9");
        page.locator("input[name=\"\\34 1ccnumber\"]").click();
        page.locator("input[name=\"\\34 1ccnumber\"]").fill("112233445566");
        page.locator("input[name=\"\\34 3cvc\"]").click();
        page.locator("input[name=\"\\34 3cvc\"]").fill("864");
        page.locator("input[name=\"\\34 3cvc\"]").press("Tab");
        page.locator("select[name=\"\\34 2ccexp_mm\"]").selectOption("3");
        page.locator("select[name=\"\\34 3ccexp_yy\"]").selectOption("2034");
        page.locator("input[name=\"\\34 4cc_uname\"]").click();
        page.locator("input[name=\"\\30 4fullname\"]").click();
        page.locator("input[name=\"\\34 4cc_uname\"]").click();
        page.locator("input[name=\"\\34 4cc_uname\"]").fill("Dummy DH MN");
        page.locator("input[name=\"\\34 4cc_uname\"]").press("Tab");
        page.locator("input[name=\"\\34 5ccissuer\"]").fill("HDFC");
        page.locator("input[name=\"\\34 5ccissuer\"]").press("Tab");
        page.locator("input[name=\"\\34 6cccstsvc\"]").fill("HDFC");
        page.locator("input[name=\"\\34 6cccstsvc\"]").press("Tab");
        page.locator("input[name=\"\\36 0pers_sex\"]").fill("1800900600");
        tester.Screenshot_Screen();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
        playwright.close();
    }
}