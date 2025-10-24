package main.model.entities;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import main.model.enums.OrderStatus;

public class Order {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private ZonedDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Client client) {
        this.moment = ZonedDateTime.now();
        this.status = OrderStatus.PROCESSING;
        this.client = client;
    }

    public ZonedDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void addItem (OrderItem Item){
        orderItems.add(Item);
    }

    public void removeItem (OrderItem Item){
        orderItems.remove(Item);
    }

    public double total(){
        double sum = 0.0;

        for (OrderItem item : orderItems) {
            sum += item.subTotal();
        }

        return sum;
    }

    public String toString() {
		StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + this.getMoment().format(formatter) + "\n");
		sb.append("Order status: " + this.getStatus() + "\n");
		sb.append("Client: " + this.client.toString() + "\n");
		sb.append("Order items:" + "\n");
		for (OrderItem item : orderItems) {
            sb.append(item.getProduct().getName() + ", $" + String.format("%.2f", item.getProduct().getPrice()) + ", Quantity: " + item.getQuantity() + ", Subtotal: $" + String.format("%.2f", item.subTotal()) + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", this.total()) + "\n");
		return sb.toString();
	}
}
