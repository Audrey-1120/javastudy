package practice03_Member;

public class MainClass {

  public static void main(String[] args) {
    
    // 임의의 정보를 가지는 Member 1명을 만들고, 정보 출력하기
    
    // or
    // 필드를 이용한 생성자
    Address address = new Address("12345", "a", "b", "c", "d", true);
    Contact contact = new Contact("02", "010");
    
    // 디폴트 형식 생성자 + setter
    Member member = new Member();
    member.setId("anna");
    member.setAddress(address);
    member.setContact(contact);
    
    // 정보 출력 getter
    System.out.println("아이디: " + member.getId());
    System.out.println("우편번호: " + member.getAddress().getPostCode());
    System.out.println("도로명주소 : " + member.getAddress().getRoadAddress());
    System.out.println("상세주소 : " + member.getAddress().getDetailAddress());
    System.out.println("지번 : " + member.getAddress().getJibunAddress());
    System.out.println("추가 : " + member.getAddress().getExtraAddress());
    System.out.println("기본 주소 여부 :" + member.getAddress().isIsbasicAddress());
    System.out.println("집전화 : " + member.getContact().getTel());
    System.out.println("휴대전화 : " + member.getContact().getMobile());
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* 내가 작성...
     *     
     *     Member Audrey = new Member("audrey1120", 
                     new Contact("02-1234-5678", "010-9876-5432"), 
                     new Address("12345", "구디로", "20번지", "장미아파트", "A동 201호", true) );
           위의 코드를....
           
           Address address = new Address("12345", "구디로", "20번지", "장미아파트", "A동 201호", true);
           Contact contact = new Contact("02-1234-5678", "010-9876-5432");
           
           Member Audrey = new Member();
           Audrey.setId("Audrey1120");
           Audrey.setAddress(address);
           Audrey.setContact(contact);
           
           
    
    
    // 1. 내 아이디는?
    System.out.println("오드리 님의 아이디는? >>");
    System.out.println(Audrey.getId());
    System.out.println();
    
    // 2. 내 전화번호는?
    System.out.println("오드리 님의 번호는? >>");
    System.out.println("오드리 님의 전화번호는 " + Audrey.getContact().getTel());
    System.out.println("오드리 님의 핸드폰번호는 " + Audrey.getContact().getMobile());
    
    System.out.println();
    
    
    // 3. 내가 사는 곳은?
    System.out.println("오드리 님이 사는 곳은? >>");
    
    System.out.println("오드리 님의 postCode는 " + Audrey.getAddress().getPostCode());
    System.out.println("오드리 님의 roadAddress는 " + Audrey.getAddress().getRoadAddress());
    System.out.println("오드리 님의 jibunAddress는 " + Audrey.getAddress().getJibunAddress());
    System.out.println("오드리 님의 detailAddress는 " + Audrey.getAddress().getDetailAddress());
    System.out.println("오드리 님의 extraAddress는 " + Audrey.getAddress().getExtraAddress());
    System.out.println("오드리 님의 isbasicAddress는 " + Audrey.getAddress().isIsbasicAddress());
    
    

     * 
     */
    
    
    
    
  }

}
