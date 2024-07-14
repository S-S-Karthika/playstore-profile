package profile.api.playstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Profile")

public class ProfileController {
    @Autowired
    ProfileService service;

    @GetMapping("/")
    public List<ProfileEntity> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/")
    public ProfileEntity ip(@RequestBody ProfileEntity details){
        return service.implementSave(details);
    }


    @PutMapping("/")
    public ProfileEntity progress(@PathVariable("profileId") int profileId){
        return service.implementFindById(profileId);
    }

    @GetMapping("/byApp/{appId}")
    public List<ProfileEntity> callByExecutive(@PathVariable("appId") int appId){
        return service.implementFindApp(appId);
    }
}
