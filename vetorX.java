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
	for (i = 0; i <= nElementos - 1; i++) { //percorre todo o vetor
		if (vetor[i] == chave) { //caso encontre o elemento desejado
			System.out.print("Retorno da pesquisa=" + vetor[i]); //retorna essa mensagem e para
			break;
		}
	}
	if (i == nElementos) { //se percorreu tudo e não encontrou
		System.out.print("Retorno da pesquisa= não encontrado");//retorna essa mensagem	
	}
}
public void imprimir(){ //metodo basico que usa i para percorrer o vaetor e ir imprimindo os elementos todos em uma linha, espaçados
	for (int i = 0; i<nElementos; i++){
        	System.out.print(vetor[i] + " ");
        }
}
public boolean apagar(long elemento) {
	int j;
	for (j = 0; j < nElementos-1; j++) {
		if (elemento == vetor[j]) { //usa variavel j para percorrer o vetor até achar o elemento desejado
			break; //caso encontrar, pare e vai para proxima linha
		}
	}
	if (j == nElementos) { //se percorrer tudo e não encontrar,
		return false; //retorna false
	} else { //se encontrou...
		for (int k = j; k < nElementos-1; k++) { //vai pegar o proximo elemento e puxar para o indice anterior de forma a sobrepor o elem.
			vetor[k] = vetor[k + 1];
		}
		nElementos--; //numero de elementos é reduzido
		return true; //retorna true
	}
}
public int getTamanho() { //retorna o tamanho do vetor usando o .length do java
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


