public class Trousers extends Clothes implements WomenClothes,ManClothes{
    public Trousers(ClothesSize clothesSize, float pay, String color){
        super(clothesSize, pay, color);
    }
    @Override
    public void DressMan() {
        System.out.println("Мужчина одет в брюки " + getColor() + " цвета, размер " + getClothesSize().getDescription());
    }

    @Override
    public void DressWoman() {
        System.out.println("Женщина одета в брюки " + getColor() + " цвета, размер " + getClothesSize().getDescription());
    }
}