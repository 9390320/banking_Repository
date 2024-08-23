public class Account {
    long accno;
    String name;
    float bal;

    public Account() {
    }

    public Account(long accno, String name, float bal) {
        this.accno = accno;
        this.name = name;
        this.bal = bal;
    }

    void deposit(float amt) {
        this.bal = this.bal + amt;
        System.out.println("RS." + amt + " Credited | Balance:" + this.bal);

    }

    void withdraw(float amt) {
        if (this.bal >= amt) {
            this.bal = this.bal - amt;
            System.out.println("RS." + amt + " Debited | Balance:" + this.bal);
        } else {
            System.out.println("ERROR : Insufficient Balance");
        }
    }

    void getBalance() {
        System.out.println("A/C No:" + this.accno + " | NAME:" + this.name + " | Balance:" + this.bal);
    }
}








