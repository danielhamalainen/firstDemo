public class Main {

    public static void main(String[] args) {
	// write your code here

        fatty bucky = new fatty();
        food food = new food();
        food potpie = new potpie();
        food tuna = new tuna();

        bucky.digest(food);
        bucky.digest(potpie);
        bucky.digest(tuna);


        /* food polyList[] = new food[2];

        polyList[0] = new potpie();
        polyList[1] = new tuna();

        for(int i = 0; i < polyList.length; i++ ) {   //Polymorphic arrayLoop
            polyList[i].eat();
        }

        */


    }
}
