package idcard;
import framework.*;
import java.util.*;

public class IdCardFactory extends Factory {
  private List owners = new ArrayList();

  protected Product createProduct(String owner) {
    return new IdCard(owner);
  }

  protected void registerProduct(Product product) {
    owners.add(((IdCard)product).getOwner());
  }

  public List getOwners() {
    return owners;
  }
}
