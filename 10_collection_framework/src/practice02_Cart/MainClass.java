package practice02_Cart;

public class MainClass {

  public static void main(String[] args) {
    
    
    try {
      
      // 10000원 가진 고객
      Customer customer = new Customer(30000);
      
      // 10개 물건 담을 수 있는 카트
      Cart cart = new Cart(10);
      
      // 고객이 카트 가짐
      customer.setCart(cart);
      
      // 고객이 쇼핑함.
      customer.addToCart(new Product("오리지널 베이글", 3200));
      customer.addToCart(new Product("블루베리 크림치즈", 2600));
      customer.addToCart(new Product("파더스 베이글", 3200));
      customer.addToCart(new Product("체다 베이글", 3200));
      customer.addToCart(new Product("모짜렐라 베이글", 3200));
      customer.addToCart(new Product("고구마 베이글", 3200));
      customer.addToCart(new Product("딸기 크림치즈", 2600));
      customer.addToCart(new Product("시금치 베이글", 3200));
      
      customer.changeCart(0, new Product("먹물 베이글", 3200));
      
      customer.removeCart(0);
      
      customer.addToCart(new Product("아몬드 베이글", 3200));
      
      // 구매하면 영수증이 반환됨.
      String receipt = customer.buy();
      
      // 영수증 확인
      System.out.println(receipt);
      
      // 고객 정보 확인
      System.out.println("고객이 가진 돈 : " + customer.getMoney());
      

    } catch (Exception e) {
      
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    
    
    
    
  }

}