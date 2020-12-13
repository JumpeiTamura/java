public class Main {
  public static void main(String[] args) {
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("hoge"));
    bookShelf.appendBook(new Book("foo"));
    bookShelf.appendBook(new Book("bar"));
    bookShelf.appendBook(new Book("baz"));

    Iterator it = bookShelf.iterator();
    while (it.hasNext()) {
      Book book = (Book)it.next();
      System.out.println(book.getName());
    }
  }
}
