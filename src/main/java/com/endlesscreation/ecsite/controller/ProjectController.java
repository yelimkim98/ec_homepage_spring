package com.endlesscreation.ecsite.controller;

import com.endlesscreation.ecsite.dto.PageRequest;
import com.endlesscreation.ecsite.dto.ProjectDetailResponse;
import com.endlesscreation.ecsite.dto.SimpleProjectResponse;
import com.endlesscreation.ecsite.service.ProjectService;
import java.text.ParseException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public ResponseEntity<List<SimpleProjectResponse>> findProjects(PageRequest pageRequest) {
        return ResponseEntity.ok()
            .body(projectService.findProjects(pageRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDetailResponse> findProjectById(@PathVariable Long id)
            throws ParseException {
        return ResponseEntity.ok()
            .body(projectService.findProjectById(id));
    }
}
