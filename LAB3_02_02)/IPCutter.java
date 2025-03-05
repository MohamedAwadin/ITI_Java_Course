public class IPCutter {
    public static void main(String[] args) {
        
        String ip = args[0];
        String ipParts[] = ip.split("\\.");
        for(String part : ipParts) {
            System.out.println(part);
        }
    }   
    
}

