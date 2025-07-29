package Practice;

enum InterestType{
    HOME,
    Personal,
    Car
}

class Banks{
    float interestRate(){
        return 5.0f;
    }
    float interestRate(InterestType interestType){
        if (interestType==InterestType.Car)
            return 7.0f;
        else if (interestType==InterestType.Personal)
            return 8.0f;
        else if (interestType==InterestType.HOME)
            return 4.0f;
        return 5.0f;
    }
}
class HDFC extends Banks{
    @Override
    float interestRate() {
        return 3.5f;
    }
}
class SBI extends Banks{
    @Override
    float interestRate() {
        return 4.5f;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Banks bank1 = new HDFC();
        Banks bank2 = new SBI();
        Banks bank3 = new Banks();

        System.out.println(bank1.interestRate());
        System.out.println(bank2.interestRate());
        System.out.println(bank3.interestRate());
    }
}
