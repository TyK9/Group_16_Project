package JavaCodingInterviewTasks;

public class PasswordValidation {
    public static void main(String[] args) {

        System.out.println(isValid("Pepsi+23"));
    }

    public static boolean isValid(String str) {
        boolean hasLowerCase = false, hasUpperCase = false, hasDigits = false, containsSpecialChars = false;
        String specialChars = "(?=.*[@#$%^&+=])";
        for (int i = 0; i < str.length(); i++) {

            if (!str.contains(" ") && str.length() >= 6) {
                return true;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(str.charAt(i))) {
                hasUpperCase = true;
            } else if (Character.isDigit(str.charAt(i))) {
                hasDigits = true;
            } else if (str.contains(specialChars)) {
                containsSpecialChars = true;
            }
        }
        return hasLowerCase && hasUpperCase && hasDigits && containsSpecialChars;
    }
}
