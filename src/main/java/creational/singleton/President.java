package creational.singleton;

public class President {
    private static President president;

    private President(){}

    public static President getPresident () {
        if (president == null) president = new President();

        return president;
    }
}
