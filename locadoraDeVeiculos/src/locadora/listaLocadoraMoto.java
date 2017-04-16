package locadora;

public class listaLocadoraMoto {
	private noListaLocadoraMoto prim;

	public void criarListaM() {
		this.prim = null;
	}
	
	public void add(moto info){
		noListaLocadoraMoto novo=new noListaLocadoraMoto();
		novo.setInfoM(info);
		novo.setProxM(prim);
		prim=novo;
	}
	
	public void print(){
		for(noListaLocadoraMoto n=prim;n!=null;n=n.getProxM()){
			System.out.print(n.getInfoM().marca+n.getInfoM().modelo+"\n");		
		}
	}
	
	public boolean IsEmpty(){
		if(this.prim==null){
			return true;
		}
		else{
			return false;
		}
	}
	
    public void pesquisa(int cilindrada){
		for(noListaLocadoraMoto n=prim;n!=null;n=n.getProxM()){
			if(n.infoM.getCilindradaMoto()>=cilindrada){
				System.out.print(n.infoM.marca);
			}
		}
		
    }
	
    public void remover(locadora info){
    	noListaLocadoraMoto anterior=null;
    	noListaLocadoraMoto p=prim;
    	while(p != null && p.getInfoM() != info){
    	    anterior = p;
    		 p = p.getProxM();
    		 }
    	if(p == null){
    		return;
    		}
    	 if(anterior == null){
    	 prim = p.getProxM();
    	 }else{
    	anterior.setProxM(p.getProxM());
    	}
    }
    
    public void free(){
    	while (prim != null){
    		noListaLocadoraMoto temp = prim.getProxM();
    		 prim = null;
    		 prim = temp;
    		 }
    }

}
