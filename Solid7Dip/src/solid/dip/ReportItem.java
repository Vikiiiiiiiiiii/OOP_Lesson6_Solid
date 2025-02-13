package solid.dip;

public class ReportItem{
    private String description;
    private float amount;

    public ReportItem(String description, float amount){
        this.description = description;
        this.amount = amount;
    }
    public String getDescription(){
        return description;
    }
    public float getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return "ReportItem{"+
                "description='"+ description + "\'" + 
                " , amount=" + amount +
                '}';

    }
}