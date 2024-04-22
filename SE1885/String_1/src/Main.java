import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dic = "fuck shit hell dog lol cut ngu";
        System.out.println("Nhập một chuỗi: ");
        Scanner banphim = new Scanner(System.in);
        String input = banphim.nextLine();
        String[] token = dic.split(" ");
        String[] token1 = input.split(" ");

        for (int i = 0; i < token1.length; i++) {
               if (token1[i].contains(token[0])) {
                    token1[i] = token1[i].replaceAll("uck", "***");
            }
               if (token1[i].contains(token[1])) {
                    token1[i] = token1[i].replaceAll("hit", "***");
            }
               if (token1[i].contains(token[2])) {
                    token1[i] = token1[i].replaceAll("ell", "***");
            }
               if (token1[i].contains(token[3])) {
                    token1[i] = token1[i].replaceAll("og", "**");
            }
               if (token1[i].contains(token[4])) {
                    token1[i] = token1[i].replaceAll("ol", "**");
            }
               if (token1[i].contains(token[5])) {
                    token1[i] = token1[i].replaceAll("ut", "**");
            }
               if (token1[i].contains(token[6])) {
                    token1[i] = token1[i].replaceAll("gu", "**");
            }
        }

        for (int i = 0; i < token1.length; i++) {
            System.out.print(token1[i] + " ");
        }
        System.out.println("");
    }
}
