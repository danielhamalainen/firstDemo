import java.util.Random;

public class Die {

   private int nuvarandeVärde;
   private int antalSidor = 6;


   public Die() {
       Roll();
       this.antalSidor = antalSidor;
   }

   public int getAntalSidor() {
       return antalSidor;
   }

   public void Roll() {

       Random rand = new Random();

       nuvarandeVärde = (int)(Math.random() * antalSidor + 1);

       System.out.println(nuvarandeVärde);
   }

}


