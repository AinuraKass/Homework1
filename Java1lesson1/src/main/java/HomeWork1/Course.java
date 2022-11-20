package HomeWork1;

public class Course {
    Obstracle[] obstracles;
    public Course(Obstracle[] obstracles){
        this.obstracles = obstracles;

    }
    public void doIt(Team team){
        Participant[] teamMembers = team.getTeamMembers();
        if(teamMembers.length > 0 ){
            for(Participant c: teamMembers){
                for (Obstracle o: obstracles){
                    o.doIt(c);
                    if(!c.isOnDistance()) break;
                }
            }
        }else {
            System.out.println("Нет участников в команде");
        }
    }
}
