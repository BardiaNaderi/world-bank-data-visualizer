import java.util.ArrayList;
import java.util.List;

public class Analysis implements Subject{
    String name;
    private List<Subscriber> subs = new ArrayList<>();

    @Override
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    @Override
    public void notifySubs(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }

    @Override
    public void select(String name){
        this.name = name;
        notifySubs();
    }
}
