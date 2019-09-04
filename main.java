
/**
 * 메인메소드는 인터페이스 shape를 구현한 Circle,Oval,Rec을 출력하는 클래스를 프로그램
 * 
<<<<<<< HEAD
 * @author (2018315057/마트바라 케이토,2018315058/오타 오아키,2018315054/호즈미 요시아키,)
 * @version (2018/9/4)

 */
public class main
{

    public static void MyApp(String[] args){
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        for(int i = 0; i < list.length; i++)
            list[i].redraw();
        for(int i = 0; i < list.length; i++)
            System.out.println("면적은 " + list[i].getArea());
    }
}