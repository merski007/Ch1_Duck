package duck;

/**
 *
 * @author mjmersenski
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quad();
    }
    
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
