public abstract class Clothes {
    public Clothes(){}
    public ClothesSize clothesSize;
    public float pay;
    public String color;
    public Clothes(ClothesSize clothesSize, float pay, String color){
        this.clothesSize = clothesSize;
        this.pay = pay;
        this.color = color;
    }

    public ClothesSize getClothesSize() {
        return clothesSize;
    }

    public float getPay() {
        return pay;
    }

    public String getColor() {
        return color;
    }

    public void setClothesSize(ClothesSize clothesSize) {
        this.clothesSize = clothesSize;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
