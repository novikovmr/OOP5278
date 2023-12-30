package Interfaces;

public interface IQueueBehavour {
    public void takeInQueue(IActorBehavour actor);

    public void releaseFromQueue();

    public void takeOrder();

    public void giveOrder();
}
