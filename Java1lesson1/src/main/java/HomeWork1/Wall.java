package HomeWork1;

public class Wall extends Obstracle{
    private int height;
    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
