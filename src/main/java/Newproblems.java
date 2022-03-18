import java.util.Arrays;

public class Newproblems {
    public static void main(String[] args) {
        String myName = "John Feil";
        String test = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
        String[] cars = {"Mercedes", "Benz", "Ford","Prius"};
        int num = 100000;
        int answer = vowelsCounter(myName);
        System.out.println(answer);
        System.out.println(replaceCharacters(test));
        System.out.println(createStringOfFibonnaciUpToMax(num));
        System.out.println(Arrays.toString(swap(cars)));
    }

    public static String replaceCharacters(String str) {
        for (int i = 0; i < str.length();) {
            if (str.charAt(i) == 'f' || str.charAt(i) == 'F') {
                str = str.substring(0, i) + '7' + str.substring(++i);
            } else if (str.charAt(i) == 's' || str.charAt(i) == 'S') {
                str = str.substring(0, i) + '$' + str.substring(++i);
            } else if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                str = str.substring(0, i) + '@' + str.substring(++i);
            } else if (str.charAt(i) == '1') {
                str = str.substring(0, i) + '!' + str.substring(++i);
            } else{
                i++;
            }
        }
        return str;
    }

    public static int vowelsCounter(String str) {
        int length = str.length();
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') {
                counter += 1;
            } else if (str.charAt(i) == 'E' || str.charAt(i) == 'e') {
                counter += 1;
            } else if (str.charAt(i) == 'I' || str.charAt(i) == 'i') {
                counter += 1;
            } else if (str.charAt(i) == 'O' || str.charAt(i) == 'o') {
                counter += 1;
            } else if (str.charAt(i) == 'U' || str.charAt(i) == 'u') {
                counter += 1;
            }
        }
        return counter;
    }
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        int numOne = 0;
        int numTwo = 1;
        String result = "";
            while (numTwo <= maxnumber){
                numOne += numTwo;
                if (numOne <= maxnumber){
                    result += "" + numOne;
                }
                numTwo += numOne;
                if (numTwo <= maxnumber) {
                    result += "" + numTwo;
                }
            }
        return result;
    }

    public static String[] swap(String[] stringArray) {
        String[] answer = new String[stringArray.length];
        int x = stringArray.length-1;
        for (int i = 0; i < stringArray.length; i++){
                answer[i] = stringArray[x];
                x--;
                if (x < 0){
                    break;
                }
        }
        return answer;
    }
}

