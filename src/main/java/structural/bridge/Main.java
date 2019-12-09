package structural.bridge;

import structural.bridge.theme.AquaTheme;
import structural.bridge.theme.DarkTheme;
import structural.bridge.theme.LightTheme;
import structural.bridge.theme.Theme;
import structural.bridge.webPage.About;
import structural.bridge.webPage.Careers;
import structural.bridge.webPage.WebPage;

public class Main {
    public static void main(String[] args) {
        Theme theme = new AquaTheme();
        WebPage page = new Careers(theme);
        // System.out.println(page.getContent());
    }
}
