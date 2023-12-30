package Classes;

import Interfaces.IActorBehavour;

public class TaxInspector implements IActorBehavour {
    // Поля
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private String role = "Tax Inspector";

    // Конструктор
    public TaxInspector(String name) {
        this.name = "Налоговый инспектор";
    }

    // Методы

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        return isTakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        // TODO Auto-generated method stub
        this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        // TODO Auto-generated method stub
        this.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        return new OrdinaryClient("Тайный покупатель", 4);
    }

}
