
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        } 
    }
    
    public void advance(int numberofDays) {
        while (numberofDays > 0) {
            this.advance();
            numberofDays--;
        }
    }
    
    public MyDate afterNumberOfDays(int days) {
        MyDate newMyDate = new MyDate(day, month, year);
        
        while (days > 0) {
            newMyDate.advance();
            days--;
        }
        
        return newMyDate;
    }
}
