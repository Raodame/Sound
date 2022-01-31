public class SoundTester {
    public static void main(String[] args)
    {
        int[] values = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound firstSound = new Sound( values );
        //Should Output:
        //[40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223]
        System.out.println("Before:\n" + firstSound);

        int numChanges = firstSound.limitAmplitude(2000);
        //Should Output
        //outputs   [40, 2000, 17, -2000, -17, -2000, 2000, 1048, -420, 33, 15, -32, 2000, 2000]
        System.out.println("After:\n" + firstSound);
        //Should Output
        //5
        System.out.println( numChanges );


        System.out.println();

        int newValues[] = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
        Sound secondSound = new Sound(newValues);
        //Should Output
        //[0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0]
        System.out.println("Before:\n" + secondSound);
        secondSound.trimSilenceFromBeginning();
        //Should Output
        //[-14,0,-35,-39,0,-7,16,32,37,29,0,0]
        System.out.println( "After:\n" + secondSound );
    }
}
