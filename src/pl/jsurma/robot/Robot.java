package pl.jsurma.robot;

public class Robot {

    public static void main(String[] args) {
        String commands = "PMMMLLPPMMMMMMMLMMMLLLMMMMLMMMMMMMMMLLLLLMMPSLPPPLPPGHJSPMLLMMPL";
        int slot = 10;
        int maxBlock = 15;
        int count = 0;
        int[] block = new int[10];

        char[] commandsTab = commands.toCharArray();

        for (char aCommandsTab : commandsTab) {
            if (aCommandsTab == 'P') {
                count = 0;
            }
            if (aCommandsTab == 'M' && count < slot) {
                count++;
            }
            if (aCommandsTab == 'L' && count < maxBlock) {
                block[count] = block[count] + 1;
                count = 0;
            }
            if (aCommandsTab != 'P' && aCommandsTab != 'M' && aCommandsTab != 'L') {
                System.out.println("Błędna komenda");
            }
            if (count == slot) {
                count = 0;
            }
        }
        for (int aBlock : block) {
            System.out.print(aBlock + ", ");
        }
    }
}