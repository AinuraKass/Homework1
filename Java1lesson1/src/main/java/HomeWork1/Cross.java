package HomeWork1;

public class Cross extends Obstracle{
    private int distance;

    public Cross(int distance){
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(distance);
    }
}
