package reflection_and_annotation.barracksWars;

import reflection_and_annotation.barracksWars.core.Engine;
import reflection_and_annotation.barracksWars.core.factories.UnitFactoryImpl;
import reflection_and_annotation.barracksWars.data.UnitRepository;
import reflection_and_annotation.barracksWars.interfaces.Repository;
import reflection_and_annotation.barracksWars.interfaces.Runnable;
import reflection_and_annotation.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = (Repository) new UnitRepository();
        UnitFactory unitFactory = (UnitFactory) new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
