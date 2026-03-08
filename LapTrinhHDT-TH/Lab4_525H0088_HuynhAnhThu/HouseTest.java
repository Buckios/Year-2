public class HouseTest {
    public static void main(String[] args) {
        House house1 = new House();
        System.out.println(house1.toString());

        House house2 = new House("B02", 4, true, 100, 2500000);
        System.out.println(house2.toString());
        
        house1.setHouseCode("C03");
        house1.setNumOfBedRooms(3);
        house1.setHasSwimmingPool(false);
        house1.setArea(150);
        house1.setCostPerSquareMeter(2000000);
        
        System.out.println(house1.getHouseCode());
        System.out.println(house1.getNumOfBedRooms());
        System.out.println(house1.isHasSwimmingPool());
        System.out.println(house1.getArea());
        System.out.println(house1.getCostPerSquareMeter());
        System.out.println(house1.calculateSellingPrice());
        System.out.println(house1.toString());
    }
}