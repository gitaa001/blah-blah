package src.entities;

import java.util.List;
import java.util.ArrayList;

public class NPCManager{
    private List<NPC> npcList;

    public NPCManager() {
        this.npcList = new ArrayList<NPC>();
    }
    public void addNPC(NPC npc) {
        npcList.add(npc);
    }

    public void removeNPC(NPC npc) {
        npcList.remove(npc);
    }

    public int getNPCCount() {
        return npcList.size();
    }

    public List<NPC> getNPCList() {
        return npcList;
    }
    
}
