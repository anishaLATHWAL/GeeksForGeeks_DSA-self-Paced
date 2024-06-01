public class KthSetOrNot {
    static void isSet(int n,int k){
        int x= (1<<(k-1));
        if((n&x) !=0 ){
            System.out.println("Bit is set");
        }
        else{
            System.out.println("Bit is not Set");
        }
    }
    public static void main(String[] args){
        isSet(5,3);
    }
}
