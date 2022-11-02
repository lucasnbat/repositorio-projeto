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
public void  pesquisar (long chave){
	for (int i = 0; i<=nElementos-1;i++){
		if (vetor[i] == chave){
			System.out.println(vetor[i]);
                }
        }
}
public void imprimir(){
	for (int i = 0; i<nElementos-1; i++){
        	System.out.println(vetor[i] + " ");
        }
}
public boolean apagar (long elemento){
	int j;
	for (j = 0; j < nElementos; j++){
		if (elemento == vetor[j]){
			break;
		}
	}
	if (j == nElementos){
		return false;
	}else{
		for (int k = j; k < nElementos; k++){ 
			vetor[k] = vetor[k + 1];
		}
		nElementos--; 
		return true;
	}
}
}
