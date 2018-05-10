package project.com.compromissoapp.Factory;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import project.com.compromissoapp.DAO.CompromissoDAO;

/**
 * Created by User on 09/05/2018.
 */

public abstract class AppDatabase extends RoomDatabase {
    public abstract CompromissoDAO lemb();
    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context){
        return INSTANCE == null ? INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                AppDatabase.class, "compromisso_db").fallbackToDestructiveMigration().build() : INSTANCE;
    }

    public static void setINSTANCE(AppDatabase INSTANCE){ AppDatabase.INSTANCE = INSTANCE; }

}
