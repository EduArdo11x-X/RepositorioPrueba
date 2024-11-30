/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;
import sw.Funciones;
import sw.Funciones_Service;
import sw.Usuario;
import sw.UsuarioRol;


/**
 *
 * @author 59398
 */
public class TestWS {

    public static void main(String[] args) {

        Funciones_Service servicio = new Funciones_Service();
        Funciones servicios = servicio.getFuncionesPort();
          List<UsuarioRol> listaUsuarioRol=servicios.validarDatos("admin", "q4kj");
//         List<UsuarioRol>listaUsuarioRol=u.getListaRolesUsuario();
        for (UsuarioRol usuarioRol : listaUsuarioRol) {
            System.out.println(usuarioRol.getIdRol().getRol());
        }
             
                      
    }
}
