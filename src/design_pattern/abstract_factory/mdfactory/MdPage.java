package  mdfactory;
import factory.*;
import java.util.Iterator;

public class MdPage extends Page {
  public MdPage(String title, String author) {
    super(title, author);
  }

  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("# " + title + "\n");

    Iterator it = content.iterator();
    while (it.hasNext()) {
      Item item = (Item)it.next();
      buffer.append(item.makeHTML());
    }

    return buffer.toString();
  }
}
