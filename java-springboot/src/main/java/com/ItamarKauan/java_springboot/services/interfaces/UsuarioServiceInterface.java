package com.itamarkauan.java_springboot.services.interfaces;



import java.util.List;

import com.itamarkauan.java_springboot.dtos.UsuarioDto;



public interface UsuarioServiceInterface {
 
  UsuarioDto salvar(UsuarioDto user);

  List<UsuarioDto> listar();
  
}