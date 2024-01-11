package practice06_Cart;

public class Customer {
  
  
  //field
  private int money;
  private Cart cart;
  
  // constructor
  public Customer() {
    
  }

  public Customer(int money) {
    super();
    this.money = money;
  }
  
  //method
  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
  
  
  // 물건 넣기
  public void addToCart(Product product) { // 여기서 null 체크는 이미 Cart가 하고 있다😊
    cart.addProduct(product);
  }
  
  // 물건 바꾸기
  public void changeCart(int idx, Product product) {
    cart.changeProduct(idx, product);
  }
  
  // 물건 빼기
  public void removeCart(int idx) {
    cart.removeProduct(idx);
  }
  
  // 구매 영수증
  // 반환 : 영수증
  public String buy() {
    
    //for(int i = 0; i < cart.getCount(); i++) 
    // 위 코드에서는 cart의 getCount메소드를 계속해서 호출한다 -> 몇번인지는 한번만 알면 되는데...
    // 그래서 초기화식으로 옮긴다! -> 성능이 훨씬 높아진다.
    
    String receipt = "영수증\n";
    int total = 0;
    
    for(int i = 0, count = cart.getCount(); i < count; i++) {

      // cart 에서 뺀 물건 1개
      Product product = cart.getProducts()[i];
      
      // 총 구매액 계산
      total += product.getPrice();
      
      // 구매 가능 여부 체크
      if(money < total) {
        System.out.println("구매금액이 부족합니다.");
        return null;
      }
      
      // 영수증 만들기
      receipt += product.getName();
      receipt += ".....";
      receipt += product.getPrice();
      receipt += "\n";
    }
    
    // 구매
    money -= total;
    
    // 영수증 만들기 추가
    receipt += "총 구매액......" + total + "\n";
    
    return receipt;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  
  
}
