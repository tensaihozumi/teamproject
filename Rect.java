
/**
 * クラス Rect の注釈をここに書きます.
 * 
 * @author (2018315057/마트바라 케이토,2018315058/오타 오아키,2018315054/호즈미 요시아키,)
 * @version (2018/9/4)
 */
public class Rect implements Shape
{
    public int rect,sikaku;
    public Rect(int rect,int sikaku){
        this.rect = rect;
        this.sikaku =sikaku;
    }

    public void draw(){
        System.out.println(this.rect +"x"+this.sikaku+"크기의 사각형입니다."); 
    } 

    public double getArea(){
        return this.rect * this.sikaku;
    }

}