public interface Store {
    // регистрация клиента
    public void register(Customer customer);
    // удаление клиента
    public void remove(Customer customer);
    // получить клиента по id
    public Customer getCustomer(int id);
}
