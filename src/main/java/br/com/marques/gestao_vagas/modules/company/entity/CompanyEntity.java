package br.com.marques.gestao_vagas.modules.company.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "company")
@Data
public class CompanyEntity {

  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
  private UUID id;

  private String name;
  @Pattern(regexp = "\\S+", message = "O nome de username não deve conter apenas espaços em branco")
  private String username;
  @Email(message = "O campo de e-mail deve ser um endereço de e-mail válido")
  private String email;
  @Length(min = 6, max = 100, message = "A senha deve ter no mínimo 6 caracteres")
  private String password;
  private String website;
  private String description;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
