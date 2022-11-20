package HomeWork1;

public class Team {
    String teamName;
    Participant[] teamMembers = new Participant[4];


    public Team ( String teamName, Participant[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;

    }

    public String getTeamName() {
        return "Team name: " + teamName;
    }

    public Participant[] getTeamMembers() {
        return teamMembers;
    }
    public void showResult(){
        for(Participant c: teamMembers){
            c.showResult();
        }
    }
    public void showMembersFinishedCourse(){
        for(Participant c: teamMembers){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}
