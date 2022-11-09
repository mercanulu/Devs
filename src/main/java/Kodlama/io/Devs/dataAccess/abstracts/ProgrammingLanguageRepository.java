package Kodlama.io.Devs.dataAccess.abstracts;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProgrammingLanguageRepository<T> extends JpaRepository<ProgrammingLanguage, Integer> {

}
