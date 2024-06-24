public class Main1 {

    private String Name;
    private String Email;
    private String Type;
    private String Country;

    public Main1(String n, String e, String t, String c){
        Name = n;
        Email = e;
        Type = t;
        Country = c;
    }

    public String getName(){
        return Name;
    }

    public String getEmail(){
        return Email;
    }

    public String getType(){
        return Type;
    }

    public String getCountry(){
        return Country;
    }
}

