class VetorX { //declaracao de atributos da classe vetor X
	private long []vetor; 
	private int nElementos;

public VetorX (int tamanho){
	vetor = new long[tamanho]; //instancia novo vetor que...
	nElementos = 0; //tem 0 elementos
}

public void inserir (long  elemento){
	vetor[nElementos] = elemento;//elemento novo é recebido no espaço disponivel no vetor modelado via nElementos
	nElementos++;//nElementos é incrementado para que o proximo elemento seja add no proximo indice do vetor.
}
public void pesquisar(long chave) {
	int i;
	for (i = 0; i <= nElementos - 1; i++) {
		if (vetor[i] == chave) {
			System.out.print("Retorno da pesquisa=" + vetor[i]);
			break;
		}
	}
	if (i == nElementos) {
		System.out.print("Retorno da pesquisa= não encontrado");	
	}
}
public void imprimir(){
	for (int i = 0; i<nElementos; i++){
        	System.out.print(vetor[i] + " ");
        }
}
public boolean apagar(long elemento) {
	int j;
	for (j = 0; j < nElementos-1; j++) {
		if (elemento == vetor[j]) {
			break;
		}
	}
	if (j == nElementos) {
		return false;
	} else {
		for (int k = j; k < nElementos-1; k++) {
			vetor[k] = vetor[k + 1];
		}
		nElementos--;
		return true;
	}
}
public int getTamanho() {
	return vetor.length;
}
}
//----------------------------------------------------------
//Inicio de classe App para testes
class VetorXApp{
	public static void main(String[] args){
	VetorX vetor = new VetorX(10);
	for (int i = 0; i< vetor.getTamanho(); i++){
		vetor.inserir(i);
	}
	vetor.imprimir();
	System.out.println("");
	vetor.pesquisar(3);
	vetor.apagar(3);
	System.out.println("");
	vetor.imprimir();
}
}

//melhorar para gettamanho
//fazer a juncao dos commits com rebase
