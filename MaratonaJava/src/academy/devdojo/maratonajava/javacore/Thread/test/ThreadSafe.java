package academy.devdojo.maratonajava.javacore.Thread.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSanames{

    private final List<String> names = new ArrayList<>();

    public synchronized void add (String name){
        names.add(name);
    }
    
    public synchronized void removeFirst (){
        if (names.size() > 0 ) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
    
}
public class ThreadSafe {
    public static void main(String[] args) {
        var threadSanames = new ThreadSanames();
        threadSanames.add("Junkrat");
        Runnable r = threadSanames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
