public class Main {
    public static void main(String[] args) {

        Devoloper backend = new Backend();
        Devoloper fronted = new Fronted();
        Devoloper devops = new Devops();


        Devoloper[] devolopers = {backend, devops, fronted};
        for (Devoloper d : devolopers) {
d.coding();
        }
    }}