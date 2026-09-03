class Base1 {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am Base class");
    }
}

class Derived extends Base1 {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Base1 b = new Base1();
        b.setX(5);
        System.out.println("Value of X = " + b.getX());

        Derived d = new Derived();
        d.setX(10);   // Inherited from Base1
        d.setY(20);

        System.out.println( d.getX());
        System.out.println( d.getY());

        d.printMe();
    }
}