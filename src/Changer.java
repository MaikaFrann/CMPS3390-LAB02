public class Changer {
    private double change;
    private int[] cValues;
    private String[] cNamesPlural;
    private String[] cNamesSingular;


    public Changer(double purchaseAmount, double paymentAmount, double tolerance){
        this.change = (paymentAmount * 100) - (purchaseAmount * 100) + tolerance;

        cValues = new int[]{5000, 2000, 1000, 500, 100, 25, 10, 5, 1};
        cNamesPlural = new String[]{
                "Fifties", "Twenties", "Tens", "Fives", "Ones",
                "Quarters", "Dimes", "Nickels", "Pennies"
        };
        cNamesSingular = new String[]{
                "Fifty", "Twenty", "Ten", "Five", "One",
                "Quarter", "Dime", "Nickel", "Penny"
        };
    }

    public void printChange(){
        for(int i=0; i<cValues.length; i++){
            int count;

            if(change >= cValues[i]){
                count = (int)change / cValues[i];
                if(count == 1){
                    System.out.println(count + " " + cNamesSingular[i]);
                } else
                System.out.println(count + " " + cNamesPlural[i]);
                change -= (count * cValues[i]);
            }
        }
    }

}
