package Operators;
//- Type casting in Java is the process of **converting a value from one data type to another.**
//- There are two main types of type casting:
//    - **widening  **  -> Implicit
//    - **narrowing  -> **Explicit
public class Lab015_TypeCasting {
    public static void main(String[] args) {
    byte b = 10;
    byte d = 20;
    int a = b;//Implicit - wideneing ->bytetoint
       int r = 300;
       byte m = (byte)r;//Explicit - narrowing - int->byte
        System.out.println(m);

        // int a=300; -> int means 32 bits memory required
        //
        // **0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0**
        //
        // byte b1=(byte)a; -> byte means 8 bits memory required
        //
        // **0 0 1 0 1 1 0 0**
        //
        // Value is
        //
        // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**
    }
}
