package searching.LinearSearch;
public class StringSearch {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        char target2 = 't';
        System.out.println(search(name, target));
        System.out.println(search2(name, target2));

    }

    // using enhanced for loop
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == target){
                return  true;
            }
        }
        return false;
    }
 
    // using basic loop linear search method 
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
