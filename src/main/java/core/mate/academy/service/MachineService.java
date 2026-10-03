package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineService<T extends Machine> {

    List<T> getAll(Class<? extends T> classes);

    void fill(List<? super Machine> machines, Machine value);

    void startWorking(List<? extends Machine> machines);
}
