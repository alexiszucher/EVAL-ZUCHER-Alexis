package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dao.ArticleDAO;
import fr.epsi.dto.ArticleDTO;
import fr.epsi.dto.ClientDTO;
import fr.epsi.service.ArticleService;
import fr.epsi.service.ClientService;

public class AjouterArticleServlet extends HttpServlet {
	
	@EJB
	private ArticleService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ajouterArticle.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArticleDTO aDTO = new ArticleDTO();
		aDTO.setNom(req.getParameter("nomArticle"));
		aDTO.setPrix(Double.parseDouble(req.getParameter("prixArticle")));
		service.create(aDTO);
	}
}