package locadora;

public class listaLocadoraCarga {
	
		private noListaLocadoraCarga prim;

		public void criarListaP() {
			this.prim = null;
		}
		
		public void add(carga info){
			noListaLocadoraCarga novo=new noListaLocadoraCarga();
			novo.setInfoC(info);
			novo.setProxC(prim);
			prim=novo;
		}
		
		public void print(){
			for(noListaLocadoraCarga n=prim;n!=null;n=n.getProxC()){
				System.out.print(n.getInfoC().marca+n.getInfoC().modelo+"\n");		
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
		
	    public noListaLocadoraCarga pesquisa(int carga){
			for(noListaLocadoraCarga n=prim;n!=null;n=n.getProxC()){
				if(n.infoC.getCapacidadeDeCarga()==carga){
					return n;
				}
			}
			return null;
	    }
		
	    public void remover(carga info){
	    	noListaLocadoraCarga anterior=null;
	    	noListaLocadoraCarga p=prim;
	    	while(p != null && p.getInfoC() != info){
	    	    anterior = p;
	    		 p = p.getProxC();
	    		 }
	    	if(p == null){
	    		return;
	    		}
	    	 if(anterior == null){
	    	 prim = p.getProxC();
	    	 }else{
	    	anterior.setProxC(p.getProxC());
	    	}
	    }
	    
	    public void free(){
	    	while (prim != null){
	    		noListaLocadoraCarga temp = prim.getProxC();
	    		 prim = null;
	    		 prim = temp;
	    		 }
	    }

	}
