public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String initials;
    private int length;

    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
        fullName = firstName + " " + middleName + " " + lastName;
        initials = ""+ firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0);
        length = fullName.length();
    }

    public String getFirst() {
        return firstName;
    }

    public String getMiddle() {
        return middleName;
    }

    public String getLast() {
        return lastName;
    }

    public String getFirstMiddleLast() {
        return fullName;
    }

    public String getLastFirstMiddle() {
        return lastName + ", " + firstName + " " + middleName;
    }

    public String getInitials() {
        return initials;
    }

    public int getLength() {
        return length;
    }

    public boolean equals(Name otherName) {
        return (fullName.equalsIgnoreCase(otherName.fullName));
    }

    public String toString() {
        return fullName;
    }
}
