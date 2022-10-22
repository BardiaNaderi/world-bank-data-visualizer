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
        if(analysis.name.equals("Mortality vs GDP")){
            System.out.println("Pie chart is not available.");
        }
    }

    @Override
    public void subscribeAnalysis(Analysis an){
        analysis = an;
    }
    
}
