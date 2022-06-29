package Class23;

public class BrowserTester {
    public static void main(String[] args) {
      /*  WebDriver chrome=new Safari();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();
*/
        WebDriver [] browsers={new Chrome(),new Safari(),new Edge(),new FireFox()};

      /*  for (WebDriver driver:browsers){

            driver.startBrowser();
            driver.openUrl("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }*/
        for (int i=0; i<browsers.length; i++){
            browsers[i].startBrowser();
            browsers[i].openUrl("wwww.google.com");

        }


    }
}