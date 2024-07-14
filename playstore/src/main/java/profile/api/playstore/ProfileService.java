package profile.api.playstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfileService {
    @Autowired
    ProfileRepo remote;

    // to get all the app
    public List<ProfileEntity> implementFindAll() {
        return remote.findAll();
    }

// post the value to db

    public ProfileEntity implementSave(ProfileEntity details) {
        return remote.save(details);
    }
    // UPDATE based on appid
    public ProfileEntity implementFindById(int profileId) {
        return remote.findById(profileId).orElse(new ProfileEntity());
    }
    public List<ProfileEntity> implementFindApp(int appId) {
        return remote.findAllByAppId(appId);
    }

}
