import java.util.HashMap;

class Student {
    String firstName, lastName, otherName;
    String matricNo;
    char gender;

    Student(String fname, String lname, char gender) {
        this.firstName = fname;
        this.lastName = lname;
        this.gender = gender;

        this.setName(this.firstName, this.lastName);
    }

    private HashMap<String, String> setName(String firstName2, String lastName2) {
        HashMap<String, String> fullname = new HashMap<>();
        fullname.put("firstname", "Jackson");
        fullname.put("lastname", "Brogues");

        return fullname;
    }

}