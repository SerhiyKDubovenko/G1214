package logic.entity;

import java.util.Objects;

public class HomeTheaterAccessories {

    /*
    (
    ID              int         not null,
                varchar(25) not null,
    MATERIAL        varchar(25) null,
    WEIGHT          double      null,
    SIZE            varchar(25) null,
    COLOR           varchar(20) null,
    USE_WITH        varchar(25) null,
    BRAND_KEY       int         null,
    SUBCATEGORY_KEY int         null,
    ORDER_ID        int         null
);
     */

    private int ID;
    private String name;
    private String material;
    private double weght;
    private double size;
    private String color;
    private String useWith;
    private int brandKey;
    private int subcategoryKey;
    private int orderID;

    public HomeTheaterAccessories() {
    }

    public HomeTheaterAccessories(int ID, String name, String material, double weght, double size, String color, String useWith, int brandKey, int subcategoryKey, int orderID) {
        this.ID = ID;
        this.name = name;
        this.material = material;
        this.weght = weght;
        this.size = size;
        this.color = color;
        this.useWith = useWith;
        this.brandKey = brandKey;
        this.subcategoryKey = subcategoryKey;
        this.orderID = orderID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeght() {
        return weght;
    }

    public void setWeght(double weght) {
        this.weght = weght;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUseWith() {
        return useWith;
    }

    public void setUseWith(String useWith) {
        this.useWith = useWith;
    }

    public int getBrandKey() {
        return brandKey;
    }

    public void setBrandKey(int brandKey) {
        this.brandKey = brandKey;
    }

    public int getSubcategoryKey() {
        return subcategoryKey;
    }

    public void setSubcategoryKey(int subcategoryKey) {
        this.subcategoryKey = subcategoryKey;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "HomeTheaterAccessories{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", weght=" + weght +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", useWith='" + useWith + '\'' +
                ", brandKey=" + brandKey +
                ", subcategoryKey=" + subcategoryKey +
                ", orderID=" + orderID +
                '}';
    }



}
