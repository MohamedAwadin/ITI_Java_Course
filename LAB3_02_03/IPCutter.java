import java.util.StringTokenizer;

public class IPCutter {
    public static void main(String[] args) {
        
        String ip = args[0];
        StringTokenizer ipParts = new StringTokenizer(ip, ".");
        while (ipParts.hasMoreTokens()) {
            System.out.println(ipParts.nextToken());
        }
    }   
    
}

