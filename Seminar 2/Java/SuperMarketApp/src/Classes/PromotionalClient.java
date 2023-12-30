package Classes;

public class PromotionalClient extends Actor {
    // Поля
    private int promoId;
    // Счетчик участников акции
    static int promoCounter;
    // Название акции
    private static String promoName;
    private String role = "Promotional Client";

    // Конструктор

    public PromotionalClient(String name, int promoId, String promoName) {
        super(name);
        this.promoId = promoId;
        promoCounter++;
        this.promoName = promoName;
    }

    // Методы

    @Override
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPromoId() {
        return promoId;
    }

    public void setPromoId(int promoId) {
        this.promoId = promoId;
    }

    public static int getPromoCounter() {
        return promoCounter;
    }

    public void setPromoCounter(int promoCounter) {
        this.promoCounter = promoCounter;
    }

    public static String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
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
