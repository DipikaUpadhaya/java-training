package day17;
// WE CANNOT CREATE OBJECTS OF ENUM CLASS BECOAUSE THEY ARE ALREADY CREATED
//i.e these weekday sunday monday.. all are objects

//difference is we create objects within the enum class itself(in other we create objects in main class)
public enum WeekDay {
    SATURDAY(0), SUNDAY(1) ,MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6);

    private int abbr;
    WeekDay(int abbr){
        this.abbr= abbr;
    }

    public int getAbbr() {
        return abbr;
    }
}
