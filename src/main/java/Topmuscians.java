public class Topmuscians {
    public static void main(String[] args) {
        String[][] artistInfo = {
                {"Biggie", "JayZ", "Nas"},
                {"Juicy", "99 Problems", "One mic"}
        };
        for (String[] answer: artistInfo) {
            for (String element: answer) {
                System.out.println(element);
            }
        }
        System.out.println(artistInfo);
    }
}
