package db.view;

import javax.swing.JOptionPane;

import db.dto.UserDto;

public class DetailView implements View {

  @Override
  public UserDto display() {
    
    // 얘는 반환이 무조건 String이기 때문에 int로는 못받음!
    String user_no = JOptionPane.showInputDialog("조회할 사용자의 번호를 입력하세요.");
    return new UserDto(Integer.parseInt(user_no), null, null, null);
    
  }

}
