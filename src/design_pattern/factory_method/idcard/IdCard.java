package idcard;
import framework.*;

public class IdCard extends Product {
  private String owner;

  IdCard(String owner) {
    System.out.println(owner + "のカードを作ります");
    this.owner = owner;
  }

  public void use() {
    System.out.println(owner + "のカードを使います");
  }

  public String getOwner() {
    return owner;
  }
}
