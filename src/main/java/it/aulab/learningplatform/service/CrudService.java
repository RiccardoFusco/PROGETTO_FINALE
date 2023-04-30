package it.aulab.learningplatform.service;

import java.util.List;
import java.util.Map;

public interface CrudService <Read, Create, Update, ID>{
    List<Read> readAll();
    List<Read> read(Map<String, String> params);
    Read readOne(ID id) throws Exception;
    Read create(Create createDTO);
    Read update(Update updateDTO) throws Exception;
    Read delete(ID id) throws Exception;


}
