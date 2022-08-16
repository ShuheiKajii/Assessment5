package com.simpli.fsjd.capstone.crs.service;

import org.springframework.data.domain.Pageable;

import com.simpli.fsjd.capstone.crs.dto.IssueDto;
import com.simpli.fsjd.capstone.crs.util.TPage;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(Long issue);

    IssueDto update(Long id, IssueDto project);
}
