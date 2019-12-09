package structural.bridge.webPage;

import structural.bridge.theme.Theme;

public abstract class WebPage {

    protected Theme theme;

    protected WebPage(Theme theme){
        this.theme = theme;
    };

    public abstract String getContent();
}
