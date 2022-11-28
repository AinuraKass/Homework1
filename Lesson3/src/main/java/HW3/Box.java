package HW3;

import java.util.*;

public class Box <T extends Fruit> {
    private ArrayList<T> boxWithFruits = new ArrayList<>();

    public Box(){

    }

    public ArrayList<T> getBoxWithFruits() {
        return boxWithFruits;
    }

    public void setBoxWithFruits(ArrayList<T> boxWithFruits) {
        this.boxWithFruits = boxWithFruits;
    }
    public void addFruit(T fruit){
        boxWithFruits.add(fruit);
    }
    public float getWeight(){
        return boxWithFruits.size() * boxWithFruits.get(0).getWeight();

    }
    public  boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }
    public void joinedBox(Box<T> box){
        box.getBoxWithFruits().addAll(boxWithFruits);
        boxWithFruits.clear();


    }

    @Override
    public String toString() {
        return "Box{" +
                "boxWithFruits=" + boxWithFruits +
                '}';
    }





}
