
/**
 * Circle 메소드는 반자름을 구하는 위해서 도드입니다.
 * 
<<<<<<< HEAD
 * @author (2018315057/마트바라 케이토,2018315058/오타 오아키,2018315054/호즈미 요시아키,)
 * @version (2018/9/4)

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