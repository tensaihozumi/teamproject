
/**
 * 도형을 묘사하는 인터페이스
 * 
<<<<<<< HEAD
<<<<<<< HEAD
 * @author (2018315057/마트바라 케이토,2018315058/오타 오아키,2018315054/호즈미 요시아키,) 
 * @version (2018/9/4)

 */

interface Shape {
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw(){ // 디폴트 메소드
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
