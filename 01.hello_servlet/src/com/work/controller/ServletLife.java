package com.work.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLife
 */
@WebServlet("/lifeCycle")
public class ServletLife extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// static 블럭 초기화 : 클래스 로딩시 수행
	static {
		System.out.println("1. 서블릿 로딩 : 변경");
	}

	// 기본생성자 정의하세요 : 객체생성시 수행
	public ServletLife() {
		System.out.println("2. 객체 생성 : 변경");
	}
	
	// 초기화 메소드
	public void init() {
		System.out.println("3. init() 초기화 수행 : 변경");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// 4. 서비스 doGet()
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("4. 서비스 doGet().. : " + getClass().getName());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("4. 서비스 doGet().. : " + getClass().getName());
	}

	// 5. destroy() 자원해제
	public void destroy() {
		System.out.println("5. destroy() 자원해제");
	}

}
