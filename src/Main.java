//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("predator", 2022);
        comp.start();
        Computer.Monitor monitor = new Computer.Monitor("1920x1080");
        System.out.println(monitor.toString());
        System.out.println(comp.getCoresMethod());
        comp.getUpgradeMethod(8);
        System.out.println(comp.getCoresMethod());
    }
}