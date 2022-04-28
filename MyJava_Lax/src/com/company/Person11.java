package com.company;

import java.util.Scanner;

public class PersonDetail {
    private String name;
    private String Dob;
    private String gender;
    private String mobileNumb;
    private String bloodgroup;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getDob(){return Dob;}
    public void setDob(String Dob){this.Dob = Dob;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    public String getMobileNumb(){return mobileNumb;}
    public void setMobileNumb(String mobileNumb){this.mobileNumb = mobileNumb;}

    public String getBloodgroup(){return bloodgroup;}
    public void setBloodgroup(String bloodgroup){this.bloodgroup = bloodgroup;}

    public static class donor extends PersonDetail {
        private String bloodbankname;
        private String bloodtype;
        private String donationdate;


        public String getBloodbankname(){return bloodbankname;}
        public void setBloodbankname(String bloodbankname){this.bloodbankname = bloodbankname;}


        public String getBloodtype(){return bloodtype;}
        public void setBloodtype(String bloodType){this.bloodtype = bloodtype;}


        public String getDonationDate(){return donationdate;}
        public void setDonationDate(String donationDate){this.donationdate = donationdate;}

    public void DisPLayDonationDetails(donor d){
            System.out.println("Donation Details");
        System.out.println("NaMe : "+ d.getName());
        System.out.println("Date of BIrTH : "+ d.getDob());
        System.out.println("MObILeNUMber : "+ d.getMobileNumb());
        System.out.println("Bloodgroup : "+ d.getBloodgroup());
        System.out.println("Bloodbanknam : "+ d.getBloodbankname());
        System.out.println("BLoODtYpE : "+ d.getBloodtype());
        System.out.println("DonationDaTE : "+ d.getDonationDate());
        }



    }
    public static void main(String[] args){
        donor d = new donor();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        d.setName(sc.nextLine());


        System.out.println("Enter the dob");
        d.setDob(sc.nextLine());


        System.out.println("Enter the gender");
        d.setGender(sc.nextLine());


        System.out.println("Enter the mobile no");
        d.setMobileNumb(sc.nextLine());


        System.out.println("Enter the blood group");
        d.setBloodgroup(sc.nextLine());


        System.out.println("Enter the blood bank name");
        d.setBloodbankname(sc.nextLine());


        System.out.println("Enter the blood type");
        d.setBloodtype(sc.nextLine());


        System.out.println("Enter the donationdate");
        d.setDonationDate(sc.nextLine());

        d.DisPLayDonationDetails(d);
    }
}
