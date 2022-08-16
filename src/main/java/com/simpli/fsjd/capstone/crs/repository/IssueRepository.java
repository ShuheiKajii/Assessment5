package com.simpli.fsjd.capstone.crs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpli.fsjd.capstone.crs.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long> {

}
