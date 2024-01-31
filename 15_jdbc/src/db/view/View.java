package db.view;

import db.dto.UserDto;

public interface View {

  // 사용자가 입력한 정보를 반환하는 것이 목표
  
  UserDto display();
  
}
