public class IPCutter {
    public static void main(String[] args) {
        
        int countDot = 0;
        char dot = '.';
        int dotIndex = 0;
        String ip = args[0];
        String part = new String();
        String saveIP = ip;
        
        for (int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == dot) {
                countDot++;
            }
        }
        System.out.println("Count of Dot : " + countDot);
        
        int startIndex = 0;
        for (int i = 0; i < countDot; i++) {
            dotIndex = ip.indexOf(dot, startIndex);
            part = ip.substring(startIndex, dotIndex);
            System.out.println(part);
            startIndex = dotIndex + 1;
        }
        System.out.println(ip.substring(startIndex));
    }   
    
}

