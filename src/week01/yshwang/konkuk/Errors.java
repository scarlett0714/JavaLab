package week01.yshwang.konkuk;

//public class errors : 파일이름과 class의 이름이 다름.
public class Errors
{
  //public Static main(string[] args) : main()메소드를 public static void로 선언하지 않음. static의 s는 대문자로, string의 s는 소문자로 작성함.
	public static void main(String[] args)
  {
	System.out.println("202110547 황윤선");
    //System.out.println(“이 프로그램은 많은 오류를 가지고 있다.”); : 따옴표가 잘못되었다.
	System.out.println("이 프로그램은 많은 오류를 가지고 있다.");
    //System.0ut.println(“그러나 프로그램이 이 문장을 출력된다면”) : 따옴표가 잘못되었다. out을 0ut으로 잘못 작성. 문장의 끝에 ;이 빠짐.
    System.out.println("그러나 프로그램이 이 문장을 출력된다면");
    //System.out.Println(“모든 오류를 고친 것이다.); : 따옴표가 잘못되었다. println의 p를 대문자로 작성함. 따옴표가 빠짐.
    System.out.println("모든 오류를 고친 것이다.");
  }
}
