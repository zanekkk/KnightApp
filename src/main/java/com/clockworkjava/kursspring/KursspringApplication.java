package com.clockworkjava.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.sql.*;

@SpringBootApplication
@EnableScheduling
public class KursspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursspringApplication.class, args);
//		try {
//			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/testowa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "kontragalop123");
//			Statement myStmt = myCon.createStatement();
////			ResultSet myRs = myStmt.executeQuery("select * from kursantka");
//
//			while(myRs.next()){
//				System.out.println(myRs.getString("imie") + " , " + myRs.getString("nazwisko"));
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}


	}
}
