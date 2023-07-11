package examples;

public class tratamentoStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); //remove apenas os espaços em branco do final
        String s04 = original.substring(2); //escolhe onde a string vai começar
        String s05 = original.substring(2, 9).trim(); //delimita o inicio e o final da nova string e foi adicionado o trim para remover os espaços do final
        String s06 = original.replace("a", "hamilton");
        int i = original.indexOf("bc"); // retorna o index da primeira aparição da string
        int j = original.lastIndexOf("bc"); // retorna o index da última aparição da string
        String[] z = original.split(" ");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'hamilton'): -" + s06 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
        System.out.println("Split: " + z[0]);

    }
}
