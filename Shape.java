
/**
 * インターフェース Shape のための注釈をここに書きます.
 * 
<<<<<<< HEAD
<<<<<<< HEAD
 * @author (2018315057/마트바라 케이토,2018315058/오타 오아키,2018315054/호즈미 요시아키,) 
 * @version (2018/9/4)
=======
 * @author (2018315058  오타 오아키 2018315054 호즈미 요시아키) 
 * @version (2019/9/4)
=======
<<<<<<< HEAD
 * @author (2018315057/Keito Realwin) 
 * @version (バージョン番号もしくは日付)
>>>>>>> f16159a818fd1c82a5f57ed464e10556dec8d4cf
=======
 * @author (2018315058 ota oaki) 
 * @version (2019/9/2)
>>>>>>> c6371c1967829d3e1bd270345899054cfc102616
>>>>>>> 72da7068011189fc690d31f04e0fe75ab948d72a
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
