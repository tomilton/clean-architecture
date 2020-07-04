
package com.despacho.core.external;

import com.despacho.entidades.Muelle;

public interface RepositorioMuelles {

	public void adicionarMuelle(Muelle muelle);

	public Muelle obtener(Muelle muelle);

	public void reemplazar(Muelle muelle);

}
