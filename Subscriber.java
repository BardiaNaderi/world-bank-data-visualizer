public class Subscriber implements Observer {

    private String name;
    private Analysis analysis = new Analysis();

    public Subscriber(String name){
        super();
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println(analysis.name + " analysis has been selected.");
    }

    @Override
    public void subscribeAnalysis(Analysis an){
        analysis = an;
    }
    
}
