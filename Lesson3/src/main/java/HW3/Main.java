package HW3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxWithApple = new Box<>();
        boxWithApple.addFruit(new Apple(1.0f));
        boxWithApple.addFruit(new Apple(1.0f));
        boxWithApple.addFruit(new Apple(1.0f));
        boxWithApple.addFruit(new Apple(1.0f));
        boxWithApple.addFruit(new Apple(1.0f));
        boxWithApple.addFruit(new Apple(1.0f));
        System.out.println(boxWithApple.getWeight() + "=вес коробки с яблоками");
        Box<Apple> boxWithApple2 = new Box<>();
        boxWithApple2.addFruit(new Apple(1.0f));
        System.out.println(boxWithApple2.getWeight() + "=вес второй коробки с яблоками");


        Box<Orange> boxWithOrange = new Box<>();
        boxWithOrange.addFruit(new Orange(1.5f));
        boxWithOrange.addFruit(new Orange(1.5f));
        boxWithOrange.addFruit(new Orange(1.5f));
      //  boxWithOrange.addFruit(new Orange(1.5f));

        System.out.println(boxWithOrange.getWeight()+ "=вес коробки с апельсанами");
        System.out.println((boxWithApple.compare(boxWithOrange)));




    }


}
