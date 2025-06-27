
public class Main {
    public static void main(String[] args) {
        Main.BinaryCalc(7);
        }

        public static void BinaryCalc(int number){
            while(true){
                if(number == 0){
                    System.out.println("Ergebnis: " + 0);
                    return;
                }
                System.out.println("Ergebnis: " + number % 2);
                number = number / 2;
            }
        }
    }
