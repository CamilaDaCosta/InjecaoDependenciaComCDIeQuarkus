package com.camiladacosta.cepservice;

import com.camiladacosta.model.Endereco;

public interface CepService {
   Endereco buscaEndeco(String cep); 
}
