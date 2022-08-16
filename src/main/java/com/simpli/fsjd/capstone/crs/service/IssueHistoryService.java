package com.simpli.fsjd.capstone.crs.service;

import org.springframework.data.domain.Pageable;

import com.simpli.fsjd.capstone.crs.dto.IssueHistoryDto;
import com.simpli.fsjd.capstone.crs.entity.Issue;
import com.simpli.fsjd.capstone.crs.util.TPage;

import java.util.List;


public interface IssueHistoryService {

    IssueHistoryDto save(IssueHistoryDto issueHistory);

    IssueHistoryDto getById(Long id);

    List<IssueHistoryDto> getByIssueId(Long id);

    TPage<IssueHistoryDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistoryDto issueHistory);

    void addHistory(Long id, Issue issue);
}
