package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Builder //Object 생성을 위한 디자인 패턴
@NoArgsConstructor //매개변수가 없는 새엇ㅇ자를 구현
@AllArgsConstructor //모든 멤버 변수를 매개변수로 받는 생성자를 구현
@Data //클래스 멤버변수의 Getter/Setter 메서드를 구현
@Entity
@Table(name = "Todo")
public class TodoEntity{
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;
	private String userId;
	private String title;
	private boolean done;
}

