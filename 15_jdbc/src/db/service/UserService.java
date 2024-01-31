package db.service;

import java.util.List;

import db.dto.UserDto;

public interface UserService {
  List<UserDto> getUsers();
  UserDto getUser(int user_no); // 조회할 user_no값을 받아와야 함.
  int saveUser(UserDto userDto);
  int modifyUser(UserDto userDto);
  int removeUser(int user_no);
  // 이 인터페이스를 구현하는 클래스에서 메소드를 만들어준다.
}
