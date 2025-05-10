public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 3; // 0011

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;

        System.out.println("Bitwise AND (a & b): " + andResult);
        System.out.println("Bitwise OR (a | b): " + orResult);
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);
        System.out.println("Bitwise NOT (~a): " + notResult);
        System.out.println("Left Shift (a << 1): " + leftShift);
        System.out.println("Right Shift (a >> 1): " + rightShift);
    }
}
