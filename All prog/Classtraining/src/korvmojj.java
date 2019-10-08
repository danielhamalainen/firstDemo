public class korvmojj {

  public int korvar = 10;

  public void feedHungryPerson(Person p) {
      if(korvar > 0) {
          if(p.hungry) {
              korvar--;
              p.hungry = false;
          }
      }

  }

}
