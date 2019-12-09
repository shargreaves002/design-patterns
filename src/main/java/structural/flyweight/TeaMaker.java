package structural.flyweight;

import java.util.ArrayList;

public class TeaMaker {
    private ArrayList<KarakTea> tea = new ArrayList<KarakTea>();

    public KarakTea make(String preference) {
        if (tea.isEmpty()) tea.add(new KarakTea());

        return tea.get(0);
    }
}
