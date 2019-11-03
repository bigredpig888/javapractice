package chapt1.createmode.factory;

public class StudentWork implements Work {


    @Override
    public void deWork() {
        System.out.println("学生做作业");
        System.out.println("远程");
        
    }
}
