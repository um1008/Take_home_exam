
public class Main {

    public static void main(String[] args) {
        WorkManager publisher = new WorkManager();
        Worker subscribers = new Worker(1);
        
        publisher.registerObserver(subscribers);
        
        WorkItem item1 = new WorkItem(1, 1, "\"Needs to complete this\"");
        
        publisher.notify(item1);
        
        WorkItem item3 = new WorkItem(3, 1, "\"Needs to complete this\"");
       
        publisher.notify(item3);
        
        WorkItem item5 = new WorkItem(5, 1, "\"Needs to complete this\"");
        
        publisher.notify(item5);

    }
}
