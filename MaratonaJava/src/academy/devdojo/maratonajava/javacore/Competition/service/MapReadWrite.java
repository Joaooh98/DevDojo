package academy.devdojo.maratonajava.javacore.Competition.service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl){
        this.rwl = rwl;
    }

    public void put(String key, String value){
        rwl.writeLock().lock();
        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s obteve o WRITE lock%n",Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> allKeys(){
        rwl.readLock().lock();
        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}
