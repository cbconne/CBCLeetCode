import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsMerge {
    public static void main(String[] args) {
        AccountsMerge accountsMerge = new AccountsMerge();
        String[][] accounts_l = {
                { "Lily", "Lily962@m.co", "Lily298@m.co", "Lily407@m.co", "Lily350@m.co", "Lily691@m.co", "Lily88@m.co",
                        "Lily283@m.co", "Lily447@m.co", "Lily818@m.co" },
                { "Bob", "Bob701@m.co", "Bob312@m.co", "Bob927@m.co", "Bob922@m.co", "Bob64@m.co", "Bob282@m.co",
                        "Bob324@m.co", "Bob586@m.co", "Bob934@m.co" },
                { "Alex", "Alex874@m.co", "Alex233@m.co", "Alex615@m.co", "Alex206@m.co", "Alex527@m.co",
                        "Alex570@m.co", "Alex470@m.co", "Alex316@m.co", "Alex833@m.co" },
                { "Hanzo", "Hanzo455@m.co", "Hanzo970@m.co", "Hanzo377@m.co", "Hanzo553@m.co", "Hanzo846@m.co",
                        "Hanzo831@m.co", "Hanzo998@m.co", "Hanzo831@m.co", "Hanzo867@m.co" },
                { "David", "David226@m.co", "David47@m.co", "David679@m.co", "David907@m.co", "David536@m.co",
                        "David247@m.co", "David721@m.co", "David738@m.co", "David228@m.co" },
                { "Ethan", "Ethan140@m.co", "Ethan982@m.co", "Ethan689@m.co", "Ethan749@m.co", "Ethan313@m.co",
                        "Ethan536@m.co", "Ethan230@m.co", "Ethan612@m.co", "Ethan515@m.co" },
                { "Gabe", "Gabe139@m.co", "Gabe726@m.co", "Gabe478@m.co", "Gabe100@m.co", "Gabe645@m.co",
                        "Gabe661@m.co", "Gabe422@m.co", "Gabe460@m.co", "Gabe10@m.co" },
                { "David", "David165@m.co", "David96@m.co", "David780@m.co", "David333@m.co", "David79@m.co",
                        "David70@m.co", "David694@m.co", "David812@m.co", "David45@m.co" },
                { "Bob", "Bob255@m.co", "Bob636@m.co", "Bob312@m.co", "Bob777@m.co", "Bob913@m.co", "Bob234@m.co",
                        "Bob408@m.co", "Bob783@m.co", "Bob411@m.co" },
                { "Kevin", "Kevin737@m.co", "Kevin789@m.co", "Kevin238@m.co", "Kevin346@m.co", "Kevin418@m.co",
                        "Kevin81@m.co", "Kevin402@m.co", "Kevin8@m.co", "Kevin846@m.co" },
                { "Fern", "Fern463@m.co", "Fern404@m.co", "Fern693@m.co", "Fern563@m.co", "Fern276@m.co",
                        "Fern568@m.co", "Fern90@m.co", "Fern857@m.co", "Fern248@m.co" },
                { "Lily", "Lily499@m.co", "Lily50@m.co", "Lily871@m.co", "Lily630@m.co", "Lily947@m.co", "Lily280@m.co",
                        "Lily131@m.co", "Lily165@m.co", "Lily706@m.co" },
                { "Bob", "Bob79@m.co", "Bob212@m.co", "Bob706@m.co", "Bob81@m.co", "Bob21@m.co", "Bob959@m.co",
                        "Bob61@m.co", "Bob799@m.co", "Bob417@m.co" },
                { "Lily", "Lily376@m.co", "Lily862@m.co", "Lily562@m.co", "Lily69@m.co", "Lily55@m.co", "Lily703@m.co",
                        "Lily357@m.co", "Lily576@m.co", "Lily414@m.co" },
                { "Hanzo", "Hanzo593@m.co", "Hanzo291@m.co", "Hanzo195@m.co", "Hanzo707@m.co", "Hanzo868@m.co",
                        "Hanzo985@m.co", "Hanzo322@m.co", "Hanzo348@m.co", "Hanzo148@m.co" },
                { "Fern", "Fern506@m.co", "Fern110@m.co", "Fern175@m.co", "Fern796@m.co", "Fern486@m.co",
                        "Fern114@m.co", "Fern777@m.co", "Fern444@m.co", "Fern895@m.co" },
                { "Hanzo", "Hanzo414@m.co", "Hanzo940@m.co", "Hanzo28@m.co", "Hanzo779@m.co", "Hanzo368@m.co",
                        "Hanzo995@m.co", "Hanzo566@m.co", "Hanzo459@m.co", "Hanzo883@m.co" },
                { "Celine", "Celine727@m.co", "Celine424@m.co", "Celine199@m.co", "Celine518@m.co", "Celine180@m.co",
                        "Celine266@m.co", "Celine266@m.co", "Celine678@m.co", "Celine582@m.co" },
                { "Gabe", "Gabe113@m.co", "Gabe448@m.co", "Gabe832@m.co", "Gabe600@m.co", "Gabe274@m.co",
                        "Gabe865@m.co", "Gabe52@m.co", "Gabe854@m.co", "Gabe720@m.co" },
                { "Gabe", "Gabe917@m.co", "Gabe623@m.co", "Gabe344@m.co", "Gabe755@m.co", "Gabe594@m.co",
                        "Gabe615@m.co", "Gabe947@m.co", "Gabe72@m.co", "Gabe373@m.co" },
                { "Isa", "Isa391@m.co", "Isa383@m.co", "Isa213@m.co", "Isa216@m.co", "Isa862@m.co", "Isa730@m.co",
                        "Isa411@m.co", "Isa864@m.co", "Isa113@m.co" },
                { "John", "John928@m.co", "John633@m.co", "John831@m.co", "John848@m.co", "John770@m.co",
                        "John536@m.co", "John600@m.co", "John753@m.co", "John801@m.co" },
                { "Kevin", "Kevin125@m.co", "Kevin726@m.co", "Kevin398@m.co", "Kevin124@m.co", "Kevin69@m.co",
                        "Kevin82@m.co", "Kevin881@m.co", "Kevin875@m.co", "Kevin468@m.co" },
                { "David", "David823@m.co", "David683@m.co", "David266@m.co", "David135@m.co", "David735@m.co",
                        "David827@m.co", "David37@m.co", "David727@m.co", "David662@m.co" },
                { "Hanzo", "Hanzo182@m.co", "Hanzo638@m.co", "Hanzo21@m.co", "Hanzo828@m.co", "Hanzo382@m.co",
                        "Hanzo781@m.co", "Hanzo219@m.co", "Hanzo371@m.co", "Hanzo860@m.co" },
                { "Ethan", "Ethan721@m.co", "Ethan552@m.co", "Ethan671@m.co", "Ethan175@m.co", "Ethan184@m.co",
                        "Ethan667@m.co", "Ethan553@m.co", "Ethan895@m.co", "Ethan520@m.co" },
                { "Lily", "Lily556@m.co", "Lily833@m.co", "Lily509@m.co", "Lily182@m.co", "Lily521@m.co",
                        "Lily484@m.co", "Lily557@m.co", "Lily171@m.co", "Lily421@m.co" },
                { "Isa", "Isa339@m.co", "Isa258@m.co", "Isa672@m.co", "Isa860@m.co", "Isa41@m.co", "Isa765@m.co",
                        "Isa91@m.co", "Isa260@m.co", "Isa297@m.co" },
                { "Fern", "Fern759@m.co", "Fern554@m.co", "Fern405@m.co", "Fern351@m.co", "Fern630@m.co",
                        "Fern293@m.co", "Fern212@m.co", "Fern405@m.co", "Fern455@m.co" },
                { "Fern", "Fern245@m.co", "Fern697@m.co", "Fern783@m.co", "Fern208@m.co", "Fern543@m.co",
                        "Fern256@m.co", "Fern772@m.co", "Fern860@m.co", "Fern49@m.co" },
                { "Bob", "Bob792@m.co", "Bob214@m.co", "Bob640@m.co", "Bob101@m.co", "Bob423@m.co", "Bob995@m.co",
                        "Bob620@m.co", "Bob219@m.co", "Bob441@m.co" },
                { "David", "David681@m.co", "David15@m.co", "David903@m.co", "David665@m.co", "David87@m.co",
                        "David134@m.co", "David378@m.co", "David75@m.co", "David529@m.co" },
                { "Fern", "Fern415@m.co", "Fern73@m.co", "Fern265@m.co", "Fern543@m.co", "Fern287@m.co", "Fern530@m.co",
                        "Fern914@m.co", "Fern961@m.co", "Fern632@m.co" },
                { "Lily", "Lily70@m.co", "Lily260@m.co", "Lily889@m.co", "Lily277@m.co", "Lily942@m.co", "Lily243@m.co",
                        "Lily771@m.co", "Lily465@m.co", "Lily516@m.co" },
                { "Alex", "Alex877@m.co", "Alex969@m.co", "Alex66@m.co", "Alex394@m.co", "Alex637@m.co", "Alex632@m.co",
                        "Alex376@m.co", "Alex216@m.co", "Alex180@m.co" },
                { "John", "John331@m.co", "John832@m.co", "John127@m.co", "John864@m.co", "John510@m.co",
                        "John779@m.co", "John725@m.co", "John488@m.co", "John770@m.co" },
                { "Celine", "Celine992@m.co", "Celine260@m.co", "Celine983@m.co", "Celine977@m.co", "Celine927@m.co",
                        "Celine318@m.co", "Celine885@m.co", "Celine198@m.co", "Celine189@m.co" },
                { "Alex", "Alex27@m.co", "Alex608@m.co", "Alex127@m.co", "Alex569@m.co", "Alex796@m.co", "Alex610@m.co",
                        "Alex960@m.co", "Alex859@m.co", "Alex940@m.co" },
                { "Gabe", "Gabe456@m.co", "Gabe779@m.co", "Gabe565@m.co", "Gabe996@m.co", "Gabe318@m.co", "Gabe85@m.co",
                        "Gabe284@m.co", "Gabe185@m.co", "Gabe806@m.co" },
                { "Gabe", "Gabe158@m.co", "Gabe901@m.co", "Gabe484@m.co", "Gabe960@m.co", "Gabe39@m.co", "Gabe400@m.co",
                        "Gabe529@m.co", "Gabe556@m.co", "Gabe148@m.co" },
                { "Alex", "Alex698@m.co", "Alex954@m.co", "Alex93@m.co", "Alex462@m.co", "Alex262@m.co", "Alex91@m.co",
                        "Alex546@m.co", "Alex722@m.co", "Alex31@m.co" },
                { "Isa", "Isa781@m.co", "Isa67@m.co", "Isa219@m.co", "Isa784@m.co", "Isa778@m.co", "Isa137@m.co",
                        "Isa263@m.co", "Isa842@m.co", "Isa779@m.co" },
                { "Isa", "Isa455@m.co", "Isa404@m.co", "Isa9@m.co", "Isa384@m.co", "Isa540@m.co", "Isa238@m.co",
                        "Isa972@m.co", "Isa238@m.co", "Isa71@m.co" },
                { "Ethan", "Ethan414@m.co", "Ethan837@m.co", "Ethan585@m.co", "Ethan93@m.co", "Ethan240@m.co",
                        "Ethan625@m.co", "Ethan967@m.co", "Ethan479@m.co", "Ethan620@m.co" },
                { "Lily", "Lily446@m.co", "Lily118@m.co", "Lily419@m.co", "Lily220@m.co", "Lily605@m.co",
                        "Lily738@m.co", "Lily581@m.co", "Lily707@m.co", "Lily92@m.co" },
                { "Celine", "Celine70@m.co", "Celine729@m.co", "Celine279@m.co", "Celine357@m.co", "Celine490@m.co",
                        "Celine899@m.co", "Celine975@m.co", "Celine229@m.co", "Celine17@m.co" },
                { "Bob", "Bob468@m.co", "Bob607@m.co", "Bob103@m.co", "Bob733@m.co", "Bob285@m.co", "Bob696@m.co",
                        "Bob593@m.co", "Bob634@m.co", "Bob791@m.co" },
                { "Fern", "Fern987@m.co", "Fern675@m.co", "Fern382@m.co", "Fern10@m.co", "Fern903@m.co", "Fern38@m.co",
                        "Fern388@m.co", "Fern770@m.co", "Fern198@m.co" } };
        List<List<String>> accounts = new ArrayList<List<String>>();
        for (int i = 0; i < accounts_l.length; i++) {
            accounts.add(Arrays.asList(accounts_l[i]));
        }
        System.out.println(accountsMerge.accountsMerge(accounts));
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<String> EmailNo = new ArrayList<>();
        Map<String, String> Email2User = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                if (!EmailNo.contains(accounts.get(i).get(j))) {
                    EmailNo.add(accounts.get(i).get(j));
                    Email2User.put(accounts.get(i).get(j), accounts.get(i).get(0));
                }
            }
        }
        int[] root = new int[EmailNo.size()];
        for (int i = 0; i < root.length; i++) {
            root[i] = i;
        }
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            for (int i = 2; i < account.size(); i++) {
                String otherEmail = account.get(i);
                union(root, EmailNo.indexOf(firstEmail), EmailNo.indexOf(otherEmail));
            }
        }
        Map<Integer, List<String>> No2Email = new HashMap<>();
        for (int i = 0; i < root.length; i++) {
            if (!No2Email.containsKey(find(root, i))) {
                No2Email.put(root[i], new ArrayList<>());
            }
            No2Email.get(root[i]).add(EmailNo.get(i));
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for (Map.Entry<Integer, List<String>> entry : No2Email.entrySet()) {
            Collections.sort(entry.getValue());
            entry.getValue().add(0, Email2User.get(entry.getValue().get(0)));
            res.add(entry.getValue());
        }
        return res;
    }

    public void union(int[] root, int i, int j) {
        if (find(root, i) != find(root, j)) {
            if (root[j] == j) {
                root[root[j]] = find(root, root[i]);
            } else {
                root[root[i]] = find(root, root[j]);
            }
        }
    }

    public int find(int[] root, int i) {
        if (root[root[i]] != root[i]) {
            root[i] = find(root, root[i]);
        }
        return root[i];
    }
}
