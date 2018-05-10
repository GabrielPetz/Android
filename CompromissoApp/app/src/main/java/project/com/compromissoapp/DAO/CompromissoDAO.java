package project.com.compromissoapp.DAO;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.support.annotation.NonNull;
import project.com.compromissoapp.Model.Compromisso;
import java.time.LocalDate;
import java.util.List;


/**
 * Created by User on 09/05/2018.
 */

public interface CompromissoDAO {

    @Query("SELECT * FROM compromisso_db")
    List<Compromisso> getCompromissos();

    @Query("SELECT * FROM compromisso_db WHERE status = 1")
    List<Compromisso> getOpenCompromissos();

    @Query("SELECT * FROM compromisso_db WHERE status = 0")
    List<Compromisso> getCloseCompromissos();


    @Query("SELECT * FROM Compromisso_db WHERE dataCompromisso IN (:data)")
    List<Compromisso> getCompromissosData(LocalDate data);

    @Insert
    void insertAll(@NonNull Compromisso... lemb);

    @Insert
    void newLemtebrete(Compromisso lemb);


    @Query("DELETE FROM Compromisso_db WHERE idCompromisso IN (:id)")
    int deleteCompromissoId(Integer id);

    @Query("DELETE FROM Compromisso_db WHERE dataCompromisso IN (:data)")
    int deleteCompromissosConcluidos(LocalDate data);


    @Query("UPDATE compromisso_db SET status = 0 WHERE idCompromisso IN (:id) ")
    int setConcluido(Integer id);

    @Update
    int updateCompromisso(Compromisso comp);

}
