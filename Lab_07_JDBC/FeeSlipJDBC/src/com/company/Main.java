package com.company;
import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("Welcome to FeeSlip Management System!");
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FeeSlip","root","");
            Statement statement = connection.createStatement();
            System.out.println("You are connected to the SEECS DB!");
            int choice;
            System.out.println("Enter what you want to do? 1. Display Records, 2. Add Records, 3. Delete Records, 4. Update Records");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice){
                case 1:
                    displayRecords(statement);
                    break;
                case 2:
                    addRecords(statement);
                    break;
                case 3:
                    deleteRecords(statement);
                    break;
                case 4:
                    updateRecords(connection);
                    break;
                default:
                    System.out.println("Wrong Choice!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static void displayRecords(Statement statement) throws Exception{
        ResultSet resultSet = statement.executeQuery("select * from StudentData");
        System.out.println("Retrieving Data From The SEECS DB");
        while(resultSet.next()){
            System.out.println("Reg Nbr: " + resultSet.getInt( 1));
            System.out.println("First Name: " + resultSet.getString( 2));
            System.out.println("Second Name: " + resultSet.getString( 3));
            System.out.println("Fee Month: " + resultSet.getString( 4));
            System.out.println("Fee Date: " + resultSet.getString( 5));
            System.out.println();
        }

    }
    static void addRecords(Statement statement) throws Exception{
        String firstName, secondName, feeMonth, feeDate; int regNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        firstName = input.next();
        System.out.println("Enter Second Name: ");
        secondName = input.next();
        System.out.println("Enter Fee Month: ");
        feeMonth = input.next();
        System.out.println("Enter Reg Nbr: ");
        regNumber = input.nextInt();
        System.out.println("Enter Fee Date (2008-11-11): ");
        feeDate = input.next();
        statement.executeUpdate("INSERT INTO StudentData VALUES('"+regNumber+"', '"+firstName+"', '"+secondName+"', '"+feeMonth+"', '"+feeDate+"')");
        System.out.println("Record Added!");
    }
    static void deleteRecords(Statement statement) throws Exception{
        int regNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Reg Nbr to Delete: ");
        regNumber = input.nextInt();
        statement.execute("DELETE FROM StudentData WHERE reg_number = " + regNumber);
        System.out.println("Record Deleted!");
    }
    static void updateRecords(Connection connection) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to update? 1. FirstName, 2. Fee Month, 3. FeeDate");
        int choice = input.nextInt();
        int regNumber;
        System.out.println("Enter Reg Nbr: ");
        regNumber = input.nextInt();
        switch (choice){
            case 1:
                String newFirstName;
                System.out.println("Enter new First Name: ");
                newFirstName = input.next();
                PreparedStatement preparedStmt = connection.prepareStatement("UPDATE `StudentData` SET `firstName` = '"+newFirstName+"' WHERE `reg_number` = '"+regNumber+"'");
                preparedStmt.executeUpdate();
                System.out.println("Record Updated!");
                break;
            case 2:
                String newFeeMonth;
                System.out.println("Enter new Fee Month: ");
                newFeeMonth = input.next();
                PreparedStatement preparedStmtfee = connection.prepareStatement("UPDATE `StudentData` SET `feeMonth` = '"+newFeeMonth+"' WHERE `reg_number` = '"+regNumber+"'");
                preparedStmtfee.executeUpdate();
                System.out.println("Record Updated!");
                break;
            case 3:
                String newFeeDate;
                System.out.println("Enter new Fee Date: ");
                newFeeDate = input.next();
                PreparedStatement preparedStmtfeeDate = connection.prepareStatement("UPDATE `StudentData` SET `currentDate` = '"+newFeeDate+"' WHERE `reg_number` = '"+regNumber+"'");
                preparedStmtfeeDate.executeUpdate();
                System.out.println("Record Updated!");
                break;
            default:
                System.out.println("Enter Correct Choice!");
        }

    }
}
