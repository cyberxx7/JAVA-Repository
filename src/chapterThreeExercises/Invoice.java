package chapterThreeExercises;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantityOfItemPurchased;
    private double pricePerPoint;

    public Invoice (String partNumber, String partDescription, int quantityOfItemPurchased, double pricePerPoint){

    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartNumber(){
        return partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public String getPastDescription(){
        return partDescription;
    }
    public void setQuantityOfItemPurchased(int qualityOfItemPurchased){
        this.quantityOfItemPurchased = qualityOfItemPurchased;
    }

    public int getquantityOfItemPurchased(){
        return quantityOfItemPurchased;
    }
    public void setPricePerPoint(int pricePerPoint){
        this.pricePerPoint = pricePerPoint;

    }
    public double getPricePerPoint(){
        return pricePerPoint;
    }



}

