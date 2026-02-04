package java17;

//sealed classes

public sealed class Banking permits SavingsBank {
}
final class SavingsBank extends Banking{

}
//class CurrentBank extends Banking{         //gives error as not permitted
//
//}

record Transaction(int id,String name,float amount){
}
//no getter setter required
class TransactionMain{
    public static void main(String[] args) {
        Transaction transaction1=new Transaction(1001,"payment for prodcut",25000);
        Transaction transaction2=new Transaction(1001,"payment for prodcut",25000);
        System.out.println(transaction1);

        System.out.println(transaction1.id());
        System.out.println(transaction1.name());
        System.out.println(transaction1.amount());
        System.out.println(transaction1.equals(transaction2));
        System.out.println(transaction1.hashCode());
        System.out.println(transaction2.hashCode());

    }
}