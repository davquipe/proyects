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
import pe.edu.upeu.modelo.CpUsuario;
import pe.edu.upeu.servicio.UsuarioServicioImpl;
import pe.edu.upeu.servicio.UsuarioServicioInterface;

/**
 *
 * @author MIGUEL
 */
@WebServlet(name = "UsuarioControl", urlPatterns = {"/UsuarioControl"})
public class UsuarioControl extends HttpServlet {

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
        UsuarioServicioInterface dao = null;
        CpUsuario to = null;

        try {
            switch (opc) {
                case "A": //Reporte
                    System.out.println("____________1");
                    dao = new UsuarioServicioImpl();
                    request.getSession().setAttribute("reporteUsuario",
                            dao.listarAperturaUsuarioTodo());
                    response.sendRedirect("modulos/usuario/mainUsuario.jsp");
                    break;
                case "B": //Reporte 
                    System.out.println("____________2");
                    response.sendRedirect("modulos/usuario/formUsuario.jsp");
                    break;
                case "I":
                    System.out.println("____________3");
                    dao = new UsuarioServicioImpl();
                    to = new CpUsuario();
                        to.setUsuario(request.getParameter("id_Usuario")==null?"":request.getParameter("id_Usuario"));
                        to.setNombre(request.getParameter("id_Usuario")==null?"":request.getParameter("id_Usuario"));
                        to.setApellidos(request.getParameter("id_Usuario")==null?"":request.getParameter("id_Apellidos"));
                        to.setEstado(request.getParameter("id_estado")==null?"":request.getParameter("id_estado"));
                                           
                    dao.guardarAperturaUsuario(to);
                    dao = new UsuarioServicioImpl();
                    request.getSession().setAttribute("reporteUsuario",
                            dao.listarAperturaUsuarioTodo());
                    response.sendRedirect("modulos/usuario/mainUsuario.jsp");
                    break;
                case "D": //Reporte 
                    System.out.println("____________5");
                    dao=new UsuarioServicioImpl();
                    int idUsuario= Integer.parseInt(request.getParameter("id"));
                    dao.eliminarAperturaUsuario(idUsuario);
                    dao = new UsuarioServicioImpl();
                    request.getSession().setAttribute("reporteUsuario",
                            dao.listarAperturaUsuarioTodo());
                    response.sendRedirect("modulos/usuario/mainUsuario.jsp");
                    break;
                case "E":
                    System.out.println("____________6");
                    dao = new UsuarioServicioImpl();
                    to = (CpUsuario) dao.buscarIdAperturaUsuario(Integer.parseInt(request.getParameter("id")));
                    request.getSession().setAttribute("listaUsuarioById", to);
                    response.sendRedirect("modulos/usuario/formUsuarioEdit.jsp");
                    break;
                case "U":
                    System.out.println("____________7");
                    dao= new UsuarioServicioImpl();
                    to= new CpUsuario();
                    if(request.getParameter("id")!=null){
                        to.setIdUsuario(Integer.parseInt(request.getParameter("id")));
                        to.setUsuario(request.getParameter("id_usuario"));
                        to.setNombre(request.getParameter("id_nombre"));
                        to.setApellidos(request.getParameter("id_apellidos"));
                        to.setEstado(request.getParameter("id_estado"));
                        
                          
                        dao.actualizarAperturaUsuario(to);
                    }
                    dao = new UsuarioServicioImpl();
                    request.getSession().setAttribute("reporteUsuario",
                            dao.listarAperturaUsuarioTodo());
                    response.sendRedirect("modulos/usuario/mainUsuario.jsp");
                    break;
                default:
                    dao = new UsuarioServicioImpl();

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

