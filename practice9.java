// Write a function that takes in age as input and returns
//  if that person is eligible
//  to vote or not.A person of age > 18 is eligible to vote
import java.util.Scanner;
public class practice9 {
    public static boolean isVoter(int n){
        if(n>18){
            return true; 
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isVoter(n));
    }
}
