package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.requests.programminglanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.programminglanguage.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;


    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> languagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();
        for(ProgrammingLanguage language:languages){
            GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            languagesResponses.add(responseItem);
        }
        return languagesResponses;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.setName(createProgrammingLanguageRequest.getName());
        if(language.getName().isEmpty()){
            throw new Exception("Programlama dili boş geçilemez.");
        }
        for(GetAllProgrammingLanguagesResponse pLanguage:getAll()){
            if(createProgrammingLanguageRequest.getName().equals(pLanguage.getName())){
                throw new Exception("Programlama dili tekrar edemez");
            }
            this.programmingLanguageRepository.save(language);
        }

    }


}
