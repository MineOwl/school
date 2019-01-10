
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class JugyouKanri {
    String classname = "math";
    List<Integer> scores = new ArrayList<Integer>();
    List<String> numbers = new ArrayList<String>();
    List<String> names = new ArrayList<String>();
    
    public void addstudent(int score,String number,String name){
        this.scores.add(score);
        this.numbers.add(number);
        this.names.add(name);
    }
    public void printstudents(){
        for(int i=0 ; i<scores.size();i++){
            System.out.println(scores.get(i) + " "+ numbers.get(i) +" "+ names.get(i));
        }
    }
}

class JugyouKanriPlus extends JugyouKanri{
    public void addstudent(int score,String number,String name){
        int flow = 0;
        for(int i=0 ; i<numbers.size();i++){
            if (numbers.get(i)==number){
                System.out.println(number+"is already exits");
                flow = 1;
            }
        }
        if (flow==0){
            this.scores.add(score);
            this.numbers.add(number);
            this.names.add(name);
        }
    }

    public void readdstudent(int newscore,String number,String name){
        for(int i=0 ; i<numbers.size();i++){
            if (numbers.get(i)==number){
                scores.set(i,newscore);
            }
        }
    }
}


public class test1 {
    public static void main(String[] args) {
        JugyouKanriPlus JugyouKanri_Obj =  new JugyouKanriPlus();
        JugyouKanri_Obj.addstudent(100,"1e16m068","yamada");
        JugyouKanri_Obj.addstudent(80,"1etj4ioji","josef");
        JugyouKanri_Obj.readdstudent(110,"1etj4ioji","josef");
        JugyouKanri_Obj.printstudents();
    }
}


