/*69. TASK 7 - BIT MASK UTILITY 
----------------------------- 
Required filename: BitMaskUtility.java 
Implement: 
    static boolean isBitSet(int number, int position) 
    static int setBit(int number, int position) 
    static int clearBit(int number, int position) 
    static int toggleBit(int number, int position) 
    static String toBinary32(int number) 
Build a menu that reads a number, bit position, and operation. Validate bit 
positions from 0 through 31. Display values before and after in decimal and 
32-bit binary.
*/
import java.util.Set;
public class BitMaskUtility 
{
        static boolean isBitSet(int number, int position) 
        {
        int mask = 1 << position;
        return (number & mask) != 0;
        }
    static int setBit(int number, int position) 
    {
        return number | (1 << position);
    }
    static int clearBit(int number, int position) 
    {
        return number & ~(1 << position);
    }
    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }
}
