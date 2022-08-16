package com.simpli.fsjd.capstone.crs.service;

import org.springframework.data.domain.Pageable;

import com.simpli.fsjd.capstone.crs.dto.ProjectDto;
import com.simpli.fsjd.capstone.crs.util.TPage;

import java.util.List;


public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);
}
