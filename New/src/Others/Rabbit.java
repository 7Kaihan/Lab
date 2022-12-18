package Others;
import Abstraction.*;
import Enum.*;
import Interfaces.*;
public class Rabbit extends Base implements Run,Say,Write,Feel,Eye,Have,Look{
   private EveryThing everyThing = new EveryThing();
   private EveryOne every = new EveryOne();
   private Pooh po = new Pooh();
   private Piglet pig = new Piglet();
   @Override
   public void Having (){
      System.out.print(name + " again would have a very busy "+Time.DAY);
   }
   @Override
   public void Eye (){
      System.out.println(" As soon as "+name+ " opened his eyes");
   }
   @Override
   public void Felt(){
      System.out.println(everyThing.Every+" "+ everyThing.Dependency()+" " +name);
      System.out.println(every.every+" "+every.counted()+" "+name);
   }
   @Override
   public String Saying (){
      return "Say";
   }
   @Override
   public String Writing(){
      return "write a letter (signed - Rabbit)";
   }

   public void Check (){
      System.out.println(everyThing.Every +" had to be checked by "+name);
   }
   public void Clarify(){
      System.out.println(everyThing.Every+" had to be clarified by "+name);
   }
   public void Explain(){
      System.out.println(everyThing.Every+ " had to be explained by "+name);
   }
   public void Organise(){
      System.out.println(everyThing.Every+ " had to be organised by "+name);
   }
   @Override
   public void Running(String who){
      System.out.println("on such a "+Light.MORNING+" it was imperative to run to "+who);
   }
   @Override
   public String Saying(String say,String who){
      System.out.println(Saying()+ " to "+who+" "+ say);
      return "0";
   }
   @Override
   public void Looking(){
      System.out.println(name+" Look at owl first");
   }

}
