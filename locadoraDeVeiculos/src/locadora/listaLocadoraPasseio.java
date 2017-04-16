package locadora;

public class listaLocadoraPasseio {
		private noListaLocadoraPasseio prim;

		public void criarListaP() {
			this.prim = null;
		}
		
		public void add(passeio info){
			noListaLocadoraPasseio novo=new noListaLocadoraPasseio();
			novo.setInfoP(info);
			novo.setProxP(prim);
			prim=novo;
		}
		
		public void print(){
			for(noListaLocadoraPasseio n=prim;n!=null;n=n.getProxP()){
				System.out.print(n.getInfoP().marca+n.getInfoP().modelo+"\n");		
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
		
	    public noListaLocadoraPasseio pesquisa(int lugares){
			for(noListaLocadoraPasseio n=prim;n!=null;n=n.getProxP()){
				if(n.infoP.getNúmeroDePassageiros()==lugares){
					return n;
				}
			}
			return null;
	    }
		
	    public void remover(passeio info){
	    	noListaLocadoraPasseio anterior=null;
	    	noListaLocadoraPasseio p=prim;
	    	while(p != null && p.getInfoP() != info){
	    	    anterior = p;
	    		 p = p.getProxP();
	    		 }
	    	if(p == null){
	    		return;
	    		}
	    	 if(anterior == null){
	    	 prim = p.getProxP();
	    	 }else{
	    	anterior.setProxP(p.getProxP());
	    	}
	    }
	    
	    public void free(){
	    	while (prim != null){
	    		noListaLocadoraPasseio temp = prim.getProxP();
	    		 prim = null;
	    		 prim = temp;
	    		 }
	    }

	}



