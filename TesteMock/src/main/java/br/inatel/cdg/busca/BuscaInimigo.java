package br.inatel.cdg.busca;

import br.inatel.cdg.model.Inimigo;
import br.inatel.cdg.service.InimigoService;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {

    InimigoService inimigoService;

    public BuscaInimigo(InimigoService inimigoService) {
        this.inimigoService = inimigoService;
    }

    public Inimigo buscaInimigo(int id) {
        String inimigoJson = inimigoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();

        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }

    public boolean verificaArrayListExistente(int id){
        boolean inimigoExistente = inimigoService.inimigoExistente(id);

        if (inimigoExistente){
            return true;
        }else{
            return false;
        }
    }
}
