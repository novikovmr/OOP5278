package Classes;

import Interfaces.IActorBehavour;
import Interfaces.IQueueBehavour;
import Interfaces.ImarketBehavour;

import java.util.ArrayList;
import java.util.List;

public class Market implements ImarketBehavour, IQueueBehavour {
    // Поля, создаем список "Очередь"
    private List<IActorBehavour> queue;
    private List<IActorBehavour> ClientList;

    // Конструктор
    public Market() {
        this.queue = new ArrayList<IActorBehavour>();
        this.ClientList = new ArrayList<IActorBehavour>();
    }

    // Методы

    // Метод, печатающий список клиентов
    public void PrintClients() {
        for (IActorBehavour actor : ClientList) {
            if (actor.getActor().getRole() == "Promotional Client") {
                System.out.println(actor.getActor().getName() + ". Категория: " + actor.getActor().getRole()
                        + ". Учавствует в акции: " + PromotionalClient.getPromoName());
            } else {
                System.out.println(actor.getActor().getName() + ". Категория: " + actor.getActor().getRole());
            }

        }
    }

    // Метод, подсчитывающий кол-во акционных клиентов
    public void PromoClientCount() {
        System.out.println("Количество акционных клиентов: " + PromotionalClient.promoCounter);
    }

    @Override
    public void accessToMarket(IActorBehavour actor) {
        this.ClientList.add(actor); // Добавляем клиентов в список, для последующей печати списка клиентов.
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        // Занимаем очередь
        takeInQueue(actor);
    }

    // Метод, описывающий очередь
    @Override
    public void takeInQueue(IActorBehavour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (IActorBehavour actor : queue) {
            if (actor.getActor().isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (IActorBehavour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (IActorBehavour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

}
