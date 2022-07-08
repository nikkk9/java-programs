class MCA {
    String job;
    int salary;

    public void sde(String job) {
        System.out.println(job);
    }

    public void sde(int salary) {
        System.out.println(salary);
    }

    public void sde(String job, int salary) {
        System.out.println(job + " " + salary);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        MCA m1 = new MCA();
        m1.job = "Web Developer";
        m1.salary = 500000;
        m1.sde(m1.job);
        m1.sde(m1.salary);
        m1.sde(m1.job, m1.salary);
    }

}
