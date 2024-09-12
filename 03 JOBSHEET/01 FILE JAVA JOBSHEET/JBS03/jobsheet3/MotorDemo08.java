package jobsheet3;

public class MotorDemo08 {
    public static void main(String[] args) {
        Motor08 motor1 = new Motor08();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor08 motor2 = new Motor08();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(110);
        motor2.displayStatus();

        Motor08 motor3 = new Motor08();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setIsMesinOn(true);
        motor3.setKecepatan(-50);
        motor3.displayStatus();

        
    }
}
