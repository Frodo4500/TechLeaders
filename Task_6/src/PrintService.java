public class PrintService {
    PrintService(FightLog fightLog) {
        for (int i = 0; i < fightLog.list.size(); i++) {
            System.out.println(fightLog.list.get(i));
        }
    }
}
