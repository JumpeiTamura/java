package mdfactory;
import factory.*;

public class MdLink extends Link {
  private int indent_level;

  public MdLink(String caption, String url, int indent_level) {
    super(caption, url);
    this.indent_level = indent_level;
  }

  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    for (int i = 0; i < indent_level; i++) {
      buffer.append("  ");
    }
    buffer.append("- [" + caption + "](" + url + " \"" + caption + "\")\n");
    return buffer.toString();
  }
}
