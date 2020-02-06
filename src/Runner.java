public class Runner {

    public static void main(String[] args) {
        Car mycar = new Car(2002, "Lily", 100, "plane");
        mycar.toString();
        mycar.drive(7);
        mycar.toString();
        Rectangle myrectangle = new Rectangle(5,7);
        System.out.println(myrectangle.getArea());
        System.out.println(myrectangle.getDiagonal());
        System.out.println(myrectangle.isSquare());

    }
}
