package com.fcid.previred.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fcid.previred.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	Empresa findByRazonSocialIgnoreCase(String razonSocial);

}
