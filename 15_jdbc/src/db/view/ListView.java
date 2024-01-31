package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class ListView implements View {

  @Override
  public UserDto display() {
    JOptionPane.showMessageDialog(null, "전체 명단을 가져옵니다.");
    // 입력이 없으므로 반환할 것도 없다.
    return null;
  }
  
  

}
