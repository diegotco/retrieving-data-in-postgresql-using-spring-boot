package com.database.connectpostgresqldb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConnectPostgresqlDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectPostgresqlDbApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(FamilyMemberRepository familyMemberRepository) {
        return (args) -> {
            // You can use the repository to perform database operations
            // For example, save a new family member
            // myfamily newMember = new myfamily("Karl", "Doe", 60, "Sibling");
            // familyMemberRepository.save(newMember);

            // Retrieve all family members
            Iterable<myfamily> familyMembers = familyMemberRepository.findAll();
            System.out.println("All Doe family members:");
            for (myfamily member : familyMembers) {
                System.out.println(member.getName() + " " + member.getLastName());
            }
        };
    }
}
