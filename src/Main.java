public class Main {
    public static void main(String[] args) {
        Circle Circle1 = new Circle();
        Circle1.setRadius(7);
        System.out.println(Circle1.toString());
        System.out.println("---------------------------");
        Circle1.setSquare(78.5);
        System.out.println(Circle1.toString());
        System.out.println("---------------------------");


        Human Human1 = new Human();
        Human1.getHead().setHaircolor("белый");
        System.out.println(Human1.getHead().getHaircolor());
        Human1.getHead().setEyescolor("карий");
        System.out.println(Human1.getHead().getEyescolor());
        Human1.getLeg().setHeight(70);
        System.out.println(Human1.getLeg().getHeight());
        Human1.getLeg().setWeight(20);
        System.out.println(Human1.getLeg().getWeight());
        Human1.getHand().setLength(60);
        System.out.println(Human1.getHand().getLength());
        Human1.getHand().setWeight(7);
        System.out.println(Human1.getHand().getWeight());
        System.out.println("---------------------------");
        System.out.println(Human1.getHead().toString());
        System.out.println(Human1.getLeg().toString());
        System.out.println(Human1.getHand().toString());
        System.out.println("---------------------------");

        Author Author1 = new Author();
        Author1.Author("Л.В.Толстой", "Tolstoi@mail.ru", 'm');
        System.out.println(Author1.toString());
    }
}
