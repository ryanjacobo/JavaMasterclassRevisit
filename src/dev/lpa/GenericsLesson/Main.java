package dev.lpa.GenericsLesson;

interface Player {
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}

record VolleyballPlayer(String name, String position) implements Player{}
public class Main {
    public static void main(String[] args) {
        System.out.println("--------Without Generics------");
        var philly = new Affiliation("city", "Philadelphia, PA", "US");
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        BaseballTeam astros = new BaseballTeam("Houston Astros");
//        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        System.out.println("------Using Generics--------");
        Team<FootballPlayer, String> afc = new Team("Adelaide Crows", "City of Adelaide, South Australia, in AU");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();
//        afc.addTeamMember(harper); // doesn't allow players from a different sport to be added after adding generics to Team class
        Team<FootballPlayer, Affiliation>  mfc = new Team("Manchester FC");
        var guthrie = new FootballPlayer("D Guthrie", "Center Fielder");
        mfc.addTeamMember(guthrie);
        scoreResult(afc, 3, mfc, 5);

        Team<VolleyballPlayer, Affiliation> adelaide = new Team("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s", team1, message, team2);
        System.out.printf(", Final Score: %d(%s), %d(%s) %n", t1_score, team1.getTeamName(), t2_score, team2.getTeamName());
    }
}
