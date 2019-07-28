package com.project.todolist.repository;

import com.project.todolist.domain.TaskFolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskFolderRepository extends JpaRepository<TaskFolder, Long> {

}
