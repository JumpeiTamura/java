import factory.*;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Main class.name.of.ConcreteFactory");
      System.exit(0);
    }
    Factory factory = Factory.getFactory(args[0]);

    Tray traynews = factory.createTray("新聞");
    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
    traynews.add(asahi);
    traynews.add(yomiuri);

    Tray traysearch = factory.createTray("サーチエンジン");
    Link excite = factory.createLink("Excite", "http://www.excite.com/");
    Link google = factory.createLink("Google", "http://www.google.com/");
    traysearch.add(excite);
    traysearch.add(google);

    Tray trayyahoo = factory.createTray("Yahoo!");
    Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
    Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
    trayyahoo.add(us_yahoo);
    trayyahoo.add(jp_yahoo);

    traysearch.add(trayyahoo);


    Page page = factory.createPage("LinkPage", "結城 浩");
    page.add(traynews);
    page.add(traysearch);
    page.output();
  }
}
