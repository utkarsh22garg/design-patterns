package facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
    }

    public void start() {
        String program = "Game";
        System.out.println("Starting computer ...");
        memory.loadProgram(program);
        cpu.execute(program);
    }
}
