package Factory;

import Factory.Button.AndroidUIButton;

public class AndroidUIfactory implements UiFactory{

    @Override
    public AndroidUIButton createButton() {
        return new AndroidUIButton();
    }

}
