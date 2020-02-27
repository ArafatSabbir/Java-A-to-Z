class Cycle{
    private int r;
    public Cycle(int r){
        this.r=r;
    }
    
    public double getArea(){
        return r*r*Math.PI;
    }


}

public class NonStaticMethod {

    public static void main(String[] args) {
        Cycle c= new Cycle(5);
       double area= c.getArea();
       System.out.println(area);
    }
}
