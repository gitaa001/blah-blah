package src.entities;

import java.util.List;
import java.util.ArrayList;

public class House {
    private int totalNPCInside;
    private List<NPC> npcInside = new ArrayList<NPC>();
    private List<Furniture> furnitureList = new ArrayList<Furniture>();

    public House(int totalNPCInside, List<NPC> npcInside, List<Furniture> furnitureList) {
        this.totalNPCInside = totalNPCInside;
        this.npcInside = npcInside;
        this.furnitureList = furnitureList;
    }

    public int getTotalNPCInside() {
        return totalNPCInside;
    }

    public List<NPC> getNpcInside() {
        return npcInside;
    }

    public List<Furniture> getFurnitureList() {
        return furnitureList;
    }

    public void setTotalNPCInside(int totalNPCInside) {
        this.totalNPCInside = totalNPCInside;
    }

    public void addNPCInside(NPC npc) {
        npcInside.add(npc);
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void removeNPCInside(NPC npc) {
        npcInside.remove(npc);
    }

    public void removeFurniture(Furniture furniture) {
        furnitureList.remove(furniture);
    }

}
