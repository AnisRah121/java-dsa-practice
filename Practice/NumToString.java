package Practice;

public class NumToString {

    public static void main(String[] args) {
        int num = 92106845;

        pw(num / 10000000, " Crore ");
        pw((num / 100000) % 100, " Lakh ");
        pw((num / 1000) % 100, " Thousand ");
        pw((num / 100) % 10, " Hundred ");
        pw(num % 100, " ");
    }

    public static void pw(int num, String s) {

        if (num == 0) return;

        String[] one = {
                "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] two = {
                "", "", "Twenty", "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (num <= 19) {
            System.out.print(one[num] + s);
        } else {
            System.out.print(two[num / 10] + " " + one[num % 10] + s);
        }
        if(num!=0)
            System.out.println(s);
    }
}
