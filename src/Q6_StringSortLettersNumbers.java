import java.util.Arrays;

public class Q6_StringSortLettersNumbers {

    //this method returns a number and letters string in Array
    public static String []stringToArray(String str) {
        String tempStr = "";

        for (int i = 0; i < str.length(); i++) {
            //temporary resettable String to hold the letter and numbers separated
            tempStr += "" + str.charAt(i);
            //checking first for letter
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                //checking if its digit then put delimiter. This is where action happens for letters
                if (Character.isDigit(str.charAt(i + 1))) {
                    tempStr += ",";
                }
                //checking if it's number
            } else if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                //checking if its digit then put delimiter. This is where action happens for digits
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    tempStr += ",";
                } } }

        //System.out.println(tempStr);
        String[] arr = tempStr.split(",");
        return arr;
//        This line replaces all the cod what we did in this method
//        String[] arr = str.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))");
//        System.out.println(Arrays.toString(arr));
    }

    // this method returns a sorted characters in each value
    // of String array it is used in sortToString method below
    public static String sort (String str){
        char [] characters = str.toCharArray();
        Arrays.sort(characters);
        String sorted = new String (characters);
        return sorted;
    }
    //yhis method returns a sorted String from sorted Array
    public static String sortToString(String [] str){
        String sortedString = "";
        for(String eachElement : str){
            sortedString += sort(eachElement);// in this line we use custom sort() method
        }
        return sortedString; }
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";

        String[] strArr = stringToArray(str);
        //System.out.println(Arrays.toString(strArr));

        String sorted = sortToString(strArr);
        System.out.println(sorted);
    }   }


//      Python language:  input = ''.join(''.join(sorted(list(sub))) for sub in split(r"([A-Z]+|[0-9]+)", inp) if sub)
//        print(out)