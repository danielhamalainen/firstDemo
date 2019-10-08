public class Animal {

    private String name;
    private String food;

    public Animal(String name) {

        this.name = name;

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {

        return food;
    }

    public void setFood(String food) {

        this.food = food;
    }

    public void eat(String food) {
        this.food = food;
        System.out.println("Fredrik eating banana");
    }
}
