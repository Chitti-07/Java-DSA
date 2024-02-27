public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Chitti";
        char target = 't';
        boolean ans = searchstr2(name,target);
        System.out.println(ans);
    }
//-----------------------------------------------------------------------------------------------------------------------------
    //using normal looping
//    static boolean searchstr(String str, char target){
//        if (str.length() == 0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char element = str.charAt(i);
//            if (element == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//-----------------------------------------------------------------------------------------------------------------------------
    //using enhanced looping
    static boolean searchstr2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char element : str.toCharArray()){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
