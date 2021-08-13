package com.mycompany.banksystemoop;

import javax.swing.SwingUtilities;
import java.io.*;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.formula.functions.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportData {

    public ImportData() throws IOException {

        {
            File normalClientsFile = new File("src\\main\\java\\com\\mycompany\\banksystemoop\\ExcelData\\Normal Clients.xlsx");
            FileInputStream fisNormal = new FileInputStream(normalClientsFile);
            XSSFWorkbook wbNormal = new XSSFWorkbook(fisNormal);
            XSSFSheet sheetNormal = wbNormal.getSheetAt(0);

            Row row24_NumberOfClients= sheetNormal.getRow(24);
            Cell cell_NumberOfClients = row24_NumberOfClients.getCell(1);
            int ClientsNumber = (int) Double.parseDouble(cell_NumberOfClients.toString());        // number of clients in sheet

            Cell [] cell_fName = new Cell[ClientsNumber];
            String [] userfName = new String[ClientsNumber];
            Cell [] cell_lName = new Cell[ClientsNumber];
            String [] userlName = new String[ClientsNumber];
            Cell [] cell_Username = new Cell[ClientsNumber];
            String [] Username = new String[ClientsNumber];
            Cell [] cell_password = new Cell[ClientsNumber];
            String [] userPassword = new String[ClientsNumber];
            Cell [] cell_pin = new Cell[ClientsNumber];
            String [] userPin = new String[ClientsNumber];
            Cell [] cell_accountType = new Cell[ClientsNumber];
            String [] userAccountType = new String[ClientsNumber];
            Cell [] cell_Birthday = new Cell[ClientsNumber];
            String [] userBirthday = new String[ClientsNumber];
            Cell [] cell_Nationality = new Cell[ClientsNumber];
            String [] userNationality = new String[ClientsNumber];
            Cell [] cell_NationalID = new Cell[ClientsNumber];
            String [] userNationalID = new String[ClientsNumber];
            Cell [] cell_Address = new Cell[ClientsNumber];
            String [] userAddress = new String[ClientsNumber];
            Cell [] cell_Job = new Cell[ClientsNumber];
            String [] userJob = new String[ClientsNumber];
            Cell [] cell_PostalCode = new Cell[ClientsNumber];
            String [] userPostalCode = new String[ClientsNumber];
            Cell [] cell_AccountNumber = new Cell[ClientsNumber];
            long [] userAccountNumber = new long[ClientsNumber];
            Cell [] cell_salary = new Cell[ClientsNumber];
            double [] userSalary = new double[ClientsNumber];
            Cell [] cell_PhoneNumber = new Cell[ClientsNumber];
            String [] userPhoneNumber = new String[ClientsNumber];
            Cell [] cell_MartialStatus = new Cell[ClientsNumber];
            String [] userMartialStatus = new String[ClientsNumber];
            Cell [] cell_debitStatus = new Cell[ClientsNumber];
            boolean [] userDebitStatus = new boolean[ClientsNumber];
            Cell [] cell_loanRequest = new Cell[ClientsNumber];
            boolean [] userLoanRequest = new boolean[ClientsNumber];
            Cell [] cell_balance = new Cell[ClientsNumber];
            double [] userBalance = new double[ClientsNumber];
            Cell [] cell_lastDeposit = new Cell[ClientsNumber];
            double [] userLastDeposit = new double[ClientsNumber];
            Cell [] cell_lastWithdraw = new Cell[ClientsNumber];
            double [] userLastWithdraw = new double[ClientsNumber];

            Row row0_fName = sheetNormal.getRow(0);
            Row row1_lName = sheetNormal.getRow(1);
            Row row2_Username = sheetNormal.getRow(2);
            Row row3_Password = sheetNormal.getRow(3);
            Row row4_Pin = sheetNormal.getRow(4);
            Row row5_AccountType = sheetNormal.getRow(5);
            Row row6_Birthday = sheetNormal.getRow(6);
            Row row7_Nationality = sheetNormal.getRow(7);
            Row row8_NationalID = sheetNormal.getRow(8);
            Row row9_Address = sheetNormal.getRow(9);
            Row row10_Job = sheetNormal.getRow(10);
            Row row11_PostalCode = sheetNormal.getRow(11);
            Row row12_AccountNumber= sheetNormal.getRow(12);
            Row row13_Salary = sheetNormal.getRow(13);
            Row row14_PhoneNumber = sheetNormal.getRow(14);
            Row row15_MartialStatus = sheetNormal.getRow(15);
            Row row16_DebitStatus = sheetNormal.getRow(16);
            Row row17_LoanRequest = sheetNormal.getRow(17);
            Row row18_Balance = sheetNormal.getRow(18);
            Row row21_LastDeposit = sheetNormal.getRow(21);
            Row row22_LastWithdraw = sheetNormal.getRow(22);

            for (int i = 1; i <= ClientsNumber; i++){
                cell_fName[i-1] = row0_fName.getCell(i);        // Get
                userfName[i-1] = cell_fName[i-1].toString();    // Cast
                cell_lName[i-1] = row1_lName.getCell(i);           // Get
                userlName[i-1] = cell_lName[i-1].toString();       // Cast
                cell_Username[i-1] = row2_Username.getCell(i);
                Username[i-1] = cell_Username[i-1].toString();
                cell_password[i-1] = row3_Password.getCell(i);
                userPassword[i-1] = cell_password[i-1].toString();
                cell_pin[i-1] = row4_Pin.getCell(i);
                userPin[i-1] = cell_pin[i-1].toString();
                cell_accountType[i-1] = row5_AccountType.getCell(i);
                userAccountType[i-1] = cell_accountType[i-1].toString();
                cell_Birthday[i-1] = row6_Birthday.getCell(i);
                userBirthday[i-1] = cell_Birthday[i-1].toString();
                cell_Nationality[i-1] = row7_Nationality.getCell(i);
                userNationality[i-1] = cell_Nationality[i-1].toString();
                cell_NationalID[i-1] = row8_NationalID.getCell(i);
                userNationalID[i-1] = cell_NationalID[i-1].toString();
                cell_Address[i-1] = row9_Address.getCell(i);
                userAddress[i-1] = cell_Address[i-1].toString();
                cell_Job[i-1] = row10_Job.getCell(i);
                userJob[i-1] = cell_Job[i-1].toString();
                cell_PostalCode[i-1] = row11_PostalCode.getCell(i);
                userPostalCode[i-1] = cell_PostalCode[i-1].toString();
                cell_AccountNumber[i-1] = row12_AccountNumber.getCell(i);
                userAccountNumber[i-1] = Long.parseLong(cell_AccountNumber[i-1].toString());
                cell_salary[i-1] = row13_Salary.getCell(i);
                userSalary[i-1] = Double.parseDouble(cell_salary[i-1].toString());
                cell_PhoneNumber[i-1] = row14_PhoneNumber.getCell(i);
                userPhoneNumber[i-1] = cell_PhoneNumber[i-1].toString();
                cell_MartialStatus[i-1] = row15_MartialStatus.getCell(i);
                userMartialStatus[i-1] = cell_MartialStatus[i-1].toString();
                cell_debitStatus[i-1] = row16_DebitStatus.getCell(i);
                userDebitStatus[i-1] = Boolean.parseBoolean(cell_debitStatus[i-1].toString());
                cell_loanRequest[i-1] = row17_LoanRequest.getCell(i);
                userLoanRequest[i-1] = Boolean.parseBoolean(cell_loanRequest[i-1].toString());
                cell_balance[i-1] = row18_Balance.getCell(i);
                userBalance[i-1] = Double.parseDouble(cell_balance[i-1].toString());
                cell_lastDeposit[i-1] = row21_LastDeposit.getCell(i);
                userLastDeposit[i-1] = Double.parseDouble(cell_lastDeposit[i-1].toString());
                cell_lastWithdraw[i-1] = row22_LastWithdraw.getCell(i);
                userLastWithdraw[i-1] = Double.parseDouble(cell_lastWithdraw[i-1].toString());
            }

            for (int j = 0; j < ClientsNumber; j++) {
                Account.Clients[j] = new Account(userfName[j],userlName[j], Username[j],userPassword[j],userPin[j], userAccountType[j],
                        userBirthday[j],userNationality[j],userNationalID[j],userAddress[j],userJob[j],userPostalCode[j],
                        userSalary[j], userPhoneNumber[j], userMartialStatus[j],userDebitStatus[j],userLoanRequest[j],
                        userBalance[j],userLastDeposit[j], userLastWithdraw[j]);
                Account.Clients[j].setAccountNumber(userAccountNumber[j]);
            }

        }
    }
}
