public class Singleton {
    //this means only one object per class
    private static Singleton instance = null;
    String name ;
    String url;

//    public Singleton() {
//        if we use public constructor then we can create multiple objects so having public constructor
// wont solev our issue
//    }

    private Singleton() {

    }  // but creating private constructor will not able to create objects so we need a class to
    // create object

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // the above instance works only for single threaded enironemnet , for multi threaded environmnet
    // we need to use locks





}
