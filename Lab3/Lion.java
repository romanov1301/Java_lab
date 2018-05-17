package ua.iot.io;

public class Lion extends Animal  {

    public double sizeCavern;

    public Lion(String species, double sizeCavern, int age) {
        super(species, age);
        setSizeCavern(sizeCavern);

    }
     public String toCSV(){
        return super.toCSV()+ ", "+String.valueOf(getSizeCavern());

     }
     public String getHeders(){
        return super.getHeders()+ ", sizeCavern";
     }



    public void setSizeCavern(double sizeCavern) {
        this.sizeCavern = sizeCavern;
    }

    public double getSizeCavern(){
            return sizeCavern;
    }

    @Override
    public String toString(){
            return super.toString()+", sizeCavern = " + sizeCavern;
    }
}




