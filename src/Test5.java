public class Test5 {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
    }
}

class T {
    static int i = 0; // ตัวแปร static ทุก object ของ T จะใช้ i ตัวเดียวกัน
    int j = 0; // ตัวแปร instance (แต่ละ object แยก j คนละตัว)

    T() {
        i++; // ทุกครั้งที่สร้าง object ใหม่ i จะเพิ่มทีละ 1
        j = 1; // ทุกครั้งที่สร้าง object ใหม่ j จะถูกเซ็ต = 1
    }
}
