package PrimitivesPackage;

public class Main {
    public static void main(String[] args) {
        Primitives primitives = new Primitives();
        int[] nums = {3,4,7,9,13,25,46};

            //test Primitives methods below - feel free to edit the params
        primitives.convertFahrenheitToCelsius(45);
        primitives.convertInchesToMeters(1000);
        primitives.makeOperationsWithNumbers(-3, 6);
        primitives.getChars("Java");
        primitives.countChars("But why do I speak when no one has my ears?");
        primitives.getLetters("sdh5ksjf78-dv");
        primitives.countOddAndEvenNumbers(nums); //feel free to edit the variable
        primitives.guessNumber(); //this is a game so make sure to comment the above for easier followup if needed
    }
}
