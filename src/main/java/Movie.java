/**
 * Класс, описывающий фильм
 */
public class Movie {
    String name;
    int duration;
    String producer;
    Movie (String name,int duration,String producer){
        this.duration=duration;
        this.name=name;
        this.producer=producer;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }
    public void setProducer(String producer){
        this.producer=producer;
    }
    public String getName(){
        return name;
    }
    public int getDuration(){
        return duration;
    }
    public String getProducer(){
        return producer;
    }
}
