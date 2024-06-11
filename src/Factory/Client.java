package Factory;

import Factory.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter f = new Flutter(SupportedPlatforms.IOS);
        UiFactory uiFactory = f.createFactory();
        Button button = uiFactory.createButton();
        button.changesize();

    }
}
