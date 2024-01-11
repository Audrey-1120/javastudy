package practice06_Cart;

public class Cart {
  
  // field
  public final static int CART_SIZE = 10;
  private Product[] products;   // 카트에 담은 물건들
  private int count;            // 카트에 담은 물건의 개수
  
  // constructor
  public Cart() {
    
  }

  public Cart(int cartSize) {
    products = new Product[Math.min(cartSize, CART_SIZE)];
    // cartSize 만큼의 물건을 담을 수 있는 카트 초기화!
    // 만약에 들어온 값이 CART_SIZE 보다 크면 cartSize와 CART_SIZE 둘중 작은 값 넣음.
  }

  // method
  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
  
  // 물건 담기
  public void addProduct(Product product) {
    
    // 카트가 꽉 찬 경우
    if(count == products.length) {
      System.out.println("카트가 가득 찼습니다.");
      return;
    }
    
    // 고른 물건이 없는 경우 -> product가 null
    if(product == null) {
      System.out.println("카트에 담을 물건이 없습니다.");
      return;
    }
    
    // 고른 물건(product)을 products에 넣는다. product를 넣었으면 인덱스인 count 변수 1+
    products[count++] = product;
    
    
  }
  

  // 물건 바꾸기
  public void changeProduct(int idx, Product product) {
    // 바꾸려는 물건의 위치(idx)와 물건(product)
    
    // 카트가 비어 있는 경우 -> addProduct에서 물건 추가할때 count++했음.. 0 이다? 그럼 물건 하나도 없는거
    if(count == 0) {
      System.out.println("카트가 비었습니다.");
      return;
    }
    
    // 바꿀 물건이 없는 경우 -> product값이 null값임.
    if(product == null) {
      System.out.println("바꿀 물건이 없습니다.");
      return;
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우 -> idx가 음수이거나 담은 물건(products)의 요소 길이보다 크다?
    if(idx < 0 || idx >= products.length) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }
    
    products[idx] = product; // 바꾸려는 물건의 위치(products[idx])에 물건(product) 담기.
    // 만약 물건을 이미 담았다? 새로 담은 물건으로 덮어쓰기 됨.
    
    
  }
  
  // 물건 빼기
  public void removeProduct(int idx) {
    
    
    // 카트가 비어 있는 경우
    if(count == 0) {
      System.out.println("카트가 비었습니다.");
      return;
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.length) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }
    
    // 물건을 뺀다고 해서 null 값을 바로 넣어버리면? 안됨.
    // 정해진 위치에서 물건을 빼고 남은 배열을 앞으로 당겨서 새로운 배열에 복사해야 함.
    
    /*
     * 물건이 5개(count)인 경우로 가정
     * 
     * 삭제할 idx      복사할 요소의 개수 (count - idx - 1) 
     * 0               4
     * 1               3
     * 2               2
     * 3               1
     * 4               0
     */
    
    
    System.arraycopy(products, idx + 1, products, idx, count - idx - 1);
    count--; // 물건 하나 삭제했으므로 😊
    //System.arraycopy(소스 배열, 소스 배열 시작 인덱스, 대상 배열, 대상 배열 시작 인덱스, 복사할 요소 개수);
    
    
    
  }
  
  
  
  
  
  

    
    
}