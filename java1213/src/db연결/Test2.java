package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test2{
   // 글쓰기 입력
   public void create(BbsVO vo) throws Exception {
      // 1. connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공");

      // 2. db연결
      String url = "jdbc:mysql://localhost:3366/shop1?useUnicode=true&characterEncoding=utf8";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공");

      // 3. sql문을 만든다.(create)
      String sql = "insert into bbs values (?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, vo.getWriter());
      ps.setString(2, vo.getTitle());
      ps.setString(3, vo.getContent());
      System.out.println("3. SQL생성 성공");

      // 4. sql문을 전송
      ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공");

   }

   // 번호 입력해서  아이디 검색
   public BbsVO one(int no) throws Exception {
      // 1. connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공");

      // 2. db연결
      String url = "jdbc:mysql://localhost:3366/shop1";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공");

      // 3. sql문
      String sql = "select * from bbs where no = ? ";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, no);
      System.out.println("3. SQL생성 성공");

      // 4. sql문을 전송
      ResultSet rs = ps.executeQuery();
      System.out.println("4. SQL문 전송 성공");

      BbsVO bag = new BbsVO();
      if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
         System.out.println("검색결과가 있어요.");

         int no2 = rs.getInt("no");
         String title = rs.getString("title");
         String content = rs.getString("content");
         String writer = rs.getString("writer"); //가방에서 꺼내기

         // 가방에 넣기

         bag.setNo(no2);
         bag.setTitle(title);
         bag.setContent(content);
         bag.setWriter(writer);
      } else {
         System.out.println("검색결과가 없어요.");
      }
      return bag;
   }

   // 글수정 
   public void vo(int no, String content) throws Exception {
      
      // 1. connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공");

      // 2. db연결
      String url = "jdbc:mysql://localhost:3366/shop1";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공");

      // 3. sql문을 만든다.(create)
      String sql = "update bbs set content = ? where no = ? ";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setInt(1, no);
      ps.setString(2, content);
      System.out.println("3. SQL생성 성공");

      // 4. sql문을 전송
      ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공");
   }

   // 삭제
   public void delete(String id) throws Exception {
      // 1. connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공");

      // 2. db연결
      String url = "jdbc:mysql://localhost:3366/shop1";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공");

      // 3. sql문 (delete)
      String sql = "delete from member where id = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, id);
      System.out.println("3. SQL생성 성공");

      // 4. sql문을 전송
      ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공");
   }

   // DTO(VO) 가방
   public void create(MemberVO vo) throws Exception {
      // 1. connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공");

      // 2. db연결
      // Stirng url = "연결하는방법://ip:port/db명";
      String url = "jdbc:mysql://localhost:3366/shop1";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공");

      // 3. sql문을 만든다.
      String sql = "insert into member values (?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, vo.getId());
      ps.setString(2, vo.getPw());
      ps.setString(3, vo.getName());
      ps.setString(4, vo.getTel());
      System.out.println("3. SQL생성 성공");

      // 4. sql문을 전송
      ps.executeUpdate();
      System.out.println("4. SQL문 전송 성공");

   }

   // DTO(VO) 검색
   public MemberVO one(String id) throws Exception {
      // 1. connector 설정
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("1. connector연결 성공");

      // 2. db연결
      String url = "jdbc:mysql://localhost:3366/shop1";
      String user = "root";
      String password = "1234";
      Connection con = DriverManager.getConnection(url, user, password);
      System.out.println("2. db연결 성공");

      // 3. sql문
      String sql = "select * from member where id = ? ";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, id);
      System.out.println("3. SQL생성 성공");

      // 4. sql문을 전송
      ResultSet rs = ps.executeQuery();
      System.out.println("4. SQL문 전송 성공");

      MemberVO bag = new MemberVO();

      if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
         System.out.println("검색결과가 있어요.");

         String id2 = rs.getString("id");
         String pw = rs.getString("pw");
         String name = rs.getString("name");
         String tel = rs.getString("tel");

         // 가방에 넣기
         bag.setId(id2);
         bag.setPw(pw);
         bag.setName(name);
         bag.setTel(tel);

      } else {
         System.out.println("검색결과가 없어요.");
      }
      return bag;
      // bag은 참조형 변수, 주소를 전달!
   }

}