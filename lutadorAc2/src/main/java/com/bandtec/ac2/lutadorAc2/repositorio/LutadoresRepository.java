package com.bandtec.ac2.lutadorAc2.repositorio;

import com.bandtec.ac2.lutadorAc2.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadoresRepository extends JpaRepository<Lutador, Integer> {

    List<Lutador> findByVivo(boolean vivo);

}
