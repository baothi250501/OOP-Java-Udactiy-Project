package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Subject{
    private String mName;
    private double mGrade;
    public Subject(){
        mName = "";
        mGrade = 0.0;
    }
    public Subject(String name, double grade){
        mName = name;
        mGrade = grade;
    }

    public void setGrade(double grade){
        mGrade = grade;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public double getGrade() {
        return mGrade;
    }

    public String getName() {
        return mName;
    }

    public String toString(){
        return mName + ": "+Double.toString(mGrade);
    }
}
class ReportCard{
    private String name;
    ArrayList<Subject> mSubjects;

    public ReportCard(){
        name = "";
        mSubjects = null;
    }

    void inputReportCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua hoc sinh: ");
        String name = scanner.nextLine();
        mSubjects = new ArrayList<Subject>();
        ArrayList<String> sbList = new ArrayList<String>();
        sbList.add("Math");
        sbList.add("Literature");
        sbList.add("English");
        sbList.add("Information Technology");
        sbList.add("Science");
        int choice;
        double gradeSb;
        for (int i = 0; i < 5; ++i){
            System.out.println("Chon mon hoc nhap diem:");
            System.out.println("1. Math");
            System.out.println("2. Literature");
            System.out.println("3. English");
            System.out.println("4. Information Technology");
            System.out.println("5. Science");
            choice = scanner.nextInt();
            System.out.println("Nhap diem cua mon hoc: ");
            gradeSb = scanner.nextDouble();
            mSubjects.add(new Subject(sbList.get(choice-1),gradeSb));
        }
    }
    @Override
    public String toString() {
        String res = "Name: " + name;
        for (Subject sb:mSubjects){
            res += sb.toString() + "; ";
        }
        return res;
    }
}
public class Main {

    public static void main(String[] args) {
	    ReportCard rC = new ReportCard();
	    rC.inputReportCard();
	    System.out.println(rC.toString());
    }
}
