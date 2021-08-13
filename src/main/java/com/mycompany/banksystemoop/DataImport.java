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

public class DataImport {

    public DataImport() throws IOException {
        // import Normal Clients
       {

            File normalClientsFile = new File("src\\main\\java\\com\\mycompany\\banksystemoop\\ExcelData\\Normal Clients.xlsx");
            FileInputStream fisNormal = new FileInputStream(normalClientsFile);
            XSSFWorkbook wbNormal = new XSSFWorkbook(fisNormal);
            XSSFSheet sheetNormal = wbNormal.getSheetAt(0);

            // get First name
            Row row0_fName = sheetNormal.getRow(0);
            Cell cell_fName_01 = row0_fName.getCell(1);
            Cell cell_fName_02 = row0_fName.getCell(2);
            Cell cell_fName_03 = row0_fName.getCell(3);
            Cell cell_fName_04 = row0_fName.getCell(4);
            Cell cell_fName_05 = row0_fName.getCell(5);
            Cell cell_fName_06 = row0_fName.getCell(6);



            // "First name" Cell Casting from Object to String
            String user1fName = cell_fName_01.toString();
            String user2fName = cell_fName_02.toString();
            String user3fName = cell_fName_03.toString();
            String user4fName = cell_fName_04.toString();
            String user5fName = cell_fName_05.toString();
            String user6fName = cell_fName_06.toString();

            // get Second name
            Row row1_lName = sheetNormal.getRow(1);
            Cell cell_sName_11 = row1_lName.getCell(1);
            Cell cell_sName_12 = row1_lName.getCell(2);
            Cell cell_sName_13 = row1_lName.getCell(3);
            Cell cell_sName_14 = row1_lName.getCell(4);
            Cell cell_sName_15 = row1_lName.getCell(5);
            Cell cell_sName_16 = row1_lName.getCell(6);

            //"Second Name" Cell Casting from Object to String
            String user1sName = cell_sName_11.toString();
            String user2sName = cell_sName_12.toString();
            String user3sName = cell_sName_13.toString();
            String user4sName = cell_sName_14.toString();
            String user5sName = cell_sName_15.toString();
            String user6sName = cell_sName_16.toString();

            // get Username
            Row row2_Username = sheetNormal.getRow(2);
            Cell cell_Username_21 = row2_Username.getCell(1);
            Cell cell_Username_22 = row2_Username.getCell(2);
            Cell cell_Username_23 = row2_Username.getCell(3);
            Cell cell_Username_24 = row2_Username.getCell(4);
            Cell cell_Username_25 = row2_Username.getCell(5);
            Cell cell_Username_26 = row2_Username.getCell(6);

            //"Username" Cell Casting from Object to String
            String user1Username = cell_Username_21.toString();
            String user2Username = cell_Username_22.toString();
            String user3Username = cell_Username_23.toString();
            String user4Username = cell_Username_24.toString();
            String user5Username = cell_Username_25.toString();
            String user6Username = cell_Username_26.toString();

            // get Password
            Row row3_Password = sheetNormal.getRow(3);
            Cell cell_Password_31 = row3_Password.getCell(1);
            Cell cell_Password_32 = row3_Password.getCell(2);
            Cell cell_Password_33 = row3_Password.getCell(3);
            Cell cell_Password_34 = row3_Password.getCell(4);
            Cell cell_Password_35 = row3_Password.getCell(5);
            Cell cell_Password_36 = row3_Password.getCell(6);

            //"Password" Cell Casting from Object to String
            String user1Password = cell_Password_31.toString();
            String user2Password = cell_Password_32.toString();
            String user3Password = cell_Password_33.toString();
            String user4Password = cell_Password_34.toString();
            String user5Password = cell_Password_35.toString();
            String user6Password = cell_Password_36.toString();

            // get Pin
            Row row4_Pin = sheetNormal.getRow(4);
            Cell cell_Pin_41 = row4_Pin.getCell(1);
            Cell cell_Pin_42 = row4_Pin.getCell(2);
            Cell cell_Pin_43 = row4_Pin.getCell(3);
            Cell cell_Pin_44 = row4_Pin.getCell(4);
            Cell cell_Pin_45 = row4_Pin.getCell(5);
            Cell cell_Pin_46 = row4_Pin.getCell(6);

            //"Pin" Cell Casting from Object to String
            String user1Pin = cell_Pin_41.toString();
            String user2Pin = cell_Pin_42.toString();
            String user3Pin = cell_Pin_43.toString();
            String user4Pin = cell_Pin_44.toString();
            String user5Pin = cell_Pin_45.toString();
            String user6Pin = cell_Pin_46.toString();


            // get Account Type
            Row row5_AccountType = sheetNormal.getRow(5);
            Cell cell_AccType_51 = row5_AccountType.getCell(1);
            Cell cell_AccType_52 = row5_AccountType.getCell(2);
            Cell cell_AccType_53 = row5_AccountType.getCell(3);
            Cell cell_AccType_54 = row5_AccountType.getCell(4);
            Cell cell_AccType_55 = row5_AccountType.getCell(5);
            Cell cell_AccType_56 = row5_AccountType.getCell(6);

            //"Account Type" Cell Casting from Object to String
            String user1AccType = cell_AccType_51.toString();
            String user2AccType = cell_AccType_52.toString();
            String user3AccType = cell_AccType_53.toString();
            String user4AccType = cell_AccType_54.toString();
            String user5AccType = cell_AccType_55.toString();
            String user6AccType = cell_AccType_56.toString();

            // get Birthday
            Row row6_Birthday = sheetNormal.getRow(6);
            Cell cell_Birthday_61 = row6_Birthday.getCell(1);
            Cell cell_Birthday_62 = row6_Birthday.getCell(2);
            Cell cell_Birthday_63 = row6_Birthday.getCell(3);
            Cell cell_Birthday_64 = row6_Birthday.getCell(4);
            Cell cell_Birthday_65 = row6_Birthday.getCell(5);
            Cell cell_Birthday_66 = row6_Birthday.getCell(6);

            //"Birthday" Cell Casting from Object to String
            String user1Birthday = cell_Birthday_61.toString();
            String user2Birthday = cell_Birthday_62.toString();
            String user3Birthday = cell_Birthday_63.toString();
            String user4Birthday = cell_Birthday_64.toString();
            String user5Birthday = cell_Birthday_65.toString();
            String user6Birthday = cell_Birthday_66.toString();

            // get Nationality
            Row row7_Nationality = sheetNormal.getRow(7);
            Cell cell_Nationality_71 = row7_Nationality.getCell(1);
            Cell cell_Nationality_72 = row7_Nationality.getCell(2);
            Cell cell_Nationality_73 = row7_Nationality.getCell(3);
            Cell cell_Nationality_74 = row7_Nationality.getCell(4);
            Cell cell_Nationality_75 = row7_Nationality.getCell(5);
            Cell cell_Nationality_76 = row7_Nationality.getCell(6);

            //"Nationality" Cell Casting from Object to String
            String user1Nationality = cell_Nationality_71.toString();
            String user2Nationality = cell_Nationality_72.toString();
            String user3Nationality = cell_Nationality_73.toString();
            String user4Nationality = cell_Nationality_74.toString();
            String user5Nationality = cell_Nationality_75.toString();
            String user6Nationality = cell_Nationality_76.toString();


            // get National ID
            Row row8_NationalID = sheetNormal.getRow(8);
            Cell cell_NationalID_81 = row8_NationalID.getCell(1);
            Cell cell_NationalID_82 = row8_NationalID.getCell(2);
            Cell cell_NationalID_83 = row8_NationalID.getCell(3);
            Cell cell_NationalID_84 = row8_NationalID.getCell(4);
            Cell cell_NationalID_85 = row8_NationalID.getCell(5);
            Cell cell_NationalID_86 = row8_NationalID.getCell(6);

            //"Nationality" Cell Casting from Object to String
            String user1NationalID = cell_NationalID_81.toString();
            String user2NationalID = cell_NationalID_82.toString();
            String user3NationalID = cell_NationalID_83.toString();
            String user4NationalID = cell_NationalID_84.toString();
            String user5NationalID = cell_NationalID_85.toString();
            String user6NationalID = cell_NationalID_86.toString();

            // get Address
            Row row9_Address = sheetNormal.getRow(9);
            Cell cell_Address_91 = row9_Address.getCell(1);
            Cell cell_Address_92 = row9_Address.getCell(2);
            Cell cell_Address_93 = row9_Address.getCell(3);
            Cell cell_Address_94 = row9_Address.getCell(4);
            Cell cell_Address_95 = row9_Address.getCell(5);
            Cell cell_Address_96 = row9_Address.getCell(6);

            //"Address" Cell Casting from Object to String
            String user1Address = cell_Address_91.toString();
            String user2Address = cell_Address_92.toString();
            String user3Address = cell_Address_93.toString();
            String user4Address = cell_Address_94.toString();
            String user5Address = cell_Address_95.toString();
            String user6Address = cell_Address_96.toString();

            // get Job
            Row row10_Job = sheetNormal.getRow(10);
            Cell cell_Job_101 = row10_Job.getCell(1);
            Cell cell_Job_102 = row10_Job.getCell(2);
            Cell cell_Job_103 = row10_Job.getCell(3);
            Cell cell_Job_104 = row10_Job.getCell(4);
            Cell cell_Job_105 = row10_Job.getCell(5);
            Cell cell_Job_106 = row10_Job.getCell(6);

            //"Job" Cell Casting from Object to String
            String user1Job = cell_Job_101.toString();
            String user2Job = cell_Job_102.toString();
            String user3Job = cell_Job_103.toString();
            String user4Job = cell_Job_104.toString();
            String user5Job = cell_Job_105.toString();
            String user6Job = cell_Job_106.toString();

            // get Postal code
            Row row11_PostalCode = sheetNormal.getRow(11);
            Cell cell_PostalCode_111 = row11_PostalCode.getCell(1);
            Cell cell_PostalCode_112 = row11_PostalCode.getCell(2);
            Cell cell_PostalCode_113 = row11_PostalCode.getCell(3);
            Cell cell_PostalCode_114 = row11_PostalCode.getCell(4);
            Cell cell_PostalCode_115 = row11_PostalCode.getCell(5);
            Cell cell_PostalCode_116 = row11_PostalCode.getCell(6);

            //"PostalCode" Cell Casting from Object to String
            String user1PostalCode = cell_PostalCode_111.toString();
            String user2PostalCode = cell_PostalCode_112.toString();
            String user3PostalCode = cell_PostalCode_113.toString();
            String user4PostalCode = cell_PostalCode_114.toString();
            String user5PostalCode = cell_PostalCode_115.toString();
            String user6PostalCode = cell_PostalCode_116.toString();

           // get Account Number
           Row row12_AccountNumber= sheetNormal.getRow(12);
           Cell cell_AccountNumber_131 = row12_AccountNumber.getCell(1);
           Cell cell_AccountNumber_132 = row12_AccountNumber.getCell(2);
           Cell cell_AccountNumber_133 = row12_AccountNumber.getCell(3);
           Cell cell_AccountNumber_134 = row12_AccountNumber.getCell(4);
           Cell cell_AccountNumber_135 = row12_AccountNumber.getCell(5);
           Cell cell_AccountNumber_136 = row12_AccountNumber.getCell(6);

           //"Account Number" Cell Casting from Object to String
           long user1AccountNumber = Long.parseLong(cell_AccountNumber_131.toString());
           long user2AccountNumber = Long.parseLong(cell_AccountNumber_132.toString());
           long user3AccountNumber = Long.parseLong(cell_AccountNumber_133.toString());
           long user4AccountNumber = Long.parseLong(cell_AccountNumber_134.toString());
           long user5AccountNumber = Long.parseLong(cell_AccountNumber_135.toString());
           long user6AccountNumber = Long.parseLong(cell_AccountNumber_136.toString());


            // get Salary
            Row row13_Salary = sheetNormal.getRow(13);
            Cell cell_Salary_131 = row13_Salary.getCell(1);
            Cell cell_Salary_132 = row13_Salary.getCell(2);
            Cell cell_Salary_133 = row13_Salary.getCell(3);
            Cell cell_Salary_134 = row13_Salary.getCell(4);
            Cell cell_Salary_135 = row13_Salary.getCell(5);
            Cell cell_Salary_136 = row13_Salary.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1Salary = Double.parseDouble(cell_Salary_131.toString());
            double user2Salary = Double.parseDouble(cell_Salary_132.toString());
            double user3Salary = Double.parseDouble(cell_Salary_133.toString());
            double user4Salary = Double.parseDouble(cell_Salary_134.toString());
            double user5Salary = Double.parseDouble(cell_Salary_135.toString());
            double user6Salary = Double.parseDouble(cell_Salary_136.toString());


            // get Phone Number
            Row row14_PhoneNumber = sheetNormal.getRow(14);
            Cell cell_PhNum_141 = row14_PhoneNumber.getCell(1);
            Cell cell_PhNum_142 = row14_PhoneNumber.getCell(2);
            Cell cell_PhNum_143 = row14_PhoneNumber.getCell(3);
            Cell cell_PhNum_144 = row14_PhoneNumber.getCell(4);
            Cell cell_PhNum_145 = row14_PhoneNumber.getCell(5);
            Cell cell_PhNum_146 = row14_PhoneNumber.getCell(6);

            //"Phone Number" Cell Casting from Object to String
            String user1PhNum = cell_PhNum_141.toString();
            String user2PhNum = cell_PhNum_142.toString();
            String user3PhNum = cell_PhNum_143.toString();
            String user4PhNum = cell_PhNum_144.toString();
            String user5PhNum = cell_PhNum_145.toString();
            String user6PhNum = cell_PhNum_146.toString();

            // get Martial Status
            Row row15_MartialStatus = sheetNormal.getRow(15);
            Cell cell_MartialStatus_151 = row15_MartialStatus.getCell(1);
            Cell cell_MartialStatus_152 = row15_MartialStatus.getCell(2);
            Cell cell_MartialStatus_153 = row15_MartialStatus.getCell(3);
            Cell cell_MartialStatus_154 = row15_MartialStatus.getCell(4);
            Cell cell_MartialStatus_155 = row15_MartialStatus.getCell(5);
            Cell cell_MartialStatus_156 = row15_MartialStatus.getCell(6);

            //"Martial Status" Cell Casting from Object to String
            String user1MartialStatus = cell_MartialStatus_151.toString();
            String user2MartialStatus = cell_MartialStatus_152.toString();
            String user3MartialStatus = cell_MartialStatus_153.toString();
            String user4MartialStatus = cell_MartialStatus_154.toString();
            String user5MartialStatus = cell_MartialStatus_155.toString();
            String user6MartialStatus = cell_MartialStatus_156.toString();


            // get Debit Status
            Row row16_DebitStatus = sheetNormal.getRow(16);
            Cell cell_DebitStatus_161 = row16_DebitStatus.getCell(1);
            Cell cell_DebitStatus_162 = row16_DebitStatus.getCell(2);
            Cell cell_DebitStatus_163 = row16_DebitStatus.getCell(3);
            Cell cell_DebitStatus_164 = row16_DebitStatus.getCell(4);
            Cell cell_DebitStatus_165 = row16_DebitStatus.getCell(5);
            Cell cell_DebitStatus_166 = row16_DebitStatus.getCell(6);

            //"Debit Status" Cell Casting from Object to String
            boolean user1DebitStatus = Boolean.parseBoolean(cell_DebitStatus_161.toString());
            boolean user2DebitStatus = Boolean.parseBoolean(cell_DebitStatus_162.toString());
            boolean user3DebitStatus = Boolean.parseBoolean(cell_DebitStatus_163.toString());
            boolean user4DebitStatus = Boolean.parseBoolean(cell_DebitStatus_164.toString());
            boolean user5DebitStatus = Boolean.parseBoolean(cell_DebitStatus_165.toString());
            boolean user6DebitStatus = Boolean.parseBoolean(cell_DebitStatus_166.toString());

            // get Loan Request
            Row row17_LoanRequest = sheetNormal.getRow(17);
            Cell cell_LoanRequest_171 = row17_LoanRequest.getCell(1);
            Cell cell_LoanRequest_172 = row17_LoanRequest.getCell(2);
            Cell cell_LoanRequest_173 = row17_LoanRequest.getCell(3);
            Cell cell_LoanRequest_174 = row17_LoanRequest.getCell(4);
            Cell cell_LoanRequest_175 = row17_LoanRequest.getCell(5);
            Cell cell_LoanRequest_176 = row17_LoanRequest.getCell(6);

            //"Loan Request" Cell Casting from Object to String
            boolean user1LoanRequest = Boolean.parseBoolean(cell_LoanRequest_171.toString());
            boolean user2LoanRequest = Boolean.parseBoolean(cell_LoanRequest_172.toString());
            boolean user3LoanRequest = Boolean.parseBoolean(cell_LoanRequest_173.toString());
            boolean user4LoanRequest = Boolean.parseBoolean(cell_LoanRequest_174.toString());
            boolean user5LoanRequest = Boolean.parseBoolean(cell_LoanRequest_175.toString());
            boolean user6LoanRequest = Boolean.parseBoolean(cell_LoanRequest_176.toString());


            // get Balance
            Row row18_Balance = sheetNormal.getRow(18);
            Cell cell_Balance_181 = row18_Balance.getCell(1);
            Cell cell_Balance_182 = row18_Balance.getCell(2);
            Cell cell_Balance_183 = row18_Balance.getCell(3);
            Cell cell_Balance_184 = row18_Balance.getCell(4);
            Cell cell_Balance_185 = row18_Balance.getCell(5);
            Cell cell_Balance_186 = row18_Balance.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1Balance = Double.parseDouble(cell_Balance_181.toString());
            double user2Balance = Double.parseDouble(cell_Balance_182.toString());
            double user3Balance = Double.parseDouble(cell_Balance_183.toString());
            double user4Balance = Double.parseDouble(cell_Balance_184.toString());
            double user5Balance = Double.parseDouble(cell_Balance_185.toString());
            double user6Balance = Double.parseDouble(cell_Balance_186.toString());


            // get Last Deposit
            Row row21_LastDeposit = sheetNormal.getRow(21);
            Cell cell_LastDeposit_211 = row21_LastDeposit.getCell(1);
            Cell cell_LastDeposit_212 = row21_LastDeposit.getCell(2);
            Cell cell_LastDeposit_213 = row21_LastDeposit.getCell(3);
            Cell cell_LastDeposit_214 = row21_LastDeposit.getCell(4);
            Cell cell_LastDeposit_215 = row21_LastDeposit.getCell(5);
            Cell cell_LastDeposit_216 = row21_LastDeposit.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1LastDeposit = Double.parseDouble(cell_LastDeposit_211.toString());
            double user2LastDeposit = Double.parseDouble(cell_LastDeposit_212.toString());
            double user3LastDeposit = Double.parseDouble(cell_LastDeposit_213.toString());
            double user4LastDeposit = Double.parseDouble(cell_LastDeposit_214.toString());
            double user5LastDeposit = Double.parseDouble(cell_LastDeposit_215.toString());
            double user6LastDeposit = Double.parseDouble(cell_LastDeposit_216.toString());

            // get Last Withdraw
            Row row22_LastWithdraw = sheetNormal.getRow(22);
            Cell cell_LastWithdraw_221 = row22_LastWithdraw.getCell(1);
            Cell cell_LastWithdraw_222 = row22_LastWithdraw.getCell(2);
            Cell cell_LastWithdraw_223 = row22_LastWithdraw.getCell(3);
            Cell cell_LastWithdraw_224 = row22_LastWithdraw.getCell(4);
            Cell cell_LastWithdraw_225 = row22_LastWithdraw.getCell(5);
            Cell cell_LastWithdraw_226 = row22_LastWithdraw.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1LastWithdraw = Double.parseDouble(cell_LastWithdraw_221.toString());
            double user2LastWithdraw = Double.parseDouble(cell_LastWithdraw_222.toString());
            double user3LastWithdraw = Double.parseDouble(cell_LastWithdraw_223.toString());
            double user4LastWithdraw = Double.parseDouble(cell_LastWithdraw_224.toString());
            double user5LastWithdraw = Double.parseDouble(cell_LastWithdraw_225.toString());
            double user6LastWithdraw = Double.parseDouble(cell_LastWithdraw_226.toString());

           /*
           The following adds the taken input to Object
           */

           Normal Ibrahim = new Normal(user1fName,user1sName,user1Username,user1Password,user1Pin,user1AccType,
                                        user1Birthday,user1Nationality,user1NationalID,user1Address,user1Job,user1PostalCode,
                                            user1Salary, user1PhNum,user1MartialStatus,user1DebitStatus,user1LoanRequest,
                                                user1Balance,user1LastDeposit, user1LastWithdraw);
           Ibrahim.setAccountNumber(user1AccountNumber);

           Normal Ehab = new Normal(user2fName,user2sName,user2Username,user2Password,user2Pin,user2AccType,
                                       user2Birthday,user2Nationality,user2NationalID,user2Address,user2Job,user2PostalCode,
                                            user2Salary, user2PhNum,user2MartialStatus,user2DebitStatus,user2LoanRequest,
                                                user2Balance,user2LastDeposit, user2LastWithdraw);
           Ehab.setAccountNumber(user2AccountNumber);

           Normal AyaS = new Normal(user3fName,user3sName,user3Username,user3Password,user3Pin,user3AccType,
                                       user3Birthday,user3Nationality,user3NationalID,user3Address,user3Job,user3PostalCode,
                                           user3Salary, user3PhNum,user3MartialStatus,user3DebitStatus,user3LoanRequest,
                                                user3Balance,user3LastDeposit, user3LastWithdraw);
           AyaS.setAccountNumber(user3AccountNumber);

           Normal AyaA = new Normal(user4fName,user4sName,user4Username,user4Password,user4Pin,user4AccType,
                                       user4Birthday,user4Nationality,user4NationalID,user4Address,user4Job,user4PostalCode,
                                            user4Salary, user4PhNum,user4MartialStatus,user4DebitStatus,user4LoanRequest,
                                                user4Balance,user4LastDeposit, user4LastWithdraw);
           AyaA.setAccountNumber(user4AccountNumber);

           Normal Shiroq = new Normal(user5fName,user5sName,user5Username,user5Password,user5Pin,user5AccType,
                                       user5Birthday,user5Nationality,user5NationalID,user5Address,user5Job,user5PostalCode,
                                           user5Salary, user5PhNum,user5MartialStatus,user5DebitStatus,user5LoanRequest,
                                                user5Balance,user5LastDeposit, user5LastWithdraw);
           Shiroq.setAccountNumber(user5AccountNumber);

           Normal Sohaila = new Normal(user6fName,user6sName,user6Username,user6Password,user6Pin,user6AccType,
                                       user6Birthday,user6Nationality,user6NationalID,user6Address,user6Job,user6PostalCode,
                                            user6Salary, user6PhNum,user6MartialStatus,user6DebitStatus,user6LoanRequest,
                                                user6Balance,user6LastDeposit, user6LastWithdraw);
           Sohaila.setAccountNumber(user6AccountNumber);


           // adding Objects to the Normal Clients Array list
           Normal.NormalClients.add(Ibrahim);
           Normal.NormalClients.add(Ehab);
           Normal.NormalClients.add(AyaS);
           Normal.NormalClients.add(AyaA);
           Normal.NormalClients.add(Shiroq);
           Normal.NormalClients.add(Sohaila);

        }

        // Import VIP Clients
        {

            File VIPClientsFile = new File("src\\main\\java\\com\\mycompany\\banksystemoop\\ExcelData\\VIP Clients.xlsx");
            FileInputStream fisVIP = new FileInputStream(VIPClientsFile);
            XSSFWorkbook wbVIP = new XSSFWorkbook(fisVIP);
            XSSFSheet sheetVIP = wbVIP.getSheetAt(0);

            // get First name
            Row row0_fName = sheetVIP.getRow(0);
            Cell cell_fName_01 = row0_fName.getCell(1);
            Cell cell_fName_02 = row0_fName.getCell(2);
            Cell cell_fName_03 = row0_fName.getCell(3);
            Cell cell_fName_04 = row0_fName.getCell(4);
            Cell cell_fName_05 = row0_fName.getCell(5);
            Cell cell_fName_06 = row0_fName.getCell(6);

            // "First name" Cell Casting from Object to String
            String user1fName = cell_fName_01.toString();
            String user2fName = cell_fName_02.toString();
            String user3fName = cell_fName_03.toString();
            String user4fName = cell_fName_04.toString();
            String user5fName = cell_fName_05.toString();
            String user6fName = cell_fName_06.toString();

            // get Second name
            Row row1_lName = sheetVIP.getRow(1);
            Cell cell_sName_11 = row1_lName.getCell(1);
            Cell cell_sName_12 = row1_lName.getCell(2);
            Cell cell_sName_13 = row1_lName.getCell(3);
            Cell cell_sName_14 = row1_lName.getCell(4);
            Cell cell_sName_15 = row1_lName.getCell(5);
            Cell cell_sName_16 = row1_lName.getCell(6);

            //"Second Name" Cell Casting from Object to String
            String user1sName = cell_sName_11.toString();
            String user2sName = cell_sName_12.toString();
            String user3sName = cell_sName_13.toString();
            String user4sName = cell_sName_14.toString();
            String user5sName = cell_sName_15.toString();
            String user6sName = cell_sName_16.toString();

            // get Username
            Row row2_Username = sheetVIP.getRow(2);
            Cell cell_Username_21 = row2_Username.getCell(1);
            Cell cell_Username_22 = row2_Username.getCell(2);
            Cell cell_Username_23 = row2_Username.getCell(3);
            Cell cell_Username_24 = row2_Username.getCell(4);
            Cell cell_Username_25 = row2_Username.getCell(5);
            Cell cell_Username_26 = row2_Username.getCell(6);

            //"Username" Cell Casting from Object to String
            String user1Username = cell_Username_21.toString();
            String user2Username = cell_Username_22.toString();
            String user3Username = cell_Username_23.toString();
            String user4Username = cell_Username_24.toString();
            String user5Username = cell_Username_25.toString();
            String user6Username = cell_Username_26.toString();

            // get Password
            Row row3_Password = sheetVIP.getRow(3);
            Cell cell_Password_31 = row3_Password.getCell(1);
            Cell cell_Password_32 = row3_Password.getCell(2);
            Cell cell_Password_33 = row3_Password.getCell(3);
            Cell cell_Password_34 = row3_Password.getCell(4);
            Cell cell_Password_35 = row3_Password.getCell(5);
            Cell cell_Password_36 = row3_Password.getCell(6);

            //"Password" Cell Casting from Object to String
            String user1Password = cell_Password_31.toString();
            String user2Password = cell_Password_32.toString();
            String user3Password = cell_Password_33.toString();
            String user4Password = cell_Password_34.toString();
            String user5Password = cell_Password_35.toString();
            String user6Password = cell_Password_36.toString();

            // get Pin
            Row row4_Pin = sheetVIP.getRow(4);
            Cell cell_Pin_41 = row4_Pin.getCell(1);
            Cell cell_Pin_42 = row4_Pin.getCell(2);
            Cell cell_Pin_43 = row4_Pin.getCell(3);
            Cell cell_Pin_44 = row4_Pin.getCell(4);
            Cell cell_Pin_45 = row4_Pin.getCell(5);
            Cell cell_Pin_46 = row4_Pin.getCell(6);

            //"Pin" Cell Casting from Object to String
            String user1Pin = cell_Pin_41.toString();
            String user2Pin = cell_Pin_42.toString();
            String user3Pin = cell_Pin_43.toString();
            String user4Pin = cell_Pin_44.toString();
            String user5Pin = cell_Pin_45.toString();
            String user6Pin = cell_Pin_46.toString();


            // get Account Type
            Row row5_AccountType = sheetVIP.getRow(5);
            Cell cell_AccType_51 = row5_AccountType.getCell(1);
            Cell cell_AccType_52 = row5_AccountType.getCell(2);
            Cell cell_AccType_53 = row5_AccountType.getCell(3);
            Cell cell_AccType_54 = row5_AccountType.getCell(4);
            Cell cell_AccType_55 = row5_AccountType.getCell(5);
            Cell cell_AccType_56 = row5_AccountType.getCell(6);

            //"Account Type" Cell Casting from Object to String
            String user1AccType = cell_AccType_51.toString();
            String user2AccType = cell_AccType_52.toString();
            String user3AccType = cell_AccType_53.toString();
            String user4AccType = cell_AccType_54.toString();
            String user5AccType = cell_AccType_55.toString();
            String user6AccType = cell_AccType_56.toString();

            // get Birthday
            Row row6_Birthday = sheetVIP.getRow(6);
            Cell cell_Birthday_61 = row6_Birthday.getCell(1);
            Cell cell_Birthday_62 = row6_Birthday.getCell(2);
            Cell cell_Birthday_63 = row6_Birthday.getCell(3);
            Cell cell_Birthday_64 = row6_Birthday.getCell(4);
            Cell cell_Birthday_65 = row6_Birthday.getCell(5);
            Cell cell_Birthday_66 = row6_Birthday.getCell(6);

            //"Birthday" Cell Casting from Object to String
            String user1Birthday = cell_Birthday_61.toString();
            String user2Birthday = cell_Birthday_62.toString();
            String user3Birthday = cell_Birthday_63.toString();
            String user4Birthday = cell_Birthday_64.toString();
            String user5Birthday = cell_Birthday_65.toString();
            String user6Birthday = cell_Birthday_66.toString();

            // get Nationality
            Row row7_Nationality = sheetVIP.getRow(7);
            Cell cell_Nationality_71 = row7_Nationality.getCell(1);
            Cell cell_Nationality_72 = row7_Nationality.getCell(2);
            Cell cell_Nationality_73 = row7_Nationality.getCell(3);
            Cell cell_Nationality_74 = row7_Nationality.getCell(4);
            Cell cell_Nationality_75 = row7_Nationality.getCell(5);
            Cell cell_Nationality_76 = row7_Nationality.getCell(6);

            //"Nationality" Cell Casting from Object to String
            String user1Nationality = cell_Nationality_71.toString();
            String user2Nationality = cell_Nationality_72.toString();
            String user3Nationality = cell_Nationality_73.toString();
            String user4Nationality = cell_Nationality_74.toString();
            String user5Nationality = cell_Nationality_75.toString();
            String user6Nationality = cell_Nationality_76.toString();


            // get National ID
            Row row8_NationalID = sheetVIP.getRow(8);
            Cell cell_NationalID_81 = row8_NationalID.getCell(1);
            Cell cell_NationalID_82 = row8_NationalID.getCell(2);
            Cell cell_NationalID_83 = row8_NationalID.getCell(3);
            Cell cell_NationalID_84 = row8_NationalID.getCell(4);
            Cell cell_NationalID_85 = row8_NationalID.getCell(5);
            Cell cell_NationalID_86 = row8_NationalID.getCell(6);

            //"Nationality" Cell Casting from Object to String
            String user1NationalID = cell_NationalID_81.toString();
            String user2NationalID = cell_NationalID_82.toString();
            String user3NationalID = cell_NationalID_83.toString();
            String user4NationalID = cell_NationalID_84.toString();
            String user5NationalID = cell_NationalID_85.toString();
            String user6NationalID = cell_NationalID_86.toString();

            // get Address
            Row row9_Address = sheetVIP.getRow(9);
            Cell cell_Address_91 = row9_Address.getCell(1);
            Cell cell_Address_92 = row9_Address.getCell(2);
            Cell cell_Address_93 = row9_Address.getCell(3);
            Cell cell_Address_94 = row9_Address.getCell(4);
            Cell cell_Address_95 = row9_Address.getCell(5);
            Cell cell_Address_96 = row9_Address.getCell(6);

            //"Address" Cell Casting from Object to String
            String user1Address = cell_Address_91.toString();
            String user2Address = cell_Address_92.toString();
            String user3Address = cell_Address_93.toString();
            String user4Address = cell_Address_94.toString();
            String user5Address = cell_Address_95.toString();
            String user6Address = cell_Address_96.toString();

            // get Job
            Row row10_Job = sheetVIP.getRow(10);
            Cell cell_Job_101 = row10_Job.getCell(1);
            Cell cell_Job_102 = row10_Job.getCell(2);
            Cell cell_Job_103 = row10_Job.getCell(3);
            Cell cell_Job_104 = row10_Job.getCell(4);
            Cell cell_Job_105 = row10_Job.getCell(5);
            Cell cell_Job_106 = row10_Job.getCell(6);

            //"Job" Cell Casting from Object to String
            String user1Job = cell_Job_101.toString();
            String user2Job = cell_Job_102.toString();
            String user3Job = cell_Job_103.toString();
            String user4Job = cell_Job_104.toString();
            String user5Job = cell_Job_105.toString();
            String user6Job = cell_Job_106.toString();

            // get Postal code
            Row row11_PostalCode = sheetVIP.getRow(11);
            Cell cell_PostalCode_111 = row11_PostalCode.getCell(1);
            Cell cell_PostalCode_112 = row11_PostalCode.getCell(2);
            Cell cell_PostalCode_113 = row11_PostalCode.getCell(3);
            Cell cell_PostalCode_114 = row11_PostalCode.getCell(4);
            Cell cell_PostalCode_115 = row11_PostalCode.getCell(5);
            Cell cell_PostalCode_116 = row11_PostalCode.getCell(6);

            //"PostalCode" Cell Casting from Object to String
            String user1PostalCode = cell_PostalCode_111.toString();
            String user2PostalCode = cell_PostalCode_112.toString();
            String user3PostalCode = cell_PostalCode_113.toString();
            String user4PostalCode = cell_PostalCode_114.toString();
            String user5PostalCode = cell_PostalCode_115.toString();
            String user6PostalCode = cell_PostalCode_116.toString();

            // get Account Number
            Row row12_AccountNumber= sheetVIP.getRow(12);
            Cell cell_AccountNumber_131 = row12_AccountNumber.getCell(1);
            Cell cell_AccountNumber_132 = row12_AccountNumber.getCell(2);
            Cell cell_AccountNumber_133 = row12_AccountNumber.getCell(3);
            Cell cell_AccountNumber_134 = row12_AccountNumber.getCell(4);
            Cell cell_AccountNumber_135 = row12_AccountNumber.getCell(5);
            Cell cell_AccountNumber_136 = row12_AccountNumber.getCell(6);

            //"Account Number" Cell Casting from Object to String
            long user1AccountNumber = Long.parseLong(cell_AccountNumber_131.toString());
            long user2AccountNumber = Long.parseLong(cell_AccountNumber_132.toString());
            long user3AccountNumber = Long.parseLong(cell_AccountNumber_133.toString());
            long user4AccountNumber = Long.parseLong(cell_AccountNumber_134.toString());
            long user5AccountNumber = Long.parseLong(cell_AccountNumber_135.toString());
            long user6AccountNumber = Long.parseLong(cell_AccountNumber_136.toString());

            // get Salary
            Row row13_Salary = sheetVIP.getRow(13);
            Cell cell_Salary_131 = row13_Salary.getCell(1);
            Cell cell_Salary_132 = row13_Salary.getCell(2);
            Cell cell_Salary_133 = row13_Salary.getCell(3);
            Cell cell_Salary_134 = row13_Salary.getCell(4);
            Cell cell_Salary_135 = row13_Salary.getCell(5);
            Cell cell_Salary_136 = row13_Salary.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1Salary = Double.parseDouble(cell_Salary_131.toString());
            double user2Salary = Double.parseDouble(cell_Salary_132.toString());
            double user3Salary = Double.parseDouble(cell_Salary_133.toString());
            double user4Salary = Double.parseDouble(cell_Salary_134.toString());
            double user5Salary = Double.parseDouble(cell_Salary_135.toString());
            double user6Salary = Double.parseDouble(cell_Salary_136.toString());


            // get Phone Number
            Row row14_PhoneNumber = sheetVIP.getRow(14);
            Cell cell_PhNum_141 = row14_PhoneNumber.getCell(1);
            Cell cell_PhNum_142 = row14_PhoneNumber.getCell(2);
            Cell cell_PhNum_143 = row14_PhoneNumber.getCell(3);
            Cell cell_PhNum_144 = row14_PhoneNumber.getCell(4);
            Cell cell_PhNum_145 = row14_PhoneNumber.getCell(5);
            Cell cell_PhNum_146 = row14_PhoneNumber.getCell(6);

            //"Phone Number" Cell Casting from Object to String
            String user1PhNum = cell_PhNum_141.toString();
            String user2PhNum = cell_PhNum_142.toString();
            String user3PhNum = cell_PhNum_143.toString();
            String user4PhNum = cell_PhNum_144.toString();
            String user5PhNum = cell_PhNum_145.toString();
            String user6PhNum = cell_PhNum_146.toString();

            // get Martial Status
            Row row15_MartialStatus = sheetVIP.getRow(15);
            Cell cell_MartialStatus_151 = row15_MartialStatus.getCell(1);
            Cell cell_MartialStatus_152 = row15_MartialStatus.getCell(2);
            Cell cell_MartialStatus_153 = row15_MartialStatus.getCell(3);
            Cell cell_MartialStatus_154 = row15_MartialStatus.getCell(4);
            Cell cell_MartialStatus_155 = row15_MartialStatus.getCell(5);
            Cell cell_MartialStatus_156 = row15_MartialStatus.getCell(6);

            //"Martial Status" Cell Casting from Object to String
            String user1MartialStatus = cell_MartialStatus_151.toString();
            String user2MartialStatus = cell_MartialStatus_152.toString();
            String user3MartialStatus = cell_MartialStatus_153.toString();
            String user4MartialStatus = cell_MartialStatus_154.toString();
            String user5MartialStatus = cell_MartialStatus_155.toString();
            String user6MartialStatus = cell_MartialStatus_156.toString();


            // get Debit Status
            Row row16_DebitStatus = sheetVIP.getRow(16);
            Cell cell_DebitStatus_161 = row16_DebitStatus.getCell(1);
            Cell cell_DebitStatus_162 = row16_DebitStatus.getCell(2);
            Cell cell_DebitStatus_163 = row16_DebitStatus.getCell(3);
            Cell cell_DebitStatus_164 = row16_DebitStatus.getCell(4);
            Cell cell_DebitStatus_165 = row16_DebitStatus.getCell(5);
            Cell cell_DebitStatus_166 = row16_DebitStatus.getCell(6);

            //"Debit Status" Cell Casting from Object to String
            boolean user1DebitStatus = Boolean.parseBoolean(cell_DebitStatus_161.toString());
            boolean user2DebitStatus = Boolean.parseBoolean(cell_DebitStatus_162.toString());
            boolean user3DebitStatus = Boolean.parseBoolean(cell_DebitStatus_163.toString());
            boolean user4DebitStatus = Boolean.parseBoolean(cell_DebitStatus_164.toString());
            boolean user5DebitStatus = Boolean.parseBoolean(cell_DebitStatus_165.toString());
            boolean user6DebitStatus = Boolean.parseBoolean(cell_DebitStatus_166.toString());

            // get Loan Request
            Row row17_LoanRequest = sheetVIP.getRow(17);
            Cell cell_LoanRequest_171 = row17_LoanRequest.getCell(1);
            Cell cell_LoanRequest_172 = row17_LoanRequest.getCell(2);
            Cell cell_LoanRequest_173 = row17_LoanRequest.getCell(3);
            Cell cell_LoanRequest_174 = row17_LoanRequest.getCell(4);
            Cell cell_LoanRequest_175 = row17_LoanRequest.getCell(5);
            Cell cell_LoanRequest_176 = row17_LoanRequest.getCell(6);

            //"Loan Request" Cell Casting from Object to String
            boolean user1LoanRequest = Boolean.parseBoolean(cell_LoanRequest_171.toString());
            boolean user2LoanRequest = Boolean.parseBoolean(cell_LoanRequest_172.toString());
            boolean user3LoanRequest = Boolean.parseBoolean(cell_LoanRequest_173.toString());
            boolean user4LoanRequest = Boolean.parseBoolean(cell_LoanRequest_174.toString());
            boolean user5LoanRequest = Boolean.parseBoolean(cell_LoanRequest_175.toString());
            boolean user6LoanRequest = Boolean.parseBoolean(cell_LoanRequest_176.toString());


            // get Balance
            Row row18_Balance = sheetVIP.getRow(18);
            Cell cell_Balance_181 = row18_Balance.getCell(1);
            Cell cell_Balance_182 = row18_Balance.getCell(2);
            Cell cell_Balance_183 = row18_Balance.getCell(3);
            Cell cell_Balance_184 = row18_Balance.getCell(4);
            Cell cell_Balance_185 = row18_Balance.getCell(5);
            Cell cell_Balance_186 = row18_Balance.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1Balance = Double.parseDouble(cell_Balance_181.toString());
            double user2Balance = Double.parseDouble(cell_Balance_182.toString());
            double user3Balance = Double.parseDouble(cell_Balance_183.toString());
            double user4Balance = Double.parseDouble(cell_Balance_184.toString());
            double user5Balance = Double.parseDouble(cell_Balance_185.toString());
            double user6Balance = Double.parseDouble(cell_Balance_186.toString());


            // get Last Deposit
            Row row21_LastDeposit = sheetVIP.getRow(21);
            Cell cell_LastDeposit_211 = row21_LastDeposit.getCell(1);
            Cell cell_LastDeposit_212 = row21_LastDeposit.getCell(2);
            Cell cell_LastDeposit_213 = row21_LastDeposit.getCell(3);
            Cell cell_LastDeposit_214 = row21_LastDeposit.getCell(4);
            Cell cell_LastDeposit_215 = row21_LastDeposit.getCell(5);
            Cell cell_LastDeposit_216 = row21_LastDeposit.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1LastDeposit = Double.parseDouble(cell_LastDeposit_211.toString());
            double user2LastDeposit = Double.parseDouble(cell_LastDeposit_212.toString());
            double user3LastDeposit = Double.parseDouble(cell_LastDeposit_213.toString());
            double user4LastDeposit = Double.parseDouble(cell_LastDeposit_214.toString());
            double user5LastDeposit = Double.parseDouble(cell_LastDeposit_215.toString());
            double user6LastDeposit = Double.parseDouble(cell_LastDeposit_216.toString());

            // get Last Withdraw
            Row row22_LastWithdraw = sheetVIP.getRow(22);
            Cell cell_LastWithdraw_221 = row22_LastWithdraw.getCell(1);
            Cell cell_LastWithdraw_222 = row22_LastWithdraw.getCell(2);
            Cell cell_LastWithdraw_223 = row22_LastWithdraw.getCell(3);
            Cell cell_LastWithdraw_224 = row22_LastWithdraw.getCell(4);
            Cell cell_LastWithdraw_225 = row22_LastWithdraw.getCell(5);
            Cell cell_LastWithdraw_226 = row22_LastWithdraw.getCell(6);

            //"Salary" Cell Casting from Object to String
            double user1LastWithdraw = Double.parseDouble(cell_LastWithdraw_221.toString());
            double user2LastWithdraw = Double.parseDouble(cell_LastWithdraw_222.toString());
            double user3LastWithdraw = Double.parseDouble(cell_LastWithdraw_223.toString());
            double user4LastWithdraw = Double.parseDouble(cell_LastWithdraw_224.toString());
            double user5LastWithdraw = Double.parseDouble(cell_LastWithdraw_225.toString());
            double user6LastWithdraw = Double.parseDouble(cell_LastWithdraw_226.toString());

            /*
           The following adds the taken input to Object
           */

            VIP Ibrahim = new VIP(user1fName,user1sName,user1Username,user1Password,user1Pin,user1AccType,
                    user1Birthday,user1Nationality,user1NationalID,user1Address,user1Job,user1PostalCode,
                    user1Salary, user1PhNum,user1MartialStatus,user1DebitStatus,user1LoanRequest,
                    user1Balance,user1LastDeposit, user1LastWithdraw);
            Ibrahim.setAccountNumber(user1AccountNumber);

            VIP Ehab = new VIP(user2fName,user2sName,user2Username,user2Password,user2Pin,user2AccType,
                    user2Birthday,user2Nationality,user2NationalID,user2Address,user2Job,user2PostalCode,
                    user2Salary, user2PhNum,user2MartialStatus,user2DebitStatus,user2LoanRequest,
                    user2Balance,user2LastDeposit, user2LastWithdraw);
            Ehab.setAccountNumber(user2AccountNumber);

            VIP AyaS = new VIP(user3fName,user3sName,user3Username,user3Password,user3Pin,user3AccType,
                    user3Birthday,user3Nationality,user3NationalID,user3Address,user3Job,user3PostalCode,
                    user3Salary, user3PhNum,user3MartialStatus,user3DebitStatus,user3LoanRequest,
                    user3Balance,user3LastDeposit, user3LastWithdraw);
            AyaS.setAccountNumber(user3AccountNumber);

            VIP AyaA = new VIP(user4fName,user4sName,user4Username,user4Password,user4Pin,user4AccType,
                    user4Birthday,user4Nationality,user4NationalID,user4Address,user4Job,user4PostalCode,
                    user4Salary, user4PhNum,user4MartialStatus,user4DebitStatus,user4LoanRequest,
                    user4Balance,user4LastDeposit, user4LastWithdraw);
            AyaA.setAccountNumber(user4AccountNumber);

            VIP Shiroq = new VIP(user5fName,user5sName,user5Username,user5Password,user5Pin,user5AccType,
                    user5Birthday,user5Nationality,user5NationalID,user5Address,user5Job,user5PostalCode,
                    user5Salary, user5PhNum,user5MartialStatus,user5DebitStatus,user5LoanRequest,
                    user5Balance,user5LastDeposit, user5LastWithdraw);
            Shiroq.setAccountNumber(user5AccountNumber);

            VIP Sohaila = new VIP(user6fName,user6sName,user6Username,user6Password,user6Pin,user6AccType,
                    user6Birthday,user6Nationality,user6NationalID,user6Address,user6Job,user6PostalCode,
                    user6Salary, user6PhNum,user6MartialStatus,user6DebitStatus,user6LoanRequest,
                    user6Balance,user6LastDeposit, user6LastWithdraw);
            Sohaila.setAccountNumber(user6AccountNumber);

            // adding Objects to the VIP Clients Array list
            VIP.VIPClients.add(Ibrahim);
            VIP.VIPClients.add(Ehab);
            VIP.VIPClients.add(AyaS);
            VIP.VIPClients.add(AyaA);
            VIP.VIPClients.add(Shiroq);
            VIP.VIPClients.add(Sohaila);

        }

    }
}
