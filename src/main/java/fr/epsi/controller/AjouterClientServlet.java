package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ClientDTO;
import fr.epsi.service.ClientService;

public class AjouterClientServlet extends HttpServlet {
	
	@EJB
	private ClientService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/ajouterClient.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClientDTO cDTO = new ClientDTO();
		cDTO.setNom(req.getParameter("nomClient"));
		cDTO.setAdresse(req.getParameter("adresseClient"));
		service.create(cDTO);
	}
}