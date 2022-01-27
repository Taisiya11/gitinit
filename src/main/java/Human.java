/**
 * Класс, описывающий человека
 */
public class Human {
    String surname;
    String name;
    String patronymic;
    int age;
    Human (String surname,String name,String patronymic,int age){
        this.age=age;
        this.name=name;
        this.patronymic=patronymic;
        this.surname=surname;
    }
    Human (){
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPatronymic(String patronymic){
        this.patronymic=patronymic;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return " Surname: "+ surname+"\n"+ " Name: "+
                name+"\n"+" Patronymic: "+patronymic+"\n"+
                " Age: "+age+"\n";
    }
}
