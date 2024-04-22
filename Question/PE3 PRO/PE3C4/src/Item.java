/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nkiem
 */
public class Item implements IService{
    public String id;
    public String name;
    public int size;

    public Item(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }


    @Override
    public String formatSize() {
        if (size > 0 && size <= 4) {
            return "XS";
        } else if (size > 4 && size <= 6) {
            return "S";
        } else if (size >= 0 && size <= 4) {
            return "M";
        } else {
            return "L";
        }
    }

    @Override
    public String formatName() {
        return name.trim().replaceAll("\\s+", " ");
    }
}
