package br.com.deguste.model.bo;

import java.io.Serializable;

import br.com.deguste.dao.GenericHibernateDAO;
import br.com.deguste.interfaces.HorarioBusiness;
import br.com.deguste.model.entity.HorarioFuncionario;

public class HorarioBO extends GenericHibernateDAO<HorarioFuncionario> implements Serializable, HorarioBusiness {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5380506142544104136L;
	
	
	
	public HorarioBO(){
		super(HorarioFuncionario.class);
	}
	@Override
	public HorarioFuncionario salvar(HorarioFuncionario horario){
		if(horario.getId() == null){
			super.create(horario);
		}
		else{
			super.update(horario);
		}
		return horario;
			
	}
}
