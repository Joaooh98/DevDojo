package academy.devdojo.maratonajava.javacore.Thread.test;

import academy.devdojo.maratonajava.javacore.Thread.domain.Account;

public class ThreadsAccount implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        var threadsAccount = new ThreadsAccount();
        var tOne = new Thread(threadsAccount, "May");
        var tTwo = new Thread(threadsAccount,"John");

        tOne.start();
        tTwo.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("fuck");
            }
        }
    }
    //synchronized mostra que isso e um metodo sincronizado, nenhuma outra thread pode executar enquando ela estiver sendo executada
    private synchronized void withdrawl(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + "Esta indo sacar o dinheiro");
            account.withdrawl(amount);
            System.out.println(Thread.currentThread().getName()
                    + "poder retirar o dinheiro, saldo atual em sua conta e: " + account.getBalance());
        } else {
            System.out.println("sem dinheiro para " + getThreadName() + " efetuar o saque seu saldo e: " + account.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

}
