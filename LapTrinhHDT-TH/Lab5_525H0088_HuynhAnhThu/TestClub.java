public class TestClub {
    public static void main(String[] args) {
        Club defaultClub = new Club();
        System.out.println("Default: " + defaultClub.toString());

        Club barca = new Club("Barcalona FC", 0, 2, 5);
        System.out.println("Barcalona FC: " + barca.toString());

        Club copiedClub = new Club(barca);
        copiedClub.setName("Real Madrid");
        copiedClub.setWins(6);
        copiedClub.setDraws(0);
        copiedClub.setLosses(0);

        System.out.println("Name: " + copiedClub.getName());
        System.out.println("Wins: " + copiedClub.getWins());
        System.out.println("Draws: " + copiedClub.getDraws());
        System.out.println("Losses: " + copiedClub.getLosses());
        
        System.out.println("Matches played: " + copiedClub.numMatchesPlayed());
        System.out.println("Is finished: " + copiedClub.isFinish());
        System.out.println("Points: " + copiedClub.getPoints());
        System.out.println("Copied club: " + copiedClub.toString());
    }
}