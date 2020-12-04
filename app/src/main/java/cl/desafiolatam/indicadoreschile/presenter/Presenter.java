package cl.desafiolatam.indicadoreschile.presenter;

import cl.desafiolatam.indicadoreschile.model.AllIndicadores;
import cl.desafiolatam.indicadoreschile.model.Indicador;
import cl.desafiolatam.indicadoreschile.model.Repositorio;

public class Presenter {

    PresenterView view;
    Repositorio repositorio;

    public Presenter(PresenterView view, Repositorio repositorio) {
        this.view = view;
        this.repositorio = repositorio;
    }

}
