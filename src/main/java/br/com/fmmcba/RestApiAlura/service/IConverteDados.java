package br.com.fmmcba.RestApiAlura.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
