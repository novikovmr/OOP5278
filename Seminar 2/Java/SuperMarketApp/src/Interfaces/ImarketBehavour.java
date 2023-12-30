package Interfaces;

import Classes.Actor;
import java.util.List;

public interface ImarketBehavour {
    public void accessToMarket(IActorBehavour actor);

    public void releaseFromMarket(List<Actor> actors);

    public void update();
}
