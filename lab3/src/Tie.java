public class Tie extends Clothes implements ManClothes {
    public Tie(ClothesSize clothesSize, float pay, String color){
        super(clothesSize, pay, color);
    }
    @Override
    public void DressMan() {
        System.out.println("Мужчина одет в галстук " + getColor() + " цвета, размер " + getClothesSize().getDescription() );
    }

}
