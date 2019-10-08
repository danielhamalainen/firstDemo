 public class Player {

    private String playerName;
    private int score;
    private int diceList;


   public String getName(String name) {
        playerName = name;
        return name;
    }

   public int getScore(int score) {
       this.score = score;
       return score;
   }




    /*public void rollDice() {

    }

    public int getDieValue() {

    }

    public void increaseScore() {

    }

    public void addDie() {

    }


     */


}
/*● Namnet skall vara av typen String. Ska ha en getter-metod
  ● Poängen skall vara av typen int och skall representera hur många poäng spelaren har lyckats samla ihop. Ska ha en getter-metod.
  ● Listan med tärningar är vad spelaren kommer att använda för att spela tärningsspelet. Skall vara av typen ArrayList<Die>.

 */


