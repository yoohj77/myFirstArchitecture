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

@Builder //Object ������ ���� ������ ����
@NoArgsConstructor //�Ű������� ���� �������ڸ� ����
@AllArgsConstructor //��� ��� ������ �Ű������� �޴� �����ڸ� ����
@Data //Ŭ���� ��������� Getter/Setter �޼��带 ����
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

