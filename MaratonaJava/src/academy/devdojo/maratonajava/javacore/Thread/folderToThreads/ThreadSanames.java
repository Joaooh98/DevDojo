package academy.devdojo.maratonajava.javacore.Thread.folderToThreads;

import java.util.ArrayList;
import java.util.List;

public class ThreadSanames{

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