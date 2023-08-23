package academy.devdojo.maratonajava.javacore.Competition.service;

import academy.devdojo.maratonajava.javacore.Competition.domainTwo.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "Starting to deliver emails..");

        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retriveEmail();
                if (email == null)
                    continue;
                System.out.println(threadName + "Email sent to:" + email);
                Thread.sleep(2000);
                System.out.println(threadName + "Email successfully sent to"+email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("All email send successfully");
    }

}
