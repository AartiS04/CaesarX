import java.util.*;
public class CaesarX {
    public static String encrypt(String text,int shift) {
        StringBuilder res=new StringBuilder();
        for(char c:text.toCharArray()) {
            if(Character.isLetter(c)) {
                char base=Character.isUpperCase(c)?'A':'a';
                res.append((char)((c-base+shift)%26+base));
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static String decrypt(String text,int shift) {
        return encrypt(text,26-(shift%26));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text=sc.nextLine();
        System.out.print("Enter shift value: ");
        int shift=sc.nextInt();
        System.out.println("What do you want to perform?");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        int choice=sc.nextInt();
        if(choice==1) {
            String enctxt=encrypt(text,shift);
            System.out.println("Encrypted: "+enctxt);
        } else if(choice==2) {
            String decrytxt=decrypt(text,shift);
            System.out.println("Decrypted: "+decrytxt);
        } else{
            System.out.println("Sorry!! Wrong option.. ");
        }
        sc.close();
    }
}
