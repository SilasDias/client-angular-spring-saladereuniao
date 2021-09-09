package dias.silas.crud.salasdereuniao.repository;

import dias.silas.crud.salasdereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
