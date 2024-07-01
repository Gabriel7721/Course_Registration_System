package com.iuh.kttkpm.be.registCourses.models;

public enum WeekDay {
    MONDAY1_3("Thứ 2 (T1 -> T3)"),
    MONDAY4_6("Thứ 2 (T4 -> T6)"),
    MONDAY7_9("Thứ 2 (T7 -> T9)"),
    MONDAY10_12("Thứ 2 (T10 -> T12)"),
    MONDAY13_15("Thứ 2 (T13 -> T15)"),
    MONDAY1_2("Thứ 2 (T1 -> T2)"),
    MONDAY3_4("Thứ 2 (T3 -> T4)"),
    MONDAY5_6("Thứ 2 (T5 -> T6)"),
    MONDAY7_8("Thứ 2 (T7 -> T8)"),
    MONDAY9_10("Thứ 2 (T9 -> T10)"),
    MONDAY11_12("Thứ 2 (T11 -> T12)"),
    MONDAY13_14("Thứ 2 (T13 -> T14)"),
    TUESDAY1_3("Thứ 3 (T1 -> T3)"),
    TUESDAY4_6("Thứ 3 (T4 -> T6)"),
    TUESDAY7_9("Thứ 3 (T7 -> T9)"),
    TUESDAY10_12("Thứ 3 (T10 -> T12)"),
    TUESDAY13_15("Thứ 3 (T13 -> T15)"),
    TUESDAY1_2("Thứ 3 (T1 -> T2)"),
    TUESDAY3_4("Thứ 3 (T3 -> T4)"),
    TUESDAY5_6("Thứ 3 (T5 -> T6)"),
    TUESDAY7_8("Thứ 3 (T7 -> T8)"),
    TUESDAY9_10("Thứ 3 (T9 -> T10)"),
    TUESDAY11_12("Thứ 3 (T11 -> T12)"),
    TUESDAY13_14("Thứ 3 (T13 -> T14)"),
    WEDNESDAY1_3("Thứ 4 (T1 -> T3)"),
    WEDNESDAY4_6("Thứ 4 (T4 -> T6)"),
    WEDNESDAY7_9("Thứ 4 (T7 -> T9)"),
    WEDNESDAY10_12("Thứ 4 (T10 -> T12)"),
    WEDNESDAY13_15("Thứ 4 (T13 -> T15)"),
    WEDNESDAY1_2("Thứ 4 (T1 -> T2)"),
    WEDNESDAY3_4("Thứ 4 (T3 -> T4)"),
    WEDNESDAY5_6("Thứ 4 (T5 -> T6)"),
    WEDNESDAY7_8("Thứ 4 (T7 -> T8)"),
    WEDNESDAY9_10("Thứ 4 (T9 -> T10)"),
    WEDNESDAY11_12("Thứ 4 (T11 -> T12)"),
    WEDNESDAY13_14("Thứ 4 (T13 -> T14)"),
    THURSDAY1_3("Thứ 5 (T1 -> T3)"),
    THURSDAY4_6("Thứ 5 (T4 -> T6)"),
    THURSDAY7_9("Thứ 5 (T7 -> T9)"),
    THURSDAY10_12("Thứ 5 (T10 -> T12)"),
    THURSDAY13_15("Thứ 5 (T13 -> T15)"),
    THURSDAY1_2("Thứ 5 (T1 -> T2)"),
    THURSDAY3_4("Thứ 5 (T3 -> T4)"),
    THURSDAY5_6("Thứ 5 (T5 -> T6)"),
    THURSDAY7_8("Thứ 5 (T7 -> T8)"),
    THURSDAY9_10("Thứ 5 (T9 -> T10)"),
    THURSDAY11_12("Thứ 5 (T11 -> T12)"),
    THURSDAY13_14("Thứ 5 (T13 -> T14)"),
    FRIDAY1_3("Thứ 6 (T1 -> T3)"),
    FRIDAY4_6("Thứ 6 (T4 -> T6)"),
    FRIDAY7_9("Thứ 6 (T7 -> T9)"),
    FRIDAY10_12("Thứ 6 (T10 -> T12)"),
    FRIDAY13_15("Thứ 6 (T13 -> T15)"),
    FRIDAY1_2("Thứ 6 (T1 -> T2)"),
    FRIDAY3_4("Thứ 6 (T3 -> T4)"),
    FRIDAY5_6("Thứ 6 (T5 -> T6)"),
    FRIDAY7_8("Thứ 6 (T7 -> T8)"),
    FRIDAY9_10("Thứ 6 (T9 -> T10)"),
    FRIDAY11_12("Thứ 6 (T11 -> T12)"),
    FRIDAY13_14("Thứ 6 (T13 -> T14)"),
    SATURDAY1_3("Thứ 7 (T1 -> T3)"),
    SATURDAY4_6("Thứ 7 (T4 -> T6)"),
    SATURDAY7_9("Thứ 7 (T7 -> T9)"),
    SATURDAY10_12("Thứ 7 (T10 -> T12)"),
    SATURDAY13_15("Thứ 7 (T13 -> T15)"),
    SATURDAY1_2("Thứ 7 (T1 -> T2)"),
    SATURDAY3_4("Thứ 7 (T3 -> T4)"),
    SATURDAY5_6("Thứ 7 (T5 -> T6)"),
    SATURDAY7_8("Thứ 7 (T7 -> T8)"),
    SATURDAY9_10("Thứ 7 (T9 -> T10)"),
    SATURDAY11_12("Thứ 7 (T11 -> T12)"),
    SATURDAY13_14("Thứ 7 (T13 -> T14)"),
    SUNDAY1_3("Chủ nhật (T1 -> T3)"),
    SUNDAY4_6("Chủ nhật (T4 -> T6)"),
    SUNDAY7_9("Chủ nhật (T7 -> T9)"),
    SUNDAY10_12("Chủ nhật (T10 -> T12)"),
    SUNDAY13_15("Chủ nhật (T13 -> T15)"),
    SUNDAY1_2("Chủ nhật (T1 -> T2)"),
    SUNDAY3_4("Chủ nhật (T3 -> T4)"),
    SUNDAY5_6("Chủ nhật (T5 -> T6)"),
    SUNDAY7_8("Chủ nhật (T7 -> T8)"),
    SUNDAY9_10("Chủ nhật (T9 -> T10)"),
    SUNDAY11_12("Chủ nhật (T11 -> T12)"),
    SUNDAY13_14("Chủ nhật (T13 -> T14)");

    private String displayName;

    WeekDay(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static WeekDay fromDisplayName(String displayName) {
        for (WeekDay day : WeekDay.values()) {
            if (day.getDisplayName().equals(displayName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("No enum constant with display name " + displayName);
    }

}
