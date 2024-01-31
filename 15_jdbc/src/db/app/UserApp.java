package db.app;

import java.util.List;

import javax.swing.JOptionPane;

import db.ctrl.UserController;
import db.dao.UserDao;
import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;
import db.view.DeleteView;
import db.view.DetailView;
import db.view.EditView;
import db.view.ListView;
import db.view.RegisterView;
import db.view.View;


// UserApp 동작 흐름
/*
* UserApp              UserController                                       UserService                                  UserDao
*   작업 선택       ->
*   View 실행 결과  -> 
*                      String requestHandle(작업 선택, View 실행 결과) {
*                        작업에 따른 서비스 호출(View 실행 결과 전달)    -> 
*   작업결과메시지  <-   작업결과메시지 반환
*   확인               }
*                                                                            반환타입 선택된메소드(View 실행 결과) {
*                                                                              DAO 메소드 호출(View 실행 결과)         ->
*                                                                        <-    반환값 반환         
*                                                                            }
*                                                                                                                         반환타입 선택된메소드(View 실행 결과) {
*                                                                                                                           DB 처리
*                                                                                                                      <-   반환값 반환
*/

public class UserApp {

  public static void main(String[] args) {
    
    UserController userController = new UserController();
    
    while(true) {
      String choice = JOptionPane.showInputDialog("1.전체명단 \n2.상세조회\n3.등록\n4.편집\n5.삭제\n0.종료\n원하는 작업 번호를 입력하세요.");
      // 선택에 따라서 View 가 달라짐.
      View view = null;
      switch(choice) {
      case "1" : view = new ListView(); break;
      case "2" : view = new DetailView(); break;
      case "3" : view = new RegisterView(); break;
      case "4" : view = new EditView(); break;
      case "5" : view = new DeleteView(); break;
      case "0" : JOptionPane.showMessageDialog(null, "사용자 앱을 종료합니다."); return;
      default : JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");
      }
      // 크게 두가지로 나뉜다. view 값이 null 이라면? 잘못된 입력임.
      // view 값이 null 값이 아니라면? 무언가 선택한 것임. 그러므로 view 가 null 이 아닐때 작업을 진행해야 함.
      if(view != null) {
        String message = userController.requestHandle(choice, view.display());
        // 선택지(1~5 choice)는 그대로 넘겨주고, 사용자 입력값은 view 에서 오버라이드한 display 에서 받아온 값을 넘겨준다.
        JOptionPane.showMessageDialog(null, message);
        
      }
     
    }
    
   
    
    
    
    
    

    
//    UserDto userDto = new UserDto(0, "테스트이름1", "테스트연락처1", null);
//    UserDao userDao = UserDao.getInstance();
//    int result = userDao.saveUser(userDto);
    //System.out.println(result + "행이 삽입되었습니다.");

//    UserService userService = new UserServiceImpl();
//    
//    List<UserDto> users = userService.getUsers();
//    for(UserDto user : users) {
//      System.out.println(user);
//    }
    
    //UserDto userDto = userDao.getUser(1);
    //System.out.println(userDto);
    
    //UserDto userDto = new UserDto(1, "수정이름", "수정연락처", null);
    //int result = userDao.modifyUser(userDto);
    //System.out.println(result + "행이 수정되었습니다.");
    
    //int result = userDao.removeUser(1);
    //System.out.println(result + "행이 삭제되었습니다.");
    
  }

}