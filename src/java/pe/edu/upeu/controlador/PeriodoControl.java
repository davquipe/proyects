/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upeu.modelo.CpPeriodo;
import pe.edu.upeu.servicio.PeriodoServicioImpl;
import pe.edu.upeu.servicio.PeriodoServicioInterface;

/**
 *
 * @author MIGUEL
 */
@WebServlet(name = "PeriodoControl", urlPatterns = {"/PeriodoControl"})
public class PeriodoControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String opc = request.getParameter("opc") == null ? ""
                :request.getParameter("opc");
        PeriodoServicioInterface dao = null;
        CpPeriodo to = null;

        try {
            switch (opc) {
                case "A": //Reporte
                    System.out.println("____________1");
                    dao = new PeriodoServicioImpl();
                    request.getSession().setAttribute("reportePeriodo",
                            dao.listarAperturaPeriodoTodo());
                    response.sendRedirect("modulos/periodo/mainPeriodo.jsp");
                    break;
                case "B": //Reporte 
                    System.out.println("____________2");
                    response.sendRedirect("modulos/periodo/formPeriodo.jsp");
                    break;
                case "I":
                    System.out.println("____________3");
                    dao = new PeriodoServicioImpl();
                    to = new CpPeriodo();
                        to.setPeriodo(request.getParameter("id_periodo")==null?"":request.getParameter("id_periodo"));
                        to.setEstado(request.getParameter("id_estado")==null?"":request.getParameter("id_estado"));
                        to.setMulta(request.getParameter("id_multa")==null?"":request.getParameter("id_multa"));
                        to.setNumFalta(Integer.parseInt(request.getParameter("id_numfalta")==null?"0":request.getParameter("id_numfalta")));                    
                    dao.guardarAperturaPeriodo(to);
                    dao = new PeriodoServicioImpl();
                    request.getSession().setAttribute("reportePeriodo",
                            dao.listarAperturaPeriodoTodo());
                    response.sendRedirect("modulos/periodo/mainPeriodo.jsp");
                    break;
                case "D": //Reporte 
                    System.out.println("____________5");
                    dao=new PeriodoServicioImpl();
                    int idPeriodo= Integer.parseInt(request.getParameter("id"));
                    dao.eliminarAperturaPeriodo(idPeriodo);
                    dao = new PeriodoServicioImpl();
                    request.getSession().setAttribute("reportePeriodo",
                            dao.listarAperturaPeriodoTodo());
                    response.sendRedirect("modulos/periodo/mainPeriodo.jsp");
                    break;
                case "E":
                    System.out.println("____________6");
                    dao = new PeriodoServicioImpl();
                    to = (CpPeriodo) dao.buscarIdAperturaPeriodo(Integer.parseInt(request.getParameter("id")));
                    request.getSession().setAttribute("listaPeriodoById", to);
                    response.sendRedirect("modulos/periodo/formPeriodoEdit.jsp");
                    break;
                case "U":
                    System.out.println("____________7");
                    dao= new PeriodoServicioImpl();
                    to= new CpPeriodo();
                    if(request.getParameter("id")!=null){
                        to.setIdPeriodo(Integer.parseInt(request.getParameter("id")));
                        to.setPeriodo(request.getParameter("id_periodo"));
                        to.setEstado(request.getParameter("id_estado"));
                        to.setMulta(request.getParameter("id_multa"));
                        to.setNumFalta(Integer.parseInt(request.getParameter("id_numfalta")));  
                        dao.actualizarAperturaPeriodo(to);
                    }
                    dao = new PeriodoServicioImpl();
                    request.getSession().setAttribute("reportePeriodo",
                            dao.listarAperturaPeriodoTodo());
                    response.sendRedirect("modulos/periodo/mainPeriodo.jsp");
                    break;
                default:
                    dao = new PeriodoServicioImpl();

                    break;
            }

        } finally {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

