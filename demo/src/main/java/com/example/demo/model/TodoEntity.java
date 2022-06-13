package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //Object ������ ���� ������ ����
@NoArgsConstructor //�Ű������� ���� �������ڸ� ����
@AllArgsConstructor //��� ��� ������ �Ű������� �޴� �����ڸ� ����
@Data //Ŭ���� ��������� Getter/Setter �޼��带 ����
public class TodoEntity{
	private String id;
	private String userId;
	private String title;
	private boolean done;
}

