package fr.ubx.poo.ugarden.go.decor;

import fr.ubx.poo.ugarden.game.Position;
import fr.ubx.poo.ugarden.go.personage.Player;

public class Flowers extends Decor {
    public Flowers(Position position) {
        super(position);
    }

    public boolean walkableBy(Player player) {
        return false;
    }
}
