package ru.rybinskov.ideas4transfer.domain.orderFactory;

import ru.rybinskov.ideas4transfer.domain.order.*;
import java.time.LocalDateTime;

public class ExpressFactory implements OrderFactory {

    @Override
    public Order createOrder(Long id, String sender, String receiver, LocalDateTime created, OrderStatus orderStatus, Long userId) {
        return new ExpressDeliveryOrder(id, sender, receiver, created, orderStatus, userId);
    }
}
