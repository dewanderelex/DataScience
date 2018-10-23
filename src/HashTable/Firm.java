package HashTable;

public class Firm {
    private int id;
    private String name;
    private double totaLNetBenefit;
    private double totalNetCost;
    private double marginalCost;
    private double marginalBenefit;

    public Firm(int id, String name, double totaLNetBenefit, double totalNetCost, double marginalCost, double marginalBenefit) {
        this.id = id;
        this.name = name;
        this.totaLNetBenefit = totaLNetBenefit;
        this.totalNetCost = totalNetCost;
        this.marginalCost = marginalCost;
        this.marginalBenefit = marginalBenefit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotaLNetBenefit() {
        return totaLNetBenefit;
    }

    public void setTotaLNetBenefit(double totaLNetBenefit) {
        this.totaLNetBenefit = totaLNetBenefit;
    }

    public double getTotalNetCost() {
        return totalNetCost;
    }

    public void setTotalNetCost(double totalNetCost) {
        this.totalNetCost = totalNetCost;
    }

    public double getMarginalCost() {
        return marginalCost;
    }

    public void setMarginalCost(double marginalCost) {
        this.marginalCost = marginalCost;
    }

    public double getMarginalBenefit() {
        return marginalBenefit;
    }

    public void setMarginalBenefit(double marginalBenefit) {
        this.marginalBenefit = marginalBenefit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totaLNetBenefit=" + totaLNetBenefit +
                ", totalNetCost=" + totalNetCost +
                ", marginalCost=" + marginalCost +
                ", marginalBenefit=" + marginalBenefit +
                '}';
    }
}
