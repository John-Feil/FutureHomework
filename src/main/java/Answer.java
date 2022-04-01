
public class Answer {
    public static void main(String[] args) {
        //Data needed for methods
        String[] firstNames = {"John", "Emoni", "Isaiah", "Kyle"};
        int[] countToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String myName = "Kyle";
        int age = 2;
        int favNum = 14;
        // First Question
        System.out.println("First Question: ");
        int index = getLastIndex(firstNames);
        System.out.println(firstNames[index]);
        System.out.println();
        // Second Question
        System.out.println("Second Question: ");
        index = getSecondToLastIndex(firstNames);
        System.out.println(firstNames[index]);
        System.out.println();
        //Third Question
        System.out.println("Third Question: ");
        String answer = getFirstElement(firstNames);
        System.out.println(answer);
        System.out.println();
        //Fourth Question
        System.out.println("Fourth Question: ");
        answer = getLastElement(firstNames);
        System.out.println(answer);
        System.out.println();
        //Fifth Question
        System.out.println("Fifth Question: ");
        answer = getSecondToLastElement(firstNames);
        System.out.println(answer);
        System.out.println();
        //Sixth Question
        System.out.println("Sixth Question: ");
        int total = getSum(countToTen);
        System.out.println(total);
        System.out.println();
        //Seventh Question
        System.out.println("Seventh Question: ");
        total = getAverage(countToTen);
        System.out.println(total);
        System.out.println();
        //Eighth Question
        System.out.println("Eighth Question: ");
        answer = extractAllOddNumbers(countToTen);
        System.out.println(answer);
        System.out.println();
        //Ninth Question
        System.out.println("Ninth Question");
        answer = extractAllEvenNumbers(countToTen);
        System.out.println(answer);
        System.out.println();
        //Tenth Question
        System.out.println("Tenth Question");
        boolean trueOrFalse = contains(firstNames, myName);
        System.out.println(trueOrFalse);
        System.out.println();
        //Eleventh Question
        System.out.println("Eleventh Question: ");
        total = getIndexByElement(firstNames,myName);
        System.out.println(total);
        System.out.println();
        //Thirteenth Question
        System.out.println("Thirteenth Question: ");
        printOddNumbersInRange(age, favNum);
        System.out.println();
        //Fourteenth Question
        System.out.println("Fourteenth Question: ");
        answer = printGivenStringTimesNumberGiven(myName,age);
        System.out.println(answer);
        System.out.println();
        //Fifteenth Question
        System.out.println("Fifteenth Question: ");
        total = wordsInAStringCounter(myName);
        System.out.println(total);
        System.out.println();
    }

    public static int getLastIndex(String[] names) {
        return -1 + names.length;
    }

    public static int getSecondToLastIndex(String[] names) {
        return -2 + names.length;
    }

    public static String getFirstElement(String[] names) {
        return names[0];
    }

    public static String getLastElement(String[] names) {
        int lastIndex = -1 + names.length;
        return names[lastIndex];
    }

    public static String getSecondToLastElement(String[] names) {
        int lastIndex = -2 + names.length;
        return names[lastIndex];
    }

    public static int getSum(int[] ints) {
        int sum = 0;
        for (int answer : ints) {
            sum += answer;
        }
        return sum;
    }

    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int answer : ints) {
            sum += answer;
        }
        int divide = -1 + ints.length;
        return sum / divide;
    }

    public static String extractAllOddNumbers(int[] numbers) {
        String odd = "";
        for (int answer : numbers) {
            if (answer % 2 == 1) {
                odd += answer;
                odd += ",";
            }
        }
        return odd;
    }

    public static String extractAllEvenNumbers(int[] numbers) {
        String even = "";
        for (int answer : numbers) {
            if (answer % 2 == 0) {
                even += answer;
                even += ",";
            }
        }
        return even;
    }

    public static boolean contains(String[] names, String element) {
        int length = -1 + names.length;
        for (int i = 0; i <= length; i++){
            if (names[i].equals(element)){
                return true;
            }
        }
        return false;
    }
    public static int getIndexByElement(String[] names, String element) {
        int length = -1 + names.length;
        int answer = 0;
        for (int i = 0; i <= length; i++){
            if (names[i].equals(element)){
                answer += i;
            }
        }
        return answer;
    }
    public static void printOddNumbersInRange(int start, int end){
        StringBuilder sb = new StringBuilder();
        if (start % 2 == 0){ //Starts even
            for(int i = 1 + start; i <= end; i+=2){
                sb.append(i).append(',').append(" ");   //Adds the numbers to a string with a comma and space
            }
            System.out.print(sb.substring(0, (sb.length()-2)));  //prints out a substring ignoring the last two characters
        }
        else{  //Starts odd
            for(int x = start; x <= end; x+=2){
                sb.append(x).append(',').append(" ");  //Adds the numbers to a string with a comma and space
            }
            System.out.print(sb.substring(0, (sb.length()-2)));  //prints out a substring ignoring the last two characters
        }
    }
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++){
            answer += str;
        }
        return answer;
    }
    public static int wordsInAStringCounter(String str){
        int length = str.length();
        int counter = 0;
        for (int i = 0; i < length; i++){
            counter += 1;
        }
        return counter;
    }
}
