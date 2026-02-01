package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;

        System.out.println("입금완료. 잔액=" + balance);
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족!!! 잔액=" + balance);
        } else {
            balance -= amount;
            System.out.println("출금완료. 잔액=" + balance);
        }
    }
}
