package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> list = new ArrayList<>();

    @Override
    public List<Truck> get() {
        createMachines();
        return list;
    }

    private void createMachines() {
        list.add(new Truck(350, 70));
        list.add(new Truck(600, 60));
    }
}
