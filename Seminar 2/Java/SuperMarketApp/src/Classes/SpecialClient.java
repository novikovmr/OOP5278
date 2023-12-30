package Classes;

public class SpecialClient extends Actor {
    // Поле
    private int vipId;
    private String role = "Special Client";

    // Конструктор
    public SpecialClient(String name, int vipId) {
        super(name);
        this.vipId = vipId;
    }

    // Методы

    @Override
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
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
