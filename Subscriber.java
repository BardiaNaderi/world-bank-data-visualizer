public class Subscriber implements Observer {

    private String name;
    private Publisher analysis = new Publisher();

    public Subscriber(String name){
        super();
        this.name = name;
    }

    @Override
    public void update(){
        // this is just an example for something we would eventually check between the different analysis' and add or remove viewers from the list        
        if(analysis.name.equals("Mortality vs GDP")){
            System.out.println("Pie chart is not available.");
        }
    }

    @Override
    public void subscribePublisher(Publisher an){
        analysis = an;
    }
    
}
