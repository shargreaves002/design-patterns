package structural.bridge.webPage;

import structural.bridge.theme.Theme;

public class About extends WebPage {

    public About(Theme theme) {
        super(theme);
    }

    public String getContent() {
        return "About page in " + super.theme.getColor() + ".";
    }
}
