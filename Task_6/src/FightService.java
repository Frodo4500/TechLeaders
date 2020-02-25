public class FightService {
    Unit player1;
    Unit player2;
    private boolean detectorWhoHits = true;

    FightService(Unit player1, Unit player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public FightLog startFight(){
        int healthPlayer1 = player1.getHealth();
        int healthPlayer2 = player2.getHealth();
        FightLog fightLog = new FightLog();

        do{
            if(detectorWhoHits){
                healthPlayer1 = healthPlayer1 - player2.getForce();
                writeToTheLog(player1,healthPlayer1,fightLog);
            }
            else{
                healthPlayer2 = healthPlayer2 - player1.getForce();
                writeToTheLog(player2,healthPlayer2,fightLog);
            }
            changeMove();
        }while (healthPlayer1 > 0 && healthPlayer2 > 0);
        determineTheWinner(healthPlayer1, healthPlayer2, fightLog);
        return fightLog;
    }

    private void writeToTheLog (Unit player, int balanceHealth, FightLog fightLog){
        fightLog.list.add("Боец:" + player.getName() + " получил урон и его здоровье упало до " + balanceHealth);
    }

    private void determineTheWinner(int healthPlayer1, int healthPlayer2, FightLog fightLog) {
        if(healthPlayer1 == healthPlayer2){
            fightLog.list.add("Победила дружба =)");
        }
        else{
            if (healthPlayer1 >= 0){ fightLog.list.add("Победитель: " + player1.getName()); }
            else{ fightLog.list.add("Победитель: " + player2.getName()); }
        }
    }

    private void changeMove(){
        detectorWhoHits = !detectorWhoHits;
    }
}
