public class Author {
    private String name;
    private String email;
    private char gender;
    public void Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){return gender;}
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        String s = "Имя автора: " + name + "\n" + "Email автора: " + email + "\n" + "Пол: " + gender;
        return s;
    }


}
