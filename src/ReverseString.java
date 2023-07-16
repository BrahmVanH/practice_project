public class ReverseString {

    public static void main(String[] args) {
        String reversed = reverseString( "Reverse this string.");

        System.out.println( reversed );
    }

    public static String reverseString( String newString ) {
        String cleanedUpString = newString.trim().replaceAll(" +", " ");

        String[] stringArrayed = cleanedUpString.split("");

        String reversed = "";
        int i;

        for( i = stringArrayed.length -1; i >= 0; i--) {
            reversed += stringArrayed[i];
        }

        return reversed;
    }
}
