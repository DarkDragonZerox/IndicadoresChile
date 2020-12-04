package cl.desafiolatam.indicadoreschile.presenter;

import java.util.List;

import cl.desafiolatam.indicadoreschile.model.AllIndicadores;
import cl.desafiolatam.indicadoreschile.model.Indicador;
import cl.desafiolatam.indicadoreschile.model.PresenterRepositorio;
import cl.desafiolatam.indicadoreschile.model.Repositorio;

public class Presenter implements PresenterRepositorio {

    PresenterView view;
    Repositorio repositorio;

    public Presenter(PresenterView view, Repositorio repositorio) {
        this.view = view;
        this.repositorio = repositorio;
        repositorio.setPr(this);
        repositorio.loadinfo();

    }

    @Override
    public void showInfo(List<Indicador> listaIndicadores) {
        view.showInfo(listaIndicadores);

    }
}
