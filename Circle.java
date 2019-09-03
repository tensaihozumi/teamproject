
/**
 * クラス Circle の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Circle implements Shape
{
    public int won;
    public Circle(int won){
        this.won = won;

    }

    public void draw(){
        System.out.println("반지름이"+this.won+ "인 원입니다."); 
    }

    public double getArea(){
        return this.won * this.won * PI;
    } 
}