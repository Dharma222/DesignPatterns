package Factory;

import Factory.Button.IOSUIButton;

public class IOSUIfactory implements UiFactory{
    @Override
    public IOSUIButton createButton() {
        return new IOSUIButton();
    }


}
