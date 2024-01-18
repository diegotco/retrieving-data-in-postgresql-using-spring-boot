package com.database.connectpostgresqldb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyMemberRepository extends JpaRepository<myfamily, Long> {
    // You can add custom query methods here if needed
}
