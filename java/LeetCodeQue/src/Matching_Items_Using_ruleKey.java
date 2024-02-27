import java.util.List;

public class Matching_Items_Using_ruleKey {
    static int ismatch(List<List<String>> items, String ruleKey, String rulevalue) {
        int count = 0;
        String comp = rulevalue;
        for (int i = 0; i < items.size(); i++) {
            switch (ruleKey) {
                case "type":
                    if (items.get(i).get(0).equals(comp))
                        count++;
                    break;

                case "color":
                    if (items.get(i).get(1).equals(comp))
                        count++;
                    break;

                case "name":
                    if (items.get(i).get(2).equals(comp))
                        count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
