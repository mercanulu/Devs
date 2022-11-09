package Kodlama.io.Devs.dataAccess.abstracts;
import Kodlama.io.Devs.entities.concretes.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubTechnologyRepository<T> extends JpaRepository<SubTechnology,Integer> {
}
