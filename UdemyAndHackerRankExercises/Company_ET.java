package UdemyAndHackerRankExercises;

public class Company_ET extends Company {
    public Company_ET(String name, String date, String code, String ownerName, double startingFund, double currentFund) {
        super(name, date, code);

        this.ownerName = ownerName;
        this.startingFund = startingFund;
        this.currentFund = currentFund;
    }

    private String ownerName;
    private double startingFund;
    private double currentFund;


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getStartingFund() {
        return startingFund;
    }

    public void setStartingFund(double startingFund) {
        this.startingFund = startingFund;
    }

    public double getCurrentFund() {
        return currentFund;
    }

    public void setCurrentFund(double currentFund) {
        this.currentFund = currentFund;
    }

    public double profit() {
        return this.currentFund - this.startingFund;
    }


    public static void main(String[] args) {


        Company company1 = new Company("Coca-Cola", "12.04.1999", "42141");
        Company company2 = new Company("Tesla", "09.08.2009", "543643412141");
        Company_ET company3 = new Company_ET("Nike", "12.07.1990", "52353", "Johnny", 4000, 10000);

        if (company2.getCode().length() > 10) {
            System.out.println("The code is above 10!");
        }

        System.out.println(company3.profit());


    }


}
