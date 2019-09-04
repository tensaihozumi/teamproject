
/**
 * クラス Oval の注釈をここに書きます.
 * 
<<<<<<< HEAD
 * @author (2018315057/마트바라 케이토,2018315058/오타 오아키,2018315054/호즈미 요시아키,)
 * @version (2018/9/4)
=======
<<<<<<< HEAD
 * @author (2018315058  오타 오아키 2018315054 호즈미 요시아키)
 * @version (2019/9/4)
=======
 * @author (2018315057/matubara keito)
 * @version (バージョン番号もしくは日付)
>>>>>>> 72da7068011189fc690d31f04e0fe75ab948d72a
>>>>>>> f16159a818fd1c82a5f57ed464e10556dec8d4cf
 */
public class Oval implements Shape
{
    public int oval,maru;
    public Oval(int oval, int maru){
        this.oval = oval;
        this.maru = maru;
    }

    public void draw(){
        System.out.println(this.oval+ "x" + this.maru+"에 내접하는 타원입니다.");
    } 

    public double getArea(){
        return this.oval * this.maru * PI;
    } 
}