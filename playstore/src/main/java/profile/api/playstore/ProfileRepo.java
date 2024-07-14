package profile.api.playstore;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepo extends JpaRepository<ProfileEntity,Integer> {
    List<ProfileEntity> findAllByAppId(int appId);
}
