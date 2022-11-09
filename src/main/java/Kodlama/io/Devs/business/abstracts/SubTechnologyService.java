package Kodlama.io.Devs.business.abstracts;
import Kodlama.io.Devs.business.requests.subtechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subtechnology.GetAllSubTechnologiesResponse;
import java.util.List;


public interface SubTechnologyService {
    List<GetAllSubTechnologiesResponse> getAll();
    void add(CreateSubTechnologyRequest createSubTechnologyRequest);
}
