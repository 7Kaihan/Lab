package Others;
import Interfaces.*;
import Abstraction.Base;

public class Piglet extends Base implements Say{
    public String Hearing (String who){
        return name + " is Heaing "+who;
    }
    public String Saying () {
        return "Says";
    }

    @Override
    public String Saying(String say, String who) {
        return say+ " to "+who;
    }
}
