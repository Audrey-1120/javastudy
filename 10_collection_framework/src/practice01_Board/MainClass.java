package practice01_Board;

import java.util.List;

public class MainClass {

  public static void main(String[] args) {
    
    BoardService boardService = new BoardService();
    
    List<BoardVo> boardList = boardService.getBoardList();
    
    for(int i = 0, count = boardList.size(); i < count; i++) {
      System.out.println(boardList.get(i));
    }
    
    for(int i = 0, count = boardList.size(); i < count; i++) {
      System.out.println("번호 : " + boardList.get(i).getBoardNo());
      System.out.println("제목 : " + boardList.get(i).getTitle());
      System.out.println("작성자 : " + boardList.get(i).getCreatedAt());
      System.out.println("작성일자 : " + boardList.get(i).getCreatedAt());
      
    }
    
  }

}
