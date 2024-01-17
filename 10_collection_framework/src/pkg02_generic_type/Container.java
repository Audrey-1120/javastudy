package pkg02_generic_type;

public class Container<T> {
  
//  private Object item; //Object타입이면 Object타입의 것만 호출할 수 있음. -> 피곤함.
  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }
  

}
