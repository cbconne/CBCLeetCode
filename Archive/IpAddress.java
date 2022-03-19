import java.util.ArrayList;
import java.util.List;

public class IpAddress {
    public static void main(String[] arg) {
        System.out.println(restoreIpAddresses("25525511135"));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder ip = new StringBuilder();
        int l = s.length();
        for (int i = 0; i < Math.min(3, l - 3); i++) {
            for (int j = i + 1; j < Math.min(i + 4, l - 2); j++) {
                for (int k = j + 1; k < Math.min(j + 4, l - 1); k++) {
                    if (l - 1 - k > 3) {
                        continue;
                    }
                    int a = Integer.parseInt(s.substring(0, i+1));
                    int b = Integer.parseInt(s.substring(i+1, j+1));
                    int c = Integer.parseInt(s.substring(j+1, k+1));
                    int d = Integer.parseInt(s.substring(k+1, l));
                    if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {
                        ip.append(a).append(".").append(b).append(".").append(c).append(".").append(d);
                    }
                    if(ip.length() ==s.length()+3){
                        result.add(ip.toString());
                    }
                    ip.delete(0,ip.length());
                }
            }
        }
        return result;
    }
}