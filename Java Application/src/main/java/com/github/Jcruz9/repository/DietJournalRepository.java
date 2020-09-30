package com.github.Jcruz9.repository;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.model.DietJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietJournalRepository extends JpaRepository<DietJournal,Long> {
}
