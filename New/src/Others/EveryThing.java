package Others;
import Interfaces.*;
public class EveryThing implements Indicate,Depend{
    protected String Every = "Everything";

    @Override
    public void Indicating(){
        System.out.print(Every +" indicated that ");
    }
    @Override
    public String Dependency(){
        return "Depended on";
    }
}
