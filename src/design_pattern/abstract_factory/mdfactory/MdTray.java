package mdfactory;
import factory.*;
import java.util.Iterator;

public class MdTray extends Tray {
  private int indent_level;
  public MdTray(String caption, int indent_level) {
    super(caption);
    this.indent_level = indent_level;
  }

  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    for (int i = 0; i < indent_level; i++) {
      buffer.append("  ");
    }

    buffer.append("- " + caption + "\n");
    Iterator it = tray.iterator();

    while (it.hasNext()) {
      Item item = (Item)it.next();
      buffer.append(item.makeHTML());
    }

    return buffer.toString();
  }
}
