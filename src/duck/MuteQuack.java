package duck;

/**
 *
 * @author mjmersenski
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
