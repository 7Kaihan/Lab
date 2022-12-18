package Others;

import Abstraction.Base;
import Interfaces.Think;

public class Pooh extends Base implements Think {
    @Override
    public  String Thought (){
        return name + " Thinks";
    }
}
