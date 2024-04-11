import java.util.Scanner;

class CPU {
    int price;

    CPU(int p) {
        this.price = p;
    }

    class Processor {
        int cores;
        String manufacture;

        Processor(int c, String m) {
            this.cores = c;
            this.manufacture = m;
        }

        void display() {
            System.out.println("No of Cores : " + this.cores);
            System.out.println("Processor manufactures : " + this.manufacture);
        }
    }

    static class Ram {
        int memory;
        String manufacture;

        Ram(int n, String m) {
            this.memory = n;
            this.manufacture = m;
        }

        void display() {
            System.out.println("Memory Size : " + this.memory);
            System.out.println("Memory manufactures : " + this.manufacture);
        }
    }

    void display() {
        System.out.println("Price of CPU : " + this.price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of CPU: ");
        int price = scanner.nextInt();

        System.out.print("Enter the number of cores : ");
        int cores = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter the manufacturer of Processor: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Enter the memory size for RAM: ");
        int memory= scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter the manufacturer of RAM: ");
        String ramManufacturer = scanner.nextLine();

        CPU c = new CPU (price);
        CPU.Processor p = c.new Processor(cores,manufacturer);
        CPU.Ram r= new CPU.Ram(memory, ramManufacturer);

        p.display();
        r.display();

   
    }
}