public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Human h = new Human();
                Writer.writerHumanInfo(h);
            } catch (Exception e) {
                System.out.println("Enter the information again.");
            }
        }

    }
}
