
import java.util.Random;
import java.util.Scanner;


    public class CäsarVerschlüsselung {
        public static String CäsarVerschlüsselung(int letterShift, String sentenceToEncrypt) {
            String encryptedSentence = "";
            int letter = 0;

            for (int i = 0; i < sentenceToEncrypt.length(); i++) {
                letter = sentenceToEncrypt.charAt(i);

                letter += letterShift;

                if (letter > 96 && letter > 122) {
                    letter = 96 + (letter - 122);
                } else if (letter > 64 && letter > 90 && letter < 96) {
                    letter = 64 + (letter - 90);
                }
                String letterAsString = Character.toString(letter);
                encryptedSentence += letterAsString;
            }
            return encryptedSentence;
        }

        public static String decrypt(String sentenceToDecrypt) {

            int letter = 0;
            String decryptedSentence = "";
            boolean isProgrammRunning = true;
            int letterShift = -1;
            while (isProgrammRunning) {
                for (int i = 0; i < sentenceToDecrypt.length(); i++) {
                    letter = sentenceToDecrypt.charAt(i);

                }
            }
            return "test";
        }
    }