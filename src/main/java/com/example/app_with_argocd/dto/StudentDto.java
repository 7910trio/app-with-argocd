package com.example.app_with_argocd.dto;

import com.example.app_with_argocd.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StudentDto {
    String name;

    // 기본 생성자
    public StudentDto() {
    }

    // 파라미터를 받는 생성자
    public StudentDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static StudentDto toDto(Student student) {
        return new StudentDto(student.getName());
    }
}
