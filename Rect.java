
/**
 * クラス Rect の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
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