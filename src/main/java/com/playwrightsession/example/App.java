package com.playwrightsession.example;


import java.nio.file.Paths;
import com.microsoft.playwright.*;



public class App {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");

        System.out.println(page.title());
        browser.close();
        playwright.close();
    }
}
