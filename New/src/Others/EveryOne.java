package Others;

import Interfaces.Counting;
import Interfaces.Depend;
import Interfaces.Say;

public class EveryOne implements Depend, Counting, Say {
    protected String every = "Everyone";
    @Override
    public String Dependency (){
        return " Depended on ";
    }
    @Override
    public String counted (){
        return " counting on ";
    }
    @Override
    public String Saying (){
        return "Says";
    }
    @Override
    public String Saying (String say,String who){
        System.out.println(every+" "+Saying()+" "+say+" "+who);
        return "0";
    }
}
