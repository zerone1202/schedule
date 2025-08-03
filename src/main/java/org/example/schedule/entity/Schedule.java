package org.example.schedule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Schedule extends BaseEntity {

    // 각 일정의 고유 식별자(ID)를 자동으로 생성하여 관리
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String author;
    private String password;

    public Schedule(String title, String description, String author, String password) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.password = password;
    }

}
