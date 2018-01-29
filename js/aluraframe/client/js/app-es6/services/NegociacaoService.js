import { HttpService } from './HttpService';
import { ConnectionFactory } from './ConnectionFactory';
import { NegociacaoDao } from '../daos/NegociacaoDao';
import { Negociacao } from '../models/Negociacao';

export class NegociacaoService {

    constructor() {
        this._http = new HttpService();
    }

    cadastra(negociacao) {
        return ConnectionFactory
            .getConnection()
            .then(connection => new NegociacaoDao(connection))
            .then(dao => dao.adiciona(negociacao).then(() => 'Negociação adicionada com sucesso'))
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível adicionar a negociação')
            });
    }

    lista() {
        return ConnectionFactory
            .getConnection()
            .then(connection => new NegociacaoDao(connection))
            .then(dao => dao.listaTodos())
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível obter as negociações')
            });
    }

    apaga() {
        return ConnectionFactory
            .getConnection()
            .then(connection => new NegociacaoDao(connection))
            .then(dao => dao.apagaTodos())
            .then(() => 'Negociações apagadas com sucesso')
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível apagar as negociações')
            });
    }

    importa(listaAtual) {
        return this._obterNegociacoes()
            .then(negociacoes => negociacoes.filter(negociacao =>
                !listaAtual.some(existente => existente.isEquals(negociacao))))
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível buscar negociações para importa')
            });
    }

    _obterNegociacoes() {
        return Promise.all([
            this._obterNegociacoesDaSemana(),
            this._obterNegociacoesDaSemanaAnterior(),
            this._obterNegociacoesDaSemanaRetrasada()
        ]).then(periodos => {
            return periodos.reduce((dados, periodo) => dados.concat(periodo), []);
        }).catch(erro => {
            throw new Error(erro);
        });
    }

    _obterNegociacoesDaSemana() {
        return this._http
            .get('negociacoes/semana')
            .then(negociacoes => {
                return negociacoes.map(objeto => new Negociacao(new Date(objeto.data), objeto.quantidade, objeto.valor));
            })
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível obter as negociações da semana.');
            });
    }

    _obterNegociacoesDaSemanaAnterior() {
        return this._http
            .get('negociacoes/anterior')
            .then(negociacoes => {
                return negociacoes.map(objeto => new Negociacao(new Date(objeto.data), objeto.quantidade, objeto.valor));
            })
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível obter as negociações da semana anterior.');
            });
    }

    _obterNegociacoesDaSemanaRetrasada() {
        return this._http
            .get('negociacoes/retrasada')
            .then(negociacoes => {
                return negociacoes.map(objeto => new Negociacao(new Date(objeto.data), objeto.quantidade, objeto.valor));
            })
            .catch(erro => {
                console.log(erro);
                throw new Error('Não foi possível obter as negociações da semana retrasada.');
            });
    }
}