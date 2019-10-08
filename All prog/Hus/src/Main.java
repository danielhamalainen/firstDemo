public class Main {

    public static void main(String[] args) {

        Hus h1 = new Hus(300, 3, 4000000, 2004, "Skitgatan 1337");
        Hus h2 = new Hus(400, 32, 50000, 1602, "Vintergatan 2");
        Hus h3 = new Hus(50, 1, 40, 1750, "Luffargränden 99");

        Person p1 = new Person("Berra", "Knegare", 98, "Man", 170, h1.adress);
        Person p2 = new Person("Leffe", "Pundare", 32, "Man", 110, h2.adress);
        Person p3 = new Person("Roger", "Sosse", 54, "Kvinna", 160, h3.adress);

        Bil b1 = new Bil("Volvo", 5000, 100000);
        Bil b2 = new Bil("Saab", 200, 15000);
        Bil b3 = new Bil("Nissan", 70000, 3000);

        Husdjur pet1 = new Husdjur("Dog", 4, "RogerPontare");
        Husdjur pet2 = new Husdjur("Pussycat", 7, "GrabEm");
        Husdjur pet3 = new Husdjur("Cockroach", 3, "SuckMe");
        Husdjur pet4 = new Husdjur("BigFuckingRat", 9, "Grossbiatch");



        //HÄR BÖRJAR HUSEN


        System.out.println("Husets information: ");
        System.out.println("Storleken är " + h1.size + " kvadratmeter");
        System.out.println("Huset har " + h1.floors + " våningar");
        System.out.println("Det är värt " + h1.worth + " miljoner");
        System.out.println("Det byggdes år " + h1.buildYear);
        System.out.println("Det ligger längst upp på " + h1.adress);
        System.out.println("Här bor " + p1.name + " lyckligt!");
        System.out.println(p1.name + " kör en sådan sketen " + b2.model);

        System.out.println("");

        System.out.println("Husets information: ");
        System.out.println("Storleken är " + h2.size + " kvadratmeter");
        System.out.println("Huset har " + h2.floors + " våningar");
        System.out.println("Det är värt " + h2.worth + " miljoner");
        System.out.println("Det byggdes år " + h2.buildYear);
        System.out.println("Det ligger längst upp på " + h2.adress);
        System.out.println("Ägaren av denna fastigheten är " + p2.name);
        System.out.println("Han rullar runt i en gammal " + b1.model);

        System.out.println("");

        System.out.println("Husets information: ");
        System.out.println("Storleken är " + h3.size + " kvadratmeter");
        System.out.println("Huset har " + h3.floors + " våningar");
        System.out.println("Det är värt " + h3.worth + " kronor");
        System.out.println("Det byggdes år " + h3.buildYear);
        System.out.println("Det ligger i diket bredvid " + h3.adress);
        System.out.println("Här bor " + p3.name);
        System.out.println(p3.name + " kör en " + b3.model);

        System.out.println("");


        //HÄR BÖRJAR PERSONERNA

        System.out.println("Ny person: ");
        System.out.println("Detta är " + p1.name);
        System.out.println("Han jobbar som " + p1.work);
        System.out.println(p1.name + " är " + p1.age + " år gammal.");
        System.out.println("Utan att försöka förolämpa någon så är han en " + p1.sex);
        System.out.println(p1.name + " är " + p1.length + " cm kort");
        System.out.println("Berra bor på " + h1.adress);

        System.out.println("");

        System.out.println("Ny person: ");
        System.out.println("Detta är " + p2.name);
        System.out.println("Han jobbar som " + p2.work);
        System.out.println(p2.name + " är " + p2.age + " år gammal.");
        System.out.println("Utan att försöka förolämpa någon så är han en " + p1.sex);
        System.out.println(p1.name + " är " + p2.length + " cm kort");
        System.out.println("Leffe bor på " + h2.adress);

        System.out.println("");

        System.out.println("Ny person: ");
        System.out.println("Detta är " + p3.name);
        System.out.println("Han jobbar som " + p3.work);
        System.out.println(p1.name + " är " + p3.age + " år gammal.");
        System.out.println("Hon en " + p3.sex);
        System.out.println(p3.name + " är " + p3.length + " cm kort");
        System.out.println("Roger bor på " + h3.adress);

    }


}
