package Factory;

public class Flutter  {

    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public UiFactory createFactory()
    {
        if(supportedPlatforms==SupportedPlatforms.IOS) {
            return new IOSUIfactory();
        }
        else if(supportedPlatforms==SupportedPlatforms.Android) {
            return new AndroidUIfactory();
        }
        return null;
    }
}
