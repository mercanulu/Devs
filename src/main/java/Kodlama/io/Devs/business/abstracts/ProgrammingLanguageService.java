package Kodlama.io.Devs.business.abstracts;
import Kodlama.io.Devs.business.requests.programminglanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.programminglanguage.GetAllProgrammingLanguagesResponse;
import java.util.List;


public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguagesResponse> getAll();
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception;
}
