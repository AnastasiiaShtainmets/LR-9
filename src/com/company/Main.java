package com.company;

public class Main {

    public static void main(String[] args) {

        Immovable palette = new Immovable("RevolutionPro", 15, 9);
        customer Mila = new customer("квартиру", 150, 15, "Мила", "1651");
        Mila.cust();
        customer2 Turik=new customer2("пылесос",1500,25,"Турик","98615");
        Turik.cust2();
        customer3 Lerik=new customer3("Мерседес",1000,5,"Лерик","98656");
        Lerik.cust3();
    }
}
interface Product{
    void ProductName();
    void price();
    void rating();

}

class Immovable implements Product{
    String firm;
    int cena;
    int rait;
    Immovable(String firm, int cena, int rait){
        this.firm=firm;
        this.cena=cena;
        this.rait=rait;
    }

    public void ProductName(){

        System.out.println(firm);
    }

    public void price(){

        System.out.println(cena);
    }

    public void rating(){

        System.out.println(rait);
    }
}
class Immovables implements Product{
    String appliances;
    int cena1;
    int raiti1;
    Immovables( String appliances,int cena1,int raiti1){
        this.appliances=appliances;
        this.cena1=cena1;
        this.raiti1=raiti1;
    }
    public void ProductName(){

        System.out.println(appliances);
    }

    public void price(){

        System.out.println(cena1);
    }

    public void rating(){

        System.out.println(raiti1);
    }
}
class Transport implements Product{
    String car;
    int cena2;
    int raiti2;
    Transport(String car,int cena2,int raiti2){
        this.car=car;
        this.cena2=cena2;
        this.raiti2=raiti2;
    }
    public void ProductName(){

        System.out.println(car);
    }

    public void price(){

        System.out.println(cena2);
    }

    public void rating(){

        System.out.println(raiti2);
    }
}
interface userss{
    void loginn();
    void passs();
}

class customer implements userss, Product{
    String housing;
    int cena1;
    int rait1;
    String login;
    String pass;

    customer(String housing, int cena1, int rait1, String login, String pass){
        this.housing=housing;
        this.cena1=cena1;
        this.rait1=rait1;
        this.login=login;
        this.pass=pass;
    }

    public void ProductName(){

        System.out.println(housing);
    }
    public void rating(){

        System.out.println(rait1);
    }
    public void price(){

        System.out.println(cena1);
    }

    public void loginn(){

        System.out.println(login);
    }
    public void passs(){

        System.out.println(pass);
    }
    public void cust(){

        System.out.println("User name: "+login + " покупает " + housing);
    }
}
class customer2 implements userss,Product{
    String appliances;
    int cena1;
    int raiti1;
    String login;
    String pass;
    customer2(String appliances,int cena1,int raiti1,String login,String pass){
        this.appliances=appliances;
        this.cena1=cena1;
        this.raiti1=raiti1;
        this.login=login;
        this.pass=pass;
    }
    public void ProductName(){

        System.out.println(appliances);
    }

    public void price(){

        System.out.println(cena1);
    }

    public void rating(){

        System.out.println(raiti1);
    }
    public void loginn(){

        System.out.println(login);
    }
    public void passs(){

        System.out.println(pass);
    }
    public void cust2(){

        System.out.println("User name: "+login + " покупает " + appliances);
    }
}
class customer3 implements userss,Product{
    String car;
    int cena2;
    int raiti2;
    String login;
    String pass;
    customer3(String car, int cena2,int raiti2,String login,String pass){
        this.car=car;
        this.cena2=cena2;
        this.raiti2=raiti2;
        this.login=login;
        this.pass=pass;
    }
    public void ProductName(){

        System.out.println(car);
    }

    public void price(){

        System.out.println(cena2);
    }
    public void rating(){

        System.out.println(raiti2);
    }
    public void loginn(){

        System.out.println(login);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void cust3(){

        System.out.println("User name: "+login + " покупает " + car);
    }
}