package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
  
  // field
  private String name;
  private List<Employee> employees;
  
  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
  }
  
  //method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  // 고용
  public void hire(Employee employee) throws RuntimeException {
    if(employee == null) {
      throw new RuntimeException("고용될 사원 정보가 올바르지 않습니다.");
    }
    
    // 아래는 사원번호 중복체크! -> ArrayList가 가지고 있는 객체들끼리 서로 비교할 수 있는 contains 메소드 사용.
    if(employees.contains(employee)) { //이름이 달라도 사원번호가 같으면 이 조건에 걸리게 됨.
      throw new RuntimeException("이미 등록된 사원번호 입니다.");
    }
    employees.add(employee);
    
  }
  
  
  
  // 해고
  public void fire(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("해고할 사원이 없습니다.");
    }
    
    for(int i = 0, size = employees.size(); i < size; i++) {
      if(employees.get(i).getEmpNo() == empNo) {
        employees.remove(i);
        System.out.println(employees.get(i).getName() + "님이 해고되었습니다.");
        break;
      }
    }
    
    // 옵션 1) employees.get(i).getEmpNo() == empNo (int 값 비교) ==> 이때는 향상된 for문 X 인덱스 사용하기 때문에 그냥 for문 사용해준다.
    // 옵션 2) empNo -> int empNo (객체 값 비교) ==> 이때 equals 메소드를 오버라이드 해야한다. 어떻게? empNo가 동일한 객체는 같은 객체로 처리.

  }
  
  // 조회
  public void search(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    } // 여기서는 향상된 for문 사용 가능!
    
    Employee searchEmployee = new Employee(empNo, null); // 객체 비교할때 번호(empNo)만 비교하기 때문에 이름은 null 값으로 주기
    for(Employee employee : employees) { // 리스트의 모든 사원 객체를 가져온다.
      if(employee.equals(searchEmployee)) { //오버라이딩한 equals 메소드를 사용해서 가져온 객체와 위에서 새로 생성한(empNo만 받음) 객체와 비교함.
        employee.info(); // 같으면? -> 해당 객체의 정보 출력(미리 생성해놓은 info() 메소드 사용)
      }
    }
    
  }
  
  
  
  // 전체 조회
  public void searchAll() throws RuntimeException {
    
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    
    System.out.println("전체 사원 명단 ======= ");
    for(Employee employee : employees) {
      employee.info();
      System.out.println("--------------");
    }
    
  }
  
  
  
  
  
  
  

}
