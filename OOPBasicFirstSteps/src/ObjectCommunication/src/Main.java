import logger.CombatLogger;
import logger.LogType;

public class Main {
    public static void main(String[] args) {
        CombatLogger logger = new CombatLogger();
        logger.handle(LogType.ATTACK,"attack");
    }
}
