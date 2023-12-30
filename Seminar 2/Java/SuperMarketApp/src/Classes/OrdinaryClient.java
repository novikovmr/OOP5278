package Classes;

public class OrdinaryClient extends Actor {

    // Поле
    private int number;
    private String role = "Ordinary Client";

    // Конструктор
    public OrdinaryClient(String name, int number) {
        super(name);
        this.number = number;
    }

    // Методы
    @Override
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor getActor() {
        return this;
    }

    // Перезапись геттеров, сетторов
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    @Override
    public boolean IsReturnOrder() {
        // TODO Auto-generated method stub
        return super.isReturnOrder;
    }

    public void setReturnOrder(boolean val) {
        super.isReturnOrder = val;
    }

}
