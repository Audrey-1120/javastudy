package pkg08_Object;

public class MainClass {

  public static void main(String[] args) {
    
    Object obj = new Book("979-11-6224-187-5", "혼공자");
    
    System.out.println(((Book) obj).getIsbn());
    System.out.println(((Book) obj).getTitle());
    
    Book book = new Book("979-11-6224-187-5", "혼공자");
    
    System.out.println(obj.equals(book));
    System.out.println(book.toString());
    System.out.println(book);
    System.out.println();
    
    Student student1 = new Student(10101, "고길동");
    Student student2 = new Student(10101, "고길동");
    
    System.out.println(student1.equals(student2));
    System.out.println(student1);
    
    student1.addBook(new Book("979-11-6224-187-5", "혼공자"));
    student1.addBook(new Book("979-11-6224-187-6", "혼공꽃"));
    student1.addBook(new Book("979-11-6224-187-7", "혼공피"));
    student1.addBook(new Book("979-11-6224-187-8", "혼공요"));
    student1.addBook(new Book("979-11-6224-187-9", "혼공조"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);
      }
    }
    
    student1.removeBook(new Book("979-11-6224-187-5", "혼공자"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);
      }
    }
    
 
    
  }

}
