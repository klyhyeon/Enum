public class EnumTest {

    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellLikeThis() {
        switch(day) {
            case MONDAY:
                System.out.println("X morning");
                break;
            case FRIDAY:
                System.out.println(":) MORNING");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("BEST MOMENTS");
                break;
            default:
                System.out.println("SSDD");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellLikeThis();
        EnumTest secondDay = new EnumTest(Day.TUESDAY);
        secondDay.tellLikeThis();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellLikeThis();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellLikeThis();
    }

}
