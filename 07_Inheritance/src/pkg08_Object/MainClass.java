package pkg08_Object;

public class MainClass {

  public static void main(String[] args) {
    
    // Object 타입의 Book 객체
    Object obj = new Book("979-11-6224-187-5", "혼공자");
    
    // Object 타입의 Book 객체를 Book 타입으로 캐스팅한 뒤 메소드 호출하기
    System.out.println(((Book) obj).getIsbn());
    System.out.println(((Book) obj).getTitle());
    
    // Object obj 와 내용이 동일한 Book 객체
    Book book = new Book("979-11-6224-187-5", "혼공자");
    
    System.out.println(obj.equals(book));   // 객체 obj와 객체 book이 동일하면 true 반환.
    System.out.println(book.toString());    // "객체명@참조값"을 반환.
    System.out.println(book);               // toString() 메소드 호출은 생략할 수 있다.
    
    /* ****************************************************************************** */
    
    Student student1 = new Student(10101, "박대기");
    Student student2 = new Student(10101, "박대기");
    
    System.out.println(student1.equals(student2));
    System.out.println(student1);
    
    student1.addBook(new Book("979-11-6224-187-5", "혼공자"));
    student1.addBook(new Book("979-11-6224-187-6", "혼공꽃"));
    student1.addBook(new Book("979-11-6224-187-7", "혼공피"));
    student1.addBook(new Book("979-11-6224-187-8", "혼공요"));
    student1.addBook(new Book("979-11-6224-187-9", "혼공조"));
    
    for( Book b : student1.getBooks()) {
      if(b != null) { // Book 클래스에 Object 클래스의 toString 메소드 오버라이드
        System.out.println(b);
      }
    }
    
    student1.removeBook(new Book("979-11-6224-187-5", "혼공자"));
    
    for(Book b : student1.getBooks()) {
      if(b != null) {
        System.out.println(b);  // Book 클래스에 Object 클래스의 toString 메소드 오버라이드
      }
    }
    
    
    
    
    
  }

}
