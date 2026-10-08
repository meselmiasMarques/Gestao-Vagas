package br.com.marques.gestao_vagas.modules.company.repositories;

import br.com.marques.gestao_vagas.modules.company.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID>
{

}
