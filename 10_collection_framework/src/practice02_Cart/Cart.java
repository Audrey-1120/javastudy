package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  
  // field
  private List<Product> products;   // 카트에 담은 물건들
  
  // constructor
  public Cart(int cartSize) {
    products = new ArrayList<Product>(cartSize);
    
  }
  
  // method
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
  
  
  // 물건 담기
  public void addProduct(Product product) throws RuntimeException {
    
    // 담을 물건이 없는 경우
    if(product == null) {
      throw new RuntimeException("카트에 담을 물건이 없습니다.");
    }
    
    products.add(product);
    
    
  }
  

  // 물건 바꾸기
  public void changeProduct(int idx, Product product) throws RuntimeException {
    // 바꾸려는 물건의 위치(idx)와 물건(product)
    
    // 카트가 비어 있는 경우 -> addProduct에서 물건 추가할때 count++했음.. 0 이다? 그럼 물건 하나도 없는거
    if(products.size() == 0) {
      throw new RuntimeException("카트가 비었습니다.");
    }
    
    // 바꿀 물건이 없는 경우 -> product값이 null값임.
    if(product == null) {
      throw new RuntimeException("바꿀 물건이 없습니다.");
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우 -> idx가 음수이거나 담은 물건(products)의 요소 길이보다 크다?
    if(idx < 0 || idx >= products.size()) {
      throw new RuntimeException("물건 번호가 잘못되었습니다.");
    }
    
    products.set(idx, product);
    
    
  }
  
  // 물건 빼기
  public void removeProduct(int idx) throws RuntimeException{
    int count = products.size();
    
    // 카트가 비어 있는 경우
    if(count == 0) {
      throw new RuntimeException("카트가 비었습니다.");
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= count) {
      throw new RuntimeException("물건 번호가 잘못되었습니다.");
    }
    
    products.remove(idx);
    
  }


  
  
  
  
  
  

    
    
}