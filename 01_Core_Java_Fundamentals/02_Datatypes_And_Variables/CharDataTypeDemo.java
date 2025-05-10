public class CharDataTypeDemo {
    public static void main(String[] args) {
        // Suppose you're designing a system where each seat in a cinema is labeled by a letter.
        // You can use char to represent seat labels.
        char seatLabel = 'B'; // A single character label for the seat

        // Let's also represent special characters and Unicode values
        char copyrightSymbol = '\u00A9'; // Unicode for ©
        char hindiCharacter = 'क'; // A Devanagari character (Hindi letter 'Ka')

        // Output the characters
        System.out.println("Seat Label: " + seatLabel);
        System.out.println("Copyright Symbol: " + copyrightSymbol);
        System.out.println("Hindi Character: " + hindiCharacter);

        // char boundaries (represented by numeric values internally)
        char minValue = 0;
        char maxValue = 65535;

        System.out.println("Minimum Unicode Value of char: " + (int) minValue);
        System.out.println("Maximum Unicode Value of char: " + (int) maxValue);

        /*
         🧠 Real-Life Analogy:
         Think of `char` as a post-it note 🗒️ with a single symbol on it — like a seat label, an emoji, or a letter from any language.
         Java's char supports **Unicode**, so it can store characters from most of the world's languages and even symbols.
        */

        // Explanation:
        // 1. We declared a char variable 'seatLabel' to hold a single letter for a cinema seat.
        // 2. We used Unicode to represent a special symbol (©) and a Hindi character.
        // 3. 'char' in Java uses 2 bytes and supports a wide range of international characters.
        // 4. We displayed both the min and max Unicode values that a char can store.
        // 5. This shows how versatile 'char' is when dealing with globalized applications.
    }
}
