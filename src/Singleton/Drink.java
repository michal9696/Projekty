package Singleton;
class Ingredient{
    private int zzz;
    private String AAA;
    private String BBB;
    private String CCC;
    private double aaa;
    private double bbb;
    private double ccc;
    public Ingredient (String AAA,double aaa,String BBB,double bbb,String CCC,double ccc,int zzz) {
        this.AAA = AAA;
        this.aaa=aaa;
        this.BBB = BBB;
        this.bbb=bbb;
        this.CCC = CCC;
        this.ccc=ccc;
        this.zzz=zzz;
    }
    public int getZzz(){
        return  this.zzz;
    }
    public double getAaa(){
        return this.aaa;
    }
    public double getBbb(){
        return this.bbb;
    }
    public double getCcc(){
        return this.ccc;
    }
    public void setZzz(int zzz){
        this.zzz=zzz;
    }
    public void setAaa(double aaa){
        this.aaa=aaa;
    }
    public void setBbb(double bbb){
        this.bbb=bbb;
    }
    public void setCcc(double ccc){
        this.ccc=ccc;
    }
    public String getAAA(){
        return this.AAA;
    }
    public String getBBB(){
        return this.BBB;
    }
    public String getCCC(){
        return this.CCC;
    }
    public void setAAA(String AAA){
        this.AAA=AAA;
    }
    public void setBBB(String BBB){
        this.BBB=BBB;
    }
    public void setCCC(String CCC){
        this.CCC=CCC;
    }
        public void drinkComposition(){
            System.out.println("Skladniki drinka to "+this.AAA+" , "+this.BBB+" , "+this.CCC);
            System.out.println("W proporcjach "+this.aaa+" , "+this.bbb+" , "+this.ccc);
            System.out.println("Pojemnosc drinka: "+this.zzz);
        }
    }

public class Drink{
    public static void main(String[]args){
        Ingredient ing=new Ingredient("Sok ananasowy",0.40,"Likier malibu",0.20,"Mleko kokosowe",0.40, 250);
        ing.drinkComposition();
    }
}
