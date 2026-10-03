package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<Bulldozer> bulldozerMachines = bulldozerProducer.get();
            List<Machine> machines = new ArrayList<>();
            machines.addAll(bulldozerMachines);
            return machines;
        }
        if (type.equals(Truck.class)) {
            TruckProducer truckProducer = new TruckProducer();
            List<Truck> truckMachines = truckProducer.get();
            List<Machine> machines = new ArrayList<>();
            machines.addAll(truckMachines);
            return machines;
        }
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<Excavator> excavatorMachines = excavatorProducer.get();
            List<Machine> machines = new ArrayList<>();
            machines.addAll(excavatorMachines);
            return machines;
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
