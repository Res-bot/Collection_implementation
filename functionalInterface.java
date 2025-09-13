@FunctionalInterface  //functional interface are the ones which can have only single method
interface Damon {

    void vampire();
}

class Elena implements Damon{
    public void vampire(){
        System.out.println("Damon and Elena are Vampires");
    }
}

public class functionalInterface {
    public static void main(String[] args) {
        Damon dan = new Elena();
        dan.vampire();
    }
}
