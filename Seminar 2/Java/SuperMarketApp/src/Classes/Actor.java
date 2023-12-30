package Classes;

import Interfaces.IActorBehavour;
import Interfaces.iReturnOrder;

public abstract class Actor implements IActorBehavour, iReturnOrder {
    // Поля
    protected String name;
    protected String role;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

    // Конструктор
    public Actor(String name) {
        this.name = name;
    }

    // Методы
    public abstract String getName();

    public abstract String getRole();

    public abstract void setName(String name);

}
