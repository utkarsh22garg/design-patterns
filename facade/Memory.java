package facade;

import java.util.HashMap;
import java.util.Map;

public class Memory {

    private Map<String, Boolean> programMap;
    private HardDrive hardDrive;

    public Memory() {
        programMap = new HashMap<>();
        hardDrive = new HardDrive();
    }

    void loadProgram(String program) {
        if (Boolean.TRUE.equals(programMap.get(program))) {
            System.out.println(program + " already loaded in memory");
        } else {
            System.out.println("Loading " + program + " in Memory");
            hardDrive.loadFromDisk(program);
            programMap.put(program, true);
        }
    }
}
