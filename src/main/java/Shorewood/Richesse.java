package Shorewood;

import Shorewood.Personnage.Personnage;

import java.util.Objects;

public class Richesse {
    private Personnage personnage;
    private Material material;
    private int quantity;

    public enum Material {
        OR,
        CUIR
    }

    public Richesse(Material material, int quantity,Personnage personnage) {
        this.material = material;
        this.quantity = quantity;
        this.personnage=personnage;
    }

    public Material getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Richesse richesse = (Richesse) o;
        return quantity == richesse.quantity && material == richesse.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, quantity);
    }

    @Override
    public String toString() {
        return "Richesse{" +
                "material=" + material +
                ", quantity=" + quantity +
                ", personnage="+personnage+
                '}';
    }
}


