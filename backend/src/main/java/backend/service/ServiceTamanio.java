package backend.service;

import backend.dao.TamanioDao;
import backend.entities.chocolates.Tamanio.Tamanio;
import backend.runner.Runner;

import java.util.List;

public class ServiceTamanio {

    private TamanioDao tamanioDao;

    public ServiceTamanio() {
        this.tamanioDao = new TamanioDao();
    }

    public void guardar(Tamanio tamanio) {
        Runner.runInSession(() -> {

            this.tamanioDao.guardar(tamanio);
            return null;
        });
    }

    public Tamanio recuperar(Integer id){
        return Runner.runInSession(() -> {
            return this.tamanioDao.recuperar(id);
        });
    }

    public List<Tamanio> recuperarTodos(){
        return Runner.runInSession(() -> {
            return this.tamanioDao.recuperarTodos();
        });
    }


}
