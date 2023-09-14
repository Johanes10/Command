import Pattern.ConcreteCommand;
import Pattern.ConcreteReceiver;
import Pattern.Invoker;

public class App {
    public static void main(String[] args) throws Exception {
        Invoker invoker=new Invoker();
        ConcreteReceiver receiver= new ConcreteReceiver();
        invoker.executeCommand(new ConcreteCommand(),receiver);
    }
}
