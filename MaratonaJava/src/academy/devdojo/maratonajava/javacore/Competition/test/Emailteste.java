package academy.devdojo.maratonajava.javacore.Competition.test;

import javax.swing.JOptionPane;

import academy.devdojo.maratonajava.javacore.Competition.domainTwo.Members;
import academy.devdojo.maratonajava.javacore.Competition.service.EmailDeliveryService;


public class Emailteste {
    public static void main(String[] args) {
        var members = new Members();
        var jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        var kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
        jiraya.start();
        kakashi.start();

        while (true) {
            String email = JOptionPane.showInputDialog("enter with your email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.add(email);
        }
    }
}
