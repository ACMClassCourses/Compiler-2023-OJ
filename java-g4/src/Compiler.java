public class Compiler {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Compiler <filename>");
            return;
        } else if (args[0].equals("-fsyntax-only")) {
            System.out.println("Semantic check");
            return;
        } else if (args[0].equals("-S")) {
            System.out.println("Generate assembly code");
            return;
        } else {
            System.out.println("Unknown option");
            return;
        }
    }
}
