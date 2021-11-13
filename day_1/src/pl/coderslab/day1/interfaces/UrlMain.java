package pl.coderslab.day1.interfaces;

public class UrlMain {

    public static void main(String[] args) {

        Url standardUrl = new StandardUrl();
        Url extendedUrl = new ExtendedUrl();

        System.out.println(standardUrl.getParam("param1","url_example?param1=99&param2=string"));
        System.out.println(extendedUrl.getParam("param1","url_example/param1.55/param2.byte"));
    }
}
