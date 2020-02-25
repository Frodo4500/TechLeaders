public class Main {

    public static void main(String[] args) {
        Unit player1 = new Unit();
        Unit player2 = new Unit();
        player1.createUnit("Tramp", 66, -999);
        player2.createUnit("Putin", 999, 0);
        FightService arena = new FightService(player1, player2);
        PrintService printService = new PrintService(arena.startFight());
    }
}