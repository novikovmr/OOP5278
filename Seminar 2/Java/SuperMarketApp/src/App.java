import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.IActorBehavour;

public class App {
    public static void main(String[] args) {
        // Создаем экземпляр класса Market
        Market magnit = new Market();

        // Создаем пользователей

        Actor client1 = new OrdinaryClient("Борис", 1);
        Actor client2 = new OrdinaryClient("Ольга", 2);
        Actor client3 = new SpecialClient("Николай", 3);

        IActorBehavour client4 = new TaxInspector(null);

        IActorBehavour client5 = new PromotionalClient("Max", 100, "Купи за 100");
        IActorBehavour client6 = new PromotionalClient("Настя", 101, "Купи за 100");
        IActorBehavour client7 = new PromotionalClient("Александр", 102, "Купи за 100");
        IActorBehavour client8 = new PromotionalClient("Алексей", 103, "Купи за 100");

        // Запускаеи пользователей в магазин

        magnit.accessToMarket(client1);
        magnit.accessToMarket(client2);
        magnit.accessToMarket(client3);
        magnit.accessToMarket(client4);
        magnit.accessToMarket(client5);
        magnit.accessToMarket(client6);
        magnit.accessToMarket(client7);
        magnit.accessToMarket(client8);

        // Запускаем процессс приобритения и покидания магазина пользователями
        magnit.update();

        // Вывод списка клиентов

        System.out.println("__________________");
        magnit.PrintClients();
        System.out.println("__________________");

        // Проводим подсчет акционных клиентов
        magnit.PromoClientCount();

    }
}
