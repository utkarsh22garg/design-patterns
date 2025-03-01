package facade;

public class CPU {
    void freeze() {
        System.out.println("CPU is freezed");
    }

    void execute(String program) {
        System.out.println("Executing program " + program);
    }
}
