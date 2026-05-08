class leapYear{
    public static void main(String args[]){
        int year = 2020; // You can change this year to test with different values

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}