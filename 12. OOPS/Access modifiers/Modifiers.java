public class Modifiers{
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "om gajera";
        System.out.println(myAcc.username);
        myAcc.setPassword("omgajera");
    }
}






class BankAccount {
    public String username ;
    private String password;
    //aa public function thi tme password change kari sko pan ene access sna kari sko karan ke e private che ane ena class thi bar access na thy ske 
    public void setPassword(String pwd){
        password = pwd;

    }
}