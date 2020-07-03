
package co.com.lineadirecta.despacho.core.external;

import co.com.lineadirecta.entidades.Muelle;

public interface RepositorioMuelles {

	public void adicionarMuelle(Muelle muelle);

	public Muelle obtener(Muelle muelle);

	public void reemplazar(Muelle muelle);

}
