package String_Buffer;
import java.util.Random;

public class Random_string {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<size;i++) {
            char ch = (char)(97 + (random.nextFloat()*26));
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
