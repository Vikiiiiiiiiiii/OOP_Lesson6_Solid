package solid.isp;

public interface Payable {
    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);
}
/* Решение:
 * Мы можем от интерфейса Payable наследовать три отдельных интерфейса 
 * для платежей через вэб-монеу, кредитную карту и телефонного номера.
 * В эти представленные классы имплементировать уже только нужные интерфейсы. 
 */