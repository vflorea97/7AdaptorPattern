package Adapter;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

//        System.out.println("The turkey says: ");
//        turkey.gobble();
//        turkey.fly();
//
//        System.out.println("\nThe duck says: ");
//        testDuck(duck);
//
//        System.out.println("\nThe wildturkey says: ");
//        testDuck(turkeyAdapter);

        System.out.println("The duck says:");
        duck.quack();
        duck.fly();

        System.out.println("\nThe turkei says: ");
        testTurkey(turkey);
        System.out.println("\nThe MallardDuck says: ");
        testTurkey(duckAdapter);


    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }

    
}
