package backend.service;

import backend.dao.FormaDao;
import backend.entities.chocolates.Forma.Forma;
import backend.runner.Runner;

import java.util.List;

public class ServiceForma {
    private FormaDao formaDao;

    public ServiceForma() {
        this.formaDao = new FormaDao();
    }

    public void guardar(Forma forma) {
        Runner.runInSession(() -> {

            this.formaDao.guardar(forma);
            return null;
        });
    }

    public Forma recuperar(Integer id){
        return Runner.runInSession(() -> {
            return this.formaDao.recuperar(id);
        });
    }

    public List<Forma> recuperarTodos(){
        return Runner.runInSession(() -> {
            return this.formaDao.recuperarTodos();
        });
    }
}
