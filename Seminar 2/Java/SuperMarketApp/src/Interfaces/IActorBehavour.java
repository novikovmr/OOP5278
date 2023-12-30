package Interfaces;

import Classes.Actor;

public interface IActorBehavour {
    public boolean isMakeOrder();

    public boolean isTakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);

    public Actor getActor();
}
