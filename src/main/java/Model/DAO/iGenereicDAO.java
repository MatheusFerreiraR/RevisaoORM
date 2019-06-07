/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.util.List;

/**
 *
 * @author Jece Xavier
 */
public interface iGenereicDAO<T> {
    
    void salvar(T objeto);
    
    T listUm(String pkName, int pkValue, Class clazz);
    
    List listTodos(Class clazz);
    
    void atualizar(T objeto);
    
    void deletar(T objeto);
}
