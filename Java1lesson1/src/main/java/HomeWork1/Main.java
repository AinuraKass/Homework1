package HomeWork1;

public class Main {


    public static void main(String[] args){

    Participant[] participants = {new Cat("Барсик"), new Dog("Лесли"), new Wolf("Призрак"), new Turtle("Майки")};
    Obstracle[] obstracles = {new Cross(200), new Wall(20)};

    Team team = new Team("Winners", participants);
    System.out.println("Created team");
    System.out.println(team.getTeamName());

    System.out.println("Getting team members");
    team.showResult();

    Course course = new Course(obstracles);
    System.out.println("Team goes to course");
    course.doIt(team);

    System.out.println("Show team results:");
    team.showResult();

    System.out.println("Team members finished course");
    team.showMembersFinishedCourse();
     }
}
