package problem2.after;

import java.util.HashMap;
import java.util.Map;

public class PresetRegistry {
    private final Map<String, Quote> registry = new HashMap<>();

    public void register(String name, Quote preset) {
        registry.put(name, preset);
    }

    public Quote create(String name) {
        Quote preset = registry.get(name);
        if (preset == null) {
            throw new IllegalArgumentException("Unknown preset name: " + name);
        }
        return preset.copy();
    }
}
