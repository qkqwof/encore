package com.encore.service.impl;

import java.util.ArrayList;

import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService{
	
	//�߰�
	private ArrayList<Employee> list;
	
	static private EmployeeListServiceImpl service = new EmployeeListServiceImpl();
	private EmployeeListServiceImpl() {
		list = new ArrayList<Employee>();
	}
	public static EmployeeListServiceImpl getInstance() {
		return service;
	}
	
	@Override
	public void addEmployee(Employee e) {		
		boolean find = false;//flag �� �ϳ� ����
		for(Employee emp : list) {
			if(emp.getEmpId().equals(e.getEmpId())) {//�̹� �߰��Ϸ��� ����� �����Ѵٸ�
				find = true;
				System.out.println(e.getName()+"���� �̹� ȸ����ܿ� ���ԵǾ� �ֽ��ϴ�.");
				return;
			}
		}//for
		
		if(find==false) { //�߰��Ϸ��� ����� ����Ʈ�� �������� �ʴٸ�
			list.add(e);
			System.out.println(e.getName()+"�� ȸ������ ���ԵǼ̽��ϴ�.");
		}
	}
	@Override
	public void deleteEmployee(String empId) {		
		boolean find = false;//flag �� �ϳ� ����
		for(Employee emp : list) {
			if(emp.getEmpId().equals(empId)) {//�����Ϸ��� ����� �����Ѵٸ�
				find = true;
				System.out.println(emp.getName()+"���� �����մϴ�..");
				list.remove(emp);
				break;
			}
		}//for		
		if(find==false)System.out.println("�����Ϸ��� ����� ���� ȸ���߿��� �������� �ʽ��ϴ�.");		
	}
	@Override
	public void updateEmployee(Employee e) {		
		boolean find = false;
		for(Employee emp : list) {
			if(e.getEmpId().equals(emp.getEmpId())) { //�����Ϸ��� ����� �����Ѵٸ�
				//
				//emp.setEmpId(null);//pk�� �ش��ϴ� ���� ������ ����� �Ǹ� �ȵȴ�..pk�� ������ ������ �������� ������ ���
				emp.setName(e.getName());
				emp.setAddr(e.getAddr());
				emp.setSalary(e.getSalary());
				
				if(emp instanceof Manager) {
					((Manager) emp).changeDept(((Manager) e).getDept());
				}//if
				if(emp instanceof Engineer) {
					((Engineer) emp).changeBonus(((Engineer) e).getBonus());
					((Engineer) emp).changeTech(((Engineer) e).getTech());
				}//if			
			}//if
		}//for
	}//updateEmployee
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for(Employee emp : list) {
			if(emp.getAddr().equals(addr)) temp.add(emp);			
		}
		return temp;
	}
	
	@Override
	public void findEmployees() {
		for(Employee e : list)System.out.println(e);
	}
}
