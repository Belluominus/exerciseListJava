package main.model.entities;

public class Student {
    public String name;
    public Double gradeFirstQuarter;
    public Double gradeSecondQuarter;
    public Double gradeThirdQuarter;

    public Student(String name,double gradeFirstQuarter,double gradeSecondQuarter,double gradeThirdQuarter){
        this.name = name;
        this.gradeFirstQuarter = gradeFirstQuarter;
        this.gradeSecondQuarter = gradeSecondQuarter;
        this.gradeThirdQuarter = gradeThirdQuarter;
    }

    public double finalGrade(){
        return gradeFirstQuarter + gradeSecondQuarter + gradeThirdQuarter;
    }

    public boolean isAproved () {
        if(this.finalGrade() < 60) {
            return false;
        }else{
            return true;
        }
    }

    public double missingGrade () {
        return 60.00 - this.finalGrade();
    }
}