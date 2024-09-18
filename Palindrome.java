
public class Palindrome {

    public static void main(String[] args) {
        for (String s : args) {
            // Проверяем, является ли строка палиндромом
            if (isPalindrome(s)) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is not a palindrome.");
            }
        }
    }

    // Метод для переворачивания строки
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}
