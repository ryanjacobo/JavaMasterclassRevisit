package dev.lpa.Interfaces.Exercise;

import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> sendValues);
}
