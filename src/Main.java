import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Footballer[] team = new Footballer[5];
        team[0] = new Footballer("32366907L", "Lewis", 22, 5);
        team[1] = new Footballer("34836520F", "George", 22, 7);
        team[2] = new Footballer("73545089J", "Michael", 29, 3);
        team[3] = new Footballer("89050044R", "Alex", 25, 1);
        team[4] = new Footballer("53309108F", "Jim", 25, 0);

        System.out.println("SORTED DNI");
        System.out.println("---------------------------------------------------");

        Arrays.sort(team);
        for (int i = 0; i < team.length; i++){
            System.out.print(team[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("SORTED BY NAME");
        System.out.println("---------------------------------------------------");

        Arrays.sort(team, new CompareNames());
        for (int i = 0; i < team.length; i++){
            System.out.print(team[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("SORTED BY AGE");
        System.out.println("---------------------------------------------------");

        Arrays.sort(team, new CompareAges());
        for (int i = 0; i < team.length; i++){
            System.out.print(team[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("SORTED BY AGE AND NAME");
        System.out.println("---------------------------------------------------");

        Arrays.sort(team, new CompareAgesAndNames());
        for (int i = 0; i < team.length; i++){
            System.out.print(team[i]);
        }
    }
}