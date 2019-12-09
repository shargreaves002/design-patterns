package structural.bridge.webPage;

import structural.bridge.theme.Theme;

public class Careers extends WebPage {

    public Careers(Theme theme) {
        super(theme);
    }

    public String getContent() {
        return "Careers page in " + super.theme.getColor() + ".";
    }
}
