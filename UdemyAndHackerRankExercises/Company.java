package UdemyAndHackerRankExercises;

public class Company {

    private String name;
    private String date;
    private String code;

    public Company(String name, String date, String code) {
        this.name = name;
        this.date = date;
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
