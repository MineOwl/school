class TestRecord {
    String classname = "math";
    int sum = 0;
    int count = 0;
    static int passscore = 60;
    void TestRecord(){
        this.sum += 60;
        this.count++;
    }

    void addtestscore(int score){
        this.sum += score;
        this.count ++;
    }
    int getaverage(){
        if(this.sum / this.count >= this.passscore){
            System.out.println("You Passed Exam!!!!");
        }
        return this.sum / this.count;
    }
}


public class sample2 {
    public static void main(String[] args) {
        TestRecord hanakotest_Obj =  new TestRecord();
        hanakotest_Obj.addtestscore(40);
        System.out.println(hanakotest_Obj.getaverage());
        hanakotest_Obj.addtestscore(50);
        System.out.println(hanakotest_Obj.getaverage());
        hanakotest_Obj.addtestscore(90);
        System.out.println(hanakotest_Obj.getaverage());
    }
}



