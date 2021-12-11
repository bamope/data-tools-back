
import com.trasnporte.company.demo.datajpa.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trasnporte.company.demo.datajpa.Company;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @PostMapping("/companys")
    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
        try {
            Company _company = companyRepository
                    .save(new Company(company.getTipEmpresa(),
                            company.getNitEmpresa(),
                            company.getNomEmpresa(),
                            company.getDirEmpresa(),
                            company.getCodCiudad(),
                            company.getCodDepartamento(),
                            company.getCodPais(),
                            company.getTelEmpresa()
                    )
                    );
            return new ResponseEntity<>(_company, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
