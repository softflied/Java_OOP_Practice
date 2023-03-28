import java.util.Scanner;

public class rentMain {

    public static void main(String[] args) {

        car car1 = new car(1,"bmw","34 KL 12",3000,false,"automatic",4);
        car car2 = new car(2,"mercedes","34 FLK 56",2500,true,"manual",6);
        car car3 = new car(3,"renault","32 OLK 354",4500,true,"automatic",1);

        motor motor1 = new motor(1,"BSA","34 RL 524",1250,"motorbike");
        motor motor2 = new motor(2,"FYM","21 FGJ 32",1500,"motorbike");
        motor motor3= new motor(3,"Dorado","34 FVB 454",800,"scooter");

        truck truck1 = new truck(1,"Scania","34 EF 45",3500,"benzine",20);
        truck truck2 = new truck(2,"BMW","34 RL 78",5400,"diesel",15);
        truck truck3 = new truck(3,"Mercedes","34 TYH 434",6000,"benzine",25);

        bus bus1 = new bus(1,"Mercedes","34 KJD 65",4500,"benzine",50);
        bus bus2 = new bus(2,"Scania","34 SDS 54",2750,"diesel",60);
        bus bus3 = new bus(3,"BMW","34 UIK 785",5000,"diesel",45);







        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("If you are a person press 1\nif you are a company press 2");
        int choose = scan.nextInt();

        if(choose==1)
        {
            System.out.println("What is your name: ");
            String name = scan.next();
            System.out.println("What is your Driving License: ");
            String DL = scan.next();

            //creating person list
            person person = new person(name,DL);
            person.name.add(name);
            person.DL.add(DL);
            for(int i =0;i<person.ID.size();i++)
            {
                person.ID.add(i);
            }

            System.out.println("Please choose what you want to rent: (Write CAR or MOTOR)");
            String chooseVehicle=scan.next();

            if(chooseVehicle.equals("CAR")&&DL.equals("B"))
            {
                System.out.println("please choose car Id (1,2 or 3)");
                int getCar=scan.nextInt();
                if(getCar==1)
                {
                    System.out.println(car1.toString());

                }
                if(getCar==2)
                {
                    System.out.println(car2.toString());
                }
                if(getCar==3)
                {
                    System.out.println(car3.toString());
                }


            }
            else if(chooseVehicle.equals("CAR")&&!DL.equals("B"))
                System.out.println("If your Driving License is not B you cannot rent any car. Please try again");

             else if (chooseVehicle.equals("MOTOR")&&DL.equals("A2"))
            {
                System.out.println("please choose motor Id (1,2 or 3)");
                int getMotor=scan.nextInt();
                if(getMotor==1)
                {
                    System.out.println(motor1.toString());

                }
                if(getMotor==2)
                {
                    System.out.println(motor2.toString());
                }
                if(getMotor==3)
                {
                    System.out.println(motor3.toString());
                }




            }
             else if (chooseVehicle.equals("MOTOR")&&!DL.equals("A2"))
                System.out.println("If your Driving License is not A2 you cannot rent any Motor. Please try again");
            else
                System.out.println("Something went wrong. Please try again with correct choice");

        }
        else if(choose==2)
        {
            System.out.println("What is your Company name: ");
            String CName = scan.next();
            System.out.println("what is your company's year of incorporation : ");
            int Year = scan.nextInt();

            //creating company list
            company company = new company(CName,Year);

            company.Cname.add(CName);
            company.Year.add(Year);
            for(int i =0;i<company.ID.size();i++)
            {
                company.ID.add(i);
            }

            System.out.println("Please choose what you want to rent: ( Write BUS or TRUCK)");
            String chooseVehicle=scan.next();
            if(chooseVehicle.equals("BUS")) {
                System.out.println("please choose Bus Id (1,2 or 3)");
                int getBus = scan.nextInt();
                if (getBus == 1) {
                    System.out.println(bus1.toString());

                }
                if (getBus == 2) {
                    System.out.println(bus2.toString());
                }
                if (getBus == 3) {
                    System.out.println(bus3.toString());
                }
            }
           else if(chooseVehicle.equals("TRUCK")) {
                System.out.println("please choose Truck Id (1,2 or 3)");
                int getTruck = scan.nextInt();
                if (getTruck == 1) {
                    System.out.println(truck1.toString());

                }
                if (getTruck == 2) {
                    System.out.println(truck2.toString());
                }
                if (getTruck == 3) {
                    System.out.println(truck3.toString());
                }
            }
            else
                System.out.println("Something went wrong. Please try again with correct choice");



        }
        else
            System.out.println("Something went wrong. Please try again with correct choice");








    }






}
