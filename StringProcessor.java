
import java.util.Objects;
import java.util.Stack;

public class StringProcessor {
    public String Expansion(int N, StringBuilder s)
    {
        StringBuilder exp = new StringBuilder(s);
        if(N>0) {
            for (int i = 1; i < N; i++) {
                exp.append(s);
            }
        }
        if(N == 0)
        {
            return "";
        }
        if(N<0)
        {
            throw new IllegalArgumentException("Отрицательный параметр N");

        }
        return exp.toString();
    }
    public int Occurrences(String a, String b) {
        int count = 0;
        if (b != "") {
            for (int i = 0; i <= a.length() - b.length(); i++) {
                String substring = a.substring(i, i + b.length());
                if (substring.equals(b)) {
                    count = count + 1;
                }
            }
        } else {
            throw new IllegalArgumentException("Че-то не то");
        }
        return count;
    }
    public String Remake(String a)
    {
        StringBuilder remakeNew = new StringBuilder();
        int x = a.length();
        char prikol;
        for(int i = 0; i<x; i++)
        {
            prikol = a.charAt(i);
            if(prikol == 49)
            {
                remakeNew.append("Один");
            }
            if(prikol == 50)
            {
                remakeNew.append("Два");
            }
            if(prikol == 51)
            {
                remakeNew.append("Три");
            }
        }
        return remakeNew.toString();
    }
    public static String deleteSymbol(StringBuilder s) {
        StringBuilder strBuf = new StringBuilder(s);
        System.out.println(strBuf.length());
        for (int i = 1; i < s.length() ; i += 1) {
            s.deleteCharAt(i);
        }
        return s.toString();
    }
    public static String swapWords(String string) {
        if (string.isEmpty())
            return string;
        return swapWords(string.substring(1)) + string.charAt(0);
    }

    public static long hexadecimalNumber(Stack<Character> number)
    {
        if (number.isEmpty())
        {
            throw new IllegalArgumentException("Stack is empty");
        }
        long result = 0;
        int rank = 0;
        char symbol = 0;
        while (!(number.isEmpty()))
        {
            symbol = number.pop();
            if (symbol >= 48 && symbol <= 57)
            {
                result += (symbol - 48) * Math.pow(16, rank);
            } else
                if (symbol >= 65 && symbol <= 70)
                {
                    result += (symbol - 55) * Math.pow(16, rank);
                } else
                {
                    throw new IllegalArgumentException("This stack hasn't a hexadecimal number");
                } rank++;
        } return result;
    }

    public static String replaceHexadecimalNumbers(String str) {
        if (str == null) {
            throw new NullPointerException("The string is null");
        }
        Stack<Character> number = new Stack<>();
        int i = 0;
        int left = 0;
        int right = 0;
        long result = 0;
        StringBuilder replacer = new StringBuilder(str);
        while (i < replacer.length()) {
            left = replacer.indexOf("0x");
            if (left == -1) {
                break;
            } else {
                left += 2;
                right = left;
                while (right != left + 8 && right != replacer.length()) {
                    number.push(replacer.charAt(right));
                    right++;
                }
                result = hexadecimalNumber(number);
                left -= 2;
                replacer.delete(left, right);
                replacer.insert(left, result);
                String letter = Long.toString(result);
                i = left + letter.length() - 1;
            }
            i++;
        }
        return new String(replacer);
    }
}