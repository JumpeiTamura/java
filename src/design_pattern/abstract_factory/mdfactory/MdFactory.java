package mdfactory;
import factory.*;

public class MdFactory extends Factory {
  private static int indent_level = 0;

  public Link createLink(String caption, String url) {
    return new MdLink(caption, url, indent_level);
  }

  public Tray createTray(String caption) {
    MdTray md_tray = new MdTray(caption, indent_level);
    indent_level++;
    return md_tray;
  }

  public Page createPage(String title, String author) {
    return new MdPage(title, author);
  }
}
