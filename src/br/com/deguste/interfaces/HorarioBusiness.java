package br.com.deguste.interfaces;

import br.com.deguste.dao.IGenericDAO;
import br.com.deguste.model.entity.HorarioFuncionario;

public interface HorarioBusiness extends IGenericDAO<HorarioFuncionario> {
	
	public HorarioFuncionario salvar(HorarioFuncionario horario);

}
