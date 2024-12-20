public class Date{
    private int Month;
    private int Day;
    private int Year;
    public Date(int Month,int Day,int Year){
        this.Month=Month;
        this.Day=Day;
        this.Year=Year;
        if(Month>=1 && Month<=12){
            Month=1;}
        }
    public void displayDate(){
        System.out.println("Todays date is "+" "+Month+"/"+Day+"/"+Year);
    }
    public static void main(String[] args){
        Date Date1=new Date(12,12,2024);
        Date1.displayDate();
    }
    }
    




















/*(Date Class) Create a class called Date that includes three pieces of information as data
members a month (type int), a day (type int) and a year (type int). Your class should have a
constructor with three parameters that uses the parameters to initialize the three data
members. For the purpose of this exercise, assume that the values provided for the year
and day are correct, but ensure that the month value is in the range 1-12; if it is not, set
the month to 1. Provide a member function displayDate that displays the month, day and
year separated by forward slashes (/). Write a test program that demonstrates class
Date's capabilities*/