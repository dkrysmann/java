package constants;

import java.util.Arrays;
import java.util.HashSet;

public class EntityConstants {
    public static final HashSet<String> FACTIONS = new HashSet<>(
            Arrays.asList(new String[]{"NEUTRAL", "ENEMY", "ALLY", "PLAYER"})
    );

    public static final String PLAYER_FACTION = "PLAYER";
    public static final String ENEMY_FACTION = "ENEMY";
    public static final String ALLY_FACTION = "ALLY";
    public static final String NEUTRAL_FACTION = "NEUTRAL";
}
