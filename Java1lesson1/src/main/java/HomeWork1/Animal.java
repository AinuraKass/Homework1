package HomeWork1;

public abstract class Animal {
    String name;
    String type;
    int  maxRun;
    int maxJump;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String name, String type, int maxRun, int maxJump){
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onDistance = true;
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getMaxJump() {
//        return maxJump;
//    }
//
//    public void setMaxJump(int maxJump) {
//        this.maxJump = maxJump;
//    }
//
//    public int getMaxRun() {
//        return maxRun;
//    }
//
//    public void setMaxRun(int maxRun) {
//        this.maxRun = maxRun;
//    }

    public void jump(int height){
        if(maxJump == 0){
            System.out.println(type + " " + name + " " + "не умеет прыгать");
            onDistance = false;
        }
        if (height <= maxJump) {
            System.out.println(type + " " + name + " " + "успешно справился с прыжком ");
        }else{
            System.out.println(type + " " + name + " " + "не справился с прыжком");
            onDistance = false;
        }
    }
    public void run(int distance){
        if (distance <= maxRun){
            System.out.println(type + " " + name + " " + "успешно пробежал беговую дорожку ");
        }else{
            System.out.println(type + " " + name + " " + "не смог пробежать");
            onDistance = false;
        }
    }
    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }
}
