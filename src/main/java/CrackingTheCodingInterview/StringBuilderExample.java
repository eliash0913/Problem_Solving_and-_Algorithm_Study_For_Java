package CrackingTheCodingInterview;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Initial String");
        sb.reverse();
        System.out.println(sb);
        sb.append(" ");
        sb.append(2);
        System.out.println(sb);

        sb.append(new StringBuilder("firstAddedString").reverse()).append(" ").append(3);
        System.out.println(sb);
    }
}
