package backend.service;

import backend.dao.TipoChocolateDao;
import backend.entities.chocolates.TipoChocolate.TipoChocolate;
import backend.runner.Runner;

import java.util.List;

public class ServiceTipoChocolate {
    private  TipoChocolateDao tipoChocolateDao;

    public ServiceTipoChocolate() {
        this.tipoChocolateDao = new TipoChocolateDao();
    }

    public void guardar(TipoChocolate tipoChocolate) {
        Runner.runInSession(() -> {

            this.tipoChocolateDao.guardar(tipoChocolate);
            return null;
        });
    }

    public TipoChocolate recuperar(Integer id){
        return Runner.runInSession(() -> {
            return this.tipoChocolateDao.recuperar(id);
        });
    }

    public List<TipoChocolate> recuperarTodos(){
        return Runner.runInSession(() -> {
            return this.tipoChocolateDao.recuperarTodos();
        });
    }
}
