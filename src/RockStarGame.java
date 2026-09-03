class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("runing form the enemy");

    }
    public void fire(){
        System.out.println("firing on the enemy");
    }
}
public class RockStarGame {
    public static void main(String[] args) {
      Tommy player1=new Tommy();
      player1.fire();
      player1.run();
      player1.hit();
    }
}
