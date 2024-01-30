package db.main;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

public class MainClass {

  public static void main(String[] args) {

//    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);
    
    
    
    UserDao userDao = UserDao.getInstance();
//    int result = userDao.saveUser(userDto2);
//    System.out.println(result + "행이 삽입되었습니다.");
    
    
    // 모든 유저 조회
//    List<UserDto> users = userDao.getUsers();
//    for(UserDto user : users) {
//      System.out.println(user);
//    }
    
    // 특정 유저 조회
//  UserDto userDto = userDao.getUser(4);
//  System.out.println(userDto);


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // 유저 정보 수정
//    userDao.modifyUser(userDto2);
    
    // 유저 삭제
//    userDao.removeUser(2);
    


    
    
  }

}
