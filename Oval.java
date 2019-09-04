
/**
 * クラス Oval の注釈をここに書きます.
 * 
 * @author (2018315058  오타 오아키 2018315054 호즈미 요시아키)
 * @version (2019/9/4)
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