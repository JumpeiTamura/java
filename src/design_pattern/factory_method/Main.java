import framework.*;
import idcard.*;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IdCardFactory();
    Product card1 = factory.create("foo");
    Product card2 = factory.create("bar");
    Product card3 = factory.create("baz");
    card1.use();
    card2.use();
    card3.use();
  }
}
