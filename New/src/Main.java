import Abstraction.Base;
import Others.*;
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        RabbitSDay rb = new RabbitSDay();
        Pooh po = new Pooh();
        Piglet pig = new Piglet();
        EveryOne everyone = new EveryOne();
        EveryThing everyThing = new EveryThing();
        everyThing.Indicating();
        rabbit.setName("Rabbit");
        po.setName("Pooh");
        rabbit.Having();
        rabbit.Eye();
        rabbit.Felt();
        rb.RabbitSDay();
        rabbit.Check();
        rabbit.Clarify();
        rabbit.Explain();
        rabbit.Organise();
        rabbit.Running("Po");
        rabbit.Saying("Well, that’s fine, then I’ll pass Piglet on","Pooh");
        pig.Hearing("Rabbit");
        rabbit.Saying(po.Thought()+" ... But I’d better look at Owl first","Piglet");
        everyone.Saying("Yes,","Rabbit");
        everyone.Saying("OK,","Rabbit");
        everyone.Saying("Will be done,","Rabbit");
    }
}